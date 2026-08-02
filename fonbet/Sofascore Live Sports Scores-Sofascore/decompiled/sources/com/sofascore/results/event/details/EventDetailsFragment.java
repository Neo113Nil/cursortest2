package com.sofascore.results.event.details;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.L6;
import com.sofascore.model.Colors;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventHeadFlags;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.model.newNetwork.EventGraphPoint;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.LiveStreamHighlightItem;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.TeamForm;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.mmastatistics.view.MmaStatsHeadDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsLegsDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsTorsoDualView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.ProfileDetailsActivity;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a70;
import defpackage.afi;
import defpackage.as9;
import defpackage.au7;
import defpackage.ay5;
import defpackage.baf;
import defpackage.bhi;
import defpackage.bld;
import defpackage.bu1;
import defpackage.c4f;
import defpackage.c68;
import defpackage.ccd;
import defpackage.cd5;
import defpackage.ce;
import defpackage.ce4;
import defpackage.csk;
import defpackage.cu1;
import defpackage.d46;
import defpackage.d66;
import defpackage.d68;
import defpackage.de;
import defpackage.dla;
import defpackage.dq9;
import defpackage.dsi;
import defpackage.duf;
import defpackage.dz5;
import defpackage.e6b;
import defpackage.e91;
import defpackage.ede;
import defpackage.eoh;
import defpackage.eqc;
import defpackage.ez0;
import defpackage.ez5;
import defpackage.f08;
import defpackage.f8h;
import defpackage.fuf;
import defpackage.fv;
import defpackage.fy5;
import defpackage.fz8;
import defpackage.g5j;
import defpackage.g7;
import defpackage.geb;
import defpackage.go1;
import defpackage.gv9;
import defpackage.gx5;
import defpackage.gy4;
import defpackage.h08;
import defpackage.h4;
import defpackage.h84;
import defpackage.haa;
import defpackage.hq4;
import defpackage.hs1;
import defpackage.hs4;
import defpackage.hta;
import defpackage.hx5;
import defpackage.hy4;
import defpackage.i0;
import defpackage.ia0;
import defpackage.ic6;
import defpackage.ii5;
import defpackage.ilc;
import defpackage.iqc;
import defpackage.iuh;
import defpackage.ix5;
import defpackage.iy5;
import defpackage.iz2;
import defpackage.j63;
import defpackage.ji5;
import defpackage.jle;
import defpackage.joa;
import defpackage.jpe;
import defpackage.jqc;
import defpackage.jx5;
import defpackage.k0;
import defpackage.k13;
import defpackage.k3;
import defpackage.k3k;
import defpackage.ke0;
import defpackage.km5;
import defpackage.kqc;
import defpackage.krk;
import defpackage.ksc;
import defpackage.kv;
import defpackage.kv7;
import defpackage.kxk;
import defpackage.ky5;
import defpackage.kz3;
import defpackage.l8;
import defpackage.lec;
import defpackage.ljg;
import defpackage.lmj;
import defpackage.lxk;
import defpackage.me4;
import defpackage.me9;
import defpackage.mq5;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.my5;
import defpackage.n1k;
import defpackage.n4c;
import defpackage.n6j;
import defpackage.n9e;
import defpackage.na9;
import defpackage.nq8;
import defpackage.nv;
import defpackage.nx5;
import defpackage.ny;
import defpackage.ny5;
import defpackage.o02;
import defpackage.o3a;
import defpackage.o8;
import defpackage.od5;
import defpackage.ok3;
import defpackage.om1;
import defpackage.on1;
import defpackage.oq5;
import defpackage.ote;
import defpackage.otk;
import defpackage.ox5;
import defpackage.p24;
import defpackage.p6j;
import defpackage.pa9;
import defpackage.ph0;
import defpackage.pn2;
import defpackage.pu7;
import defpackage.qa9;
import defpackage.qea;
import defpackage.r1;
import defpackage.r63;
import defpackage.ra9;
import defpackage.rdf;
import defpackage.rh;
import defpackage.rld;
import defpackage.rq3;
import defpackage.s5j;
import defpackage.sa9;
import defpackage.ta9;
import defpackage.tc3;
import defpackage.tgj;
import defpackage.tnb;
import defpackage.tte;
import defpackage.tu7;
import defpackage.u4g;
import defpackage.u6b;
import defpackage.ua9;
import defpackage.un0;
import defpackage.ute;
import defpackage.v5f;
import defpackage.v9g;
import defpackage.vb6;
import defpackage.vn6;
import defpackage.vte;
import defpackage.w04;
import defpackage.w3f;
import defpackage.wca;
import defpackage.wm1;
import defpackage.wsi;
import defpackage.wx5;
import defpackage.wxf;
import defpackage.wye;
import defpackage.wyh;
import defpackage.x2g;
import defpackage.xe6;
import defpackage.xk4;
import defpackage.xt;
import defpackage.xvb;
import defpackage.xw3;
import defpackage.xw5;
import defpackage.xx5;
import defpackage.y5f;
import defpackage.yaa;
import defpackage.yfa;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.ysi;
import defpackage.yx5;
import defpackage.yy5;
import defpackage.yy9;
import defpackage.z06;
import defpackage.z1;
import defpackage.z45;
import defpackage.z5f;
import defpackage.z8e;
import defpackage.zl;
import defpackage.zsi;
import defpackage.zu3;
import defpackage.zx5;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/details/EventDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lhy4;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventDetailsFragment extends Hilt_EventDetailsFragment<hy4> {
    public static int U0;
    public final otk A;
    public final joa A0;
    public final otk B;
    public final joa B0;
    public final otk C;
    public final joa C0;
    public g7 D;
    public final joa D0;
    public w3f E;
    public final joa E0;
    public boolean F;
    public final joa F0;
    public boolean G;
    public final joa G0;
    public boolean H;
    public final joa H0;
    public final joa I;
    public final joa I0;
    public final mqi J;
    public final joa J0;
    public ua9 K;
    public final de K0;
    public final joa L;
    public final de L0;
    public final joa M;
    public final de M0;
    public final mqi N;
    public final joa N0;
    public final joa O;
    public final joa O0;
    public final joa P;
    public final joa P0;
    public final joa Q;
    public final joa Q0;
    public final joa R;
    public final joa R0;
    public final joa S;
    public final joa S0;
    public final joa T;
    public final joa T0;
    public final joa U;
    public final joa V;
    public final joa W;
    public final joa X;
    public final joa Y;
    public final joa Z;
    public final joa a0;
    public final joa b0;
    public final joa c0;
    public final joa d0;
    public final joa e0;
    public final joa f0;
    public final joa g0;
    public final joa h0;
    public final joa i0;
    public final joa j0;
    public final joa k0;
    public final joa l0;
    public final joa m0;
    public final joa n0;
    public final joa o0;
    public final joa p0;
    public final joa q0;
    public boolean r;
    public final joa r0;
    public boolean s;
    public final joa s0;
    public final int t = ke0.c;
    public final joa t0;
    public MenuItem u;
    public final joa u0;
    public final joa v;
    public final joa v0;
    public final otk w;
    public final joa w0;
    public final otk x;
    public final joa x0;
    public final otk y;
    public final joa y0;
    public final otk z;
    public final joa z0;

    public EventDetailsFragment() {
        final int i = 0;
        hx5 hx5Var = new hx5(this, i);
        ysa ysaVar = ysa.c;
        this.v = ypa.a(ysaVar, hx5Var);
        fuf fufVar = duf.a;
        final int i2 = 5;
        this.w = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new yx5(this, 3), new yx5(this, i2), new yx5(this, 4));
        this.x = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new yx5(this, 6), new yx5(this, 8), new yx5(this, 7));
        final int i3 = 27;
        joa a = ypa.a(ysaVar, new j63(new yx5(this, 13), i3));
        final int i4 = 29;
        int i5 = 2;
        this.y = new otk(fufVar.getOrCreateKotlinClass(dz5.class), new p24(a, 29), new zx5(this, a, i5), new ay5(a, 0));
        final int i6 = 28;
        joa a2 = ypa.a(ysaVar, new j63(new yx5(this, 14), i6));
        final int i7 = 1;
        this.z = new otk(fufVar.getOrCreateKotlinClass(tu7.class), new ay5(a2, 1), new zx5(this, a2, i), new ay5(a2, 2));
        final int i8 = 10;
        this.A = new otk(fufVar.getOrCreateKotlinClass(u4g.class), new yx5(this, 9), new yx5(this, 11), new yx5(this, i8));
        this.B = new otk(fufVar.getOrCreateKotlinClass(d46.class), new yx5(this, i), new yx5(this, i5), new yx5(this, i7));
        final int i9 = 12;
        final int i10 = 26;
        joa a3 = ypa.a(ysaVar, new j63(new yx5(this, i9), i10));
        this.C = new otk(fufVar.getOrCreateKotlinClass(jqc.class), new p24(a3, 27), new zx5(this, a3, i7), new p24(a3, 28));
        final int i11 = 23;
        this.I = n9e.M(new ox5(this, i8), new ox5(this, i11));
        this.J = ypa.b(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i12 = i2;
                int i13 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i12) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3 = eventDetailsFragment.requireContext();
                                requireContext3.getClass();
                                return new om0(requireContext3);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32 = eventDetailsFragment.requireContext();
                                requireContext32.getClass();
                                return new om0(requireContext32);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5 = eventDetailsFragment.requireContext();
                                requireContext5.getClass();
                                es1 es1Var = new es1(requireContext5);
                                o8.d(es1Var, 0, 7);
                                return es1Var;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52 = eventDetailsFragment.requireContext();
                                requireContext52.getClass();
                                es1 es1Var2 = new es1(requireContext52);
                                o8.d(es1Var2, 0, 7);
                                return es1Var2;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i14 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i14) && !zu3.z.hasMcc(Integer.valueOf(i14)) && !zu3.V.hasMcc(Integer.valueOf(i14)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i13));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i12 = 17;
        this.L = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i12;
                int i13 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32 = eventDetailsFragment.requireContext();
                                requireContext32.getClass();
                                return new om0(requireContext32);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322 = eventDetailsFragment.requireContext();
                                requireContext322.getClass();
                                return new om0(requireContext322);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52 = eventDetailsFragment.requireContext();
                                requireContext52.getClass();
                                es1 es1Var2 = new es1(requireContext52);
                                o8.d(es1Var2, 0, 7);
                                return es1Var2;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522 = eventDetailsFragment.requireContext();
                                requireContext522.getClass();
                                es1 es1Var22 = new es1(requireContext522);
                                o8.d(es1Var22, 0, 7);
                                return es1Var22;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i14 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i14) && !zu3.z.hasMcc(Integer.valueOf(i14)) && !zu3.V.hasMcc(Integer.valueOf(i14)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i13));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i4;
                int i13 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322 = eventDetailsFragment.requireContext();
                                requireContext322.getClass();
                                return new om0(requireContext322);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222 = eventDetailsFragment.requireContext();
                                requireContext3222.getClass();
                                return new om0(requireContext3222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522 = eventDetailsFragment.requireContext();
                                requireContext522.getClass();
                                es1 es1Var22 = new es1(requireContext522);
                                o8.d(es1Var22, 0, 7);
                                return es1Var22;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222 = eventDetailsFragment.requireContext();
                                requireContext5222.getClass();
                                es1 es1Var222 = new es1(requireContext5222);
                                o8.d(es1Var222, 0, 7);
                                return es1Var222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i14 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i14) && !zu3.z.hasMcc(Integer.valueOf(i14)) && !zu3.V.hasMcc(Integer.valueOf(i14)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i13));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i13 = 11;
        this.M = ypa.a(ysaVar, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i14 = i13;
                int i15 = 12;
                int i16 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i14) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i15));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i16));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i15));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.N = ypa.b(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i14 = i11;
                int i15 = 12;
                int i16 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i14) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i15));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i16));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i15));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.O = ypa.a(ysaVar, new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i14 = i2;
                boolean z = false;
                r2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i14) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        });
        final int i14 = 7;
        this.P = n9e.M(new hx5(this, i14), new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i14;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        });
        this.Q = n9e.M(new hx5(this, 9), new hx5(this, 11));
        final int i15 = 18;
        this.R = ypa.a(ysaVar, new hx5(this, i15));
        final int i16 = 24;
        this.S = n9e.M(new hx5(this, i16), new hx5(this, i6));
        this.T = n9e.M(new ox5(this, i2), new ox5(this, 7));
        this.U = ypa.a(ysaVar, new ox5(this, 8));
        this.V = ypa.a(ysaVar, new ox5(this, 9));
        this.W = ypa.a(ysaVar, new ox5(this, i9));
        this.X = n9e.M(new ox5(this, 13), new ox5(this, 14));
        this.Y = ypa.a(ysaVar, new ox5(this, 15));
        this.Z = n9e.M(new ox5(this, 16), new ox5(this, 17));
        this.a0 = n9e.M(new ox5(this, i15), new ox5(this, 19));
        this.b0 = ypa.a(ysaVar, new ox5(this, 20));
        this.c0 = n9e.M(new ox5(this, 21), new ox5(this, i16));
        this.d0 = n9e.M(new ox5(this, 25), new ox5(this, i10));
        this.e0 = n9e.M(new ox5(this, i3), new ox5(this, i6));
        this.f0 = n9e.M(new ox5(this, i4), new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222 = eventDetailsFragment.requireContext();
                                requireContext3222.getClass();
                                return new om0(requireContext3222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222 = eventDetailsFragment.requireContext();
                                requireContext32222.getClass();
                                return new om0(requireContext32222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222 = eventDetailsFragment.requireContext();
                                requireContext5222.getClass();
                                es1 es1Var222 = new es1(requireContext5222);
                                o8.d(es1Var222, 0, 7);
                                return es1Var222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222 = eventDetailsFragment.requireContext();
                                requireContext52222.getClass();
                                es1 es1Var2222 = new es1(requireContext52222);
                                o8.d(es1Var2222, 0, 7);
                                return es1Var2222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i17 = 2;
        this.g0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i7;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222 = eventDetailsFragment.requireContext();
                                requireContext32222.getClass();
                                return new om0(requireContext32222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222 = eventDetailsFragment.requireContext();
                                requireContext322222.getClass();
                                return new om0(requireContext322222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222 = eventDetailsFragment.requireContext();
                                requireContext52222.getClass();
                                es1 es1Var2222 = new es1(requireContext52222);
                                o8.d(es1Var2222, 0, 7);
                                return es1Var2222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222 = eventDetailsFragment.requireContext();
                                requireContext522222.getClass();
                                es1 es1Var22222 = new es1(requireContext522222);
                                o8.d(es1Var22222, 0, 7);
                                return es1Var22222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i17;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222 = eventDetailsFragment.requireContext();
                                requireContext322222.getClass();
                                return new om0(requireContext322222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222 = eventDetailsFragment.requireContext();
                                requireContext3222222.getClass();
                                return new om0(requireContext3222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222 = eventDetailsFragment.requireContext();
                                requireContext522222.getClass();
                                es1 es1Var22222 = new es1(requireContext522222);
                                o8.d(es1Var22222, 0, 7);
                                return es1Var22222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222 = eventDetailsFragment.requireContext();
                                requireContext5222222.getClass();
                                es1 es1Var222222 = new es1(requireContext5222222);
                                o8.d(es1Var222222, 0, 7);
                                return es1Var222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i18 = 4;
        final int i19 = 6;
        this.h0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i18;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222 = eventDetailsFragment.requireContext();
                                requireContext3222222.getClass();
                                return new om0(requireContext3222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222 = eventDetailsFragment.requireContext();
                                requireContext32222222.getClass();
                                return new om0(requireContext32222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222 = eventDetailsFragment.requireContext();
                                requireContext5222222.getClass();
                                es1 es1Var222222 = new es1(requireContext5222222);
                                o8.d(es1Var222222, 0, 7);
                                return es1Var222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222 = eventDetailsFragment.requireContext();
                                requireContext52222222.getClass();
                                es1 es1Var2222222 = new es1(requireContext52222222);
                                o8.d(es1Var2222222, 0, 7);
                                return es1Var2222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i19;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222 = eventDetailsFragment.requireContext();
                                requireContext32222222.getClass();
                                return new om0(requireContext32222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222 = eventDetailsFragment.requireContext();
                                requireContext322222222.getClass();
                                return new om0(requireContext322222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222 = eventDetailsFragment.requireContext();
                                requireContext52222222.getClass();
                                es1 es1Var2222222 = new es1(requireContext52222222);
                                o8.d(es1Var2222222, 0, 7);
                                return es1Var2222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222 = eventDetailsFragment.requireContext();
                                requireContext522222222.getClass();
                                es1 es1Var22222222 = new es1(requireContext522222222);
                                o8.d(es1Var22222222, 0, 7);
                                return es1Var22222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i20 = 7;
        final int i21 = 8;
        this.i0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i20;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222 = eventDetailsFragment.requireContext();
                                requireContext322222222.getClass();
                                return new om0(requireContext322222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222.getClass();
                                return new om0(requireContext3222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222 = eventDetailsFragment.requireContext();
                                requireContext522222222.getClass();
                                es1 es1Var22222222 = new es1(requireContext522222222);
                                o8.d(es1Var22222222, 0, 7);
                                return es1Var22222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222.getClass();
                                es1 es1Var222222222 = new es1(requireContext5222222222);
                                o8.d(es1Var222222222, 0, 7);
                                return es1Var222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i21;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222.getClass();
                                return new om0(requireContext3222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222.getClass();
                                return new om0(requireContext32222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222.getClass();
                                es1 es1Var222222222 = new es1(requireContext5222222222);
                                o8.d(es1Var222222222, 0, 7);
                                return es1Var222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222.getClass();
                                es1 es1Var2222222222 = new es1(requireContext52222222222);
                                o8.d(es1Var2222222222, 0, 7);
                                return es1Var2222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i22 = 9;
        this.j0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i22;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222.getClass();
                                return new om0(requireContext32222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222.getClass();
                                return new om0(requireContext322222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222.getClass();
                                es1 es1Var2222222222 = new es1(requireContext52222222222);
                                o8.d(es1Var2222222222, 0, 7);
                                return es1Var2222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222.getClass();
                                es1 es1Var22222222222 = new es1(requireContext522222222222);
                                o8.d(es1Var22222222222, 0, 7);
                                return es1Var22222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i8;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222.getClass();
                                return new om0(requireContext322222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222.getClass();
                                return new om0(requireContext3222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222.getClass();
                                es1 es1Var22222222222 = new es1(requireContext522222222222);
                                o8.d(es1Var22222222222, 0, 7);
                                return es1Var22222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222.getClass();
                                es1 es1Var222222222222 = new es1(requireContext5222222222222);
                                o8.d(es1Var222222222222, 0, 7);
                                return es1Var222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i23 = 11;
        this.k0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i23;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222.getClass();
                                return new om0(requireContext3222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222.getClass();
                                return new om0(requireContext32222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222.getClass();
                                es1 es1Var222222222222 = new es1(requireContext5222222222222);
                                o8.d(es1Var222222222222, 0, 7);
                                return es1Var222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222.getClass();
                                es1 es1Var2222222222222 = new es1(requireContext52222222222222);
                                o8.d(es1Var2222222222222, 0, 7);
                                return es1Var2222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i9;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222.getClass();
                                return new om0(requireContext32222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222.getClass();
                                return new om0(requireContext322222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222.getClass();
                                es1 es1Var2222222222222 = new es1(requireContext52222222222222);
                                o8.d(es1Var2222222222222, 0, 7);
                                return es1Var2222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222.getClass();
                                es1 es1Var22222222222222 = new es1(requireContext522222222222222);
                                o8.d(es1Var22222222222222, 0, 7);
                                return es1Var22222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i24 = 13;
        final int i25 = 15;
        this.l0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i24;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222.getClass();
                                return new om0(requireContext322222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222.getClass();
                                return new om0(requireContext3222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222.getClass();
                                es1 es1Var22222222222222 = new es1(requireContext522222222222222);
                                o8.d(es1Var22222222222222, 0, 7);
                                return es1Var22222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222.getClass();
                                es1 es1Var222222222222222 = new es1(requireContext5222222222222222);
                                o8.d(es1Var222222222222222, 0, 7);
                                return es1Var222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i25;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222.getClass();
                                return new om0(requireContext3222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222.getClass();
                                return new om0(requireContext32222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222.getClass();
                                es1 es1Var222222222222222 = new es1(requireContext5222222222222222);
                                o8.d(es1Var222222222222222, 0, 7);
                                return es1Var222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222.getClass();
                                es1 es1Var2222222222222222 = new es1(requireContext52222222222222222);
                                o8.d(es1Var2222222222222222, 0, 7);
                                return es1Var2222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i26 = 16;
        this.m0 = ypa.a(ysaVar, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i26;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222.getClass();
                                return new om0(requireContext32222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222.getClass();
                                return new om0(requireContext322222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222.getClass();
                                es1 es1Var2222222222222222 = new es1(requireContext52222222222222222);
                                o8.d(es1Var2222222222222222, 0, 7);
                                return es1Var2222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222.getClass();
                                es1 es1Var22222222222222222 = new es1(requireContext522222222222222222);
                                o8.d(es1Var22222222222222222, 0, 7);
                                return es1Var22222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i27 = 19;
        this.n0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i15;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222.getClass();
                                return new om0(requireContext322222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222.getClass();
                                es1 es1Var22222222222222222 = new es1(requireContext522222222222222222);
                                o8.d(es1Var22222222222222222, 0, 7);
                                return es1Var22222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222.getClass();
                                es1 es1Var222222222222222222 = new es1(requireContext5222222222222222222);
                                o8.d(es1Var222222222222222222, 0, 7);
                                return es1Var222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i27;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222.getClass();
                                es1 es1Var222222222222222222 = new es1(requireContext5222222222222222222);
                                o8.d(es1Var222222222222222222, 0, 7);
                                return es1Var222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222.getClass();
                                es1 es1Var2222222222222222222 = new es1(requireContext52222222222222222222);
                                o8.d(es1Var2222222222222222222, 0, 7);
                                return es1Var2222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i28 = 20;
        this.o0 = ypa.a(ysaVar, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i28;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222.getClass();
                                es1 es1Var2222222222222222222 = new es1(requireContext52222222222222222222);
                                o8.d(es1Var2222222222222222222, 0, 7);
                                return es1Var2222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222.getClass();
                                es1 es1Var22222222222222222222 = new es1(requireContext522222222222222222222);
                                o8.d(es1Var22222222222222222222, 0, 7);
                                return es1Var22222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i29 = 21;
        final int i30 = 22;
        this.p0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i29;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222.getClass();
                                es1 es1Var22222222222222222222 = new es1(requireContext522222222222222222222);
                                o8.d(es1Var22222222222222222222, 0, 7);
                                return es1Var22222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222.getClass();
                                es1 es1Var222222222222222222222 = new es1(requireContext5222222222222222222222);
                                o8.d(es1Var222222222222222222222, 0, 7);
                                return es1Var222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i30;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222.getClass();
                                es1 es1Var222222222222222222222 = new es1(requireContext5222222222222222222222);
                                o8.d(es1Var222222222222222222222, 0, 7);
                                return es1Var222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222 = new es1(requireContext52222222222222222222222);
                                o8.d(es1Var2222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        this.q0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i11;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222 = new es1(requireContext52222222222222222222222);
                                o8.d(es1Var2222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222 = new es1(requireContext522222222222222222222222);
                                o8.d(es1Var22222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i16;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222 = new es1(requireContext522222222222222222222222);
                                o8.d(es1Var22222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222222.getClass();
                                es1 es1Var222222222222222222222222 = new es1(requireContext5222222222222222222222222);
                                o8.d(es1Var222222222222222222222222, 0, 7);
                                return es1Var222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        this.r0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i10;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222222.getClass();
                                es1 es1Var222222222222222222222222 = new es1(requireContext5222222222222222222222222);
                                o8.d(es1Var222222222222222222222222, 0, 7);
                                return es1Var222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222222 = new es1(requireContext52222222222222222222222222);
                                o8.d(es1Var2222222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i3;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222222 = new es1(requireContext52222222222222222222222222);
                                o8.d(es1Var2222222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222222 = new es1(requireContext522222222222222222222222222);
                                o8.d(es1Var22222222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        this.s0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i6;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222222 = new es1(requireContext522222222222222222222222222);
                                o8.d(es1Var22222222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222222222.getClass();
                                es1 es1Var222222222222222222222222222 = new es1(requireContext5222222222222222222222222222);
                                o8.d(es1Var222222222222222222222222222, 0, 7);
                                return es1Var222222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i31 = 2;
        this.t0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i7;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i31;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i32 = 3;
        final int i33 = 4;
        this.u0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i32;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i33;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i34 = 5;
        this.v0 = ypa.a(ysaVar, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i34;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i35 = 7;
        this.w0 = ypa.a(ysaVar, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i35;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i36 = 8;
        Function0 function0 = new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i36;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        };
        final int i37 = 9;
        this.x0 = n9e.M(function0, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i37;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.y0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i8;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i9;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i38 = 13;
        final int i39 = 14;
        this.z0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i38;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i39;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i40 = 15;
        final int i41 = 16;
        this.A0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i40;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i41;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i42 = 19;
        this.B0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i15;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i42;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i43 = 20;
        this.C0 = ypa.a(ysaVar, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i43;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i44 = 21;
        final int i45 = 22;
        this.D0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i44;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i45;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i46 = 25;
        this.E0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i16;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i46;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.F0 = ypa.a(ysaVar, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i10;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.G0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i3;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i4;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        this.H0 = n9e.M(new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        }, new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i7;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        });
        final int i47 = 2;
        final int i48 = 3;
        this.I0 = n9e.M(new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i47;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        }, new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i48;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        });
        final int i49 = 4;
        final int i50 = 6;
        this.J0 = n9e.M(new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i49;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        }, new Function0(this) { // from class: sx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences d;
                int i142 = i50;
                boolean z = false;
                z2 = false;
                boolean z2 = false;
                z = false;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && ok3.C(eventDetailsFragment.F())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        ksc kscVar = new ksc(requireContext);
                        kscVar.setAllStatisticsClickListener(new hx5(eventDetailsFragment, 13));
                        return kscVar;
                    case 2:
                        if (eventDetailsFragment.F() instanceof MmaEvent) {
                            MmaEvent mmaEvent = (MmaEvent) eventDetailsFragment.F();
                            jnb[] jnbVarArr = jnb.a;
                            if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent.getWinType())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    case 3:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new eqc(requireContext2);
                    case 4:
                        return Boolean.valueOf(ok3.E(eventDetailsFragment.F()));
                    case 5:
                        Integer F = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F == null || F.intValue() != 16 || !((Boolean) eventDetailsFragment.M.getValue()).booleanValue()) {
                            return null;
                        }
                        yea yeaVar = j58.a;
                        if (!j58.j() || ke0.m.contains(-8)) {
                            return null;
                        }
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        if (!sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            return null;
                        }
                        Context requireContext4 = eventDetailsFragment.requireContext();
                        requireContext4.getClass();
                        return new iuh(requireContext4);
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new rh(requireContext5);
                    default:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        if (((Boolean) eventDetailsFragment.N.getValue()).booleanValue()) {
                            ok3.E(eventDetailsFragment.F());
                        }
                        int id = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        int id2 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId();
                        SubTeam subTeam1 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                        SubTeam subTeam2 = Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
                        SubTeam subTeam12 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam1();
                        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                        SubTeam subTeam22 = Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getSubTeam2();
                        return new c4f(id, id2, new hx5(eventDetailsFragment, 21), new jx5(eventDetailsFragment, 11), new kx5(eventDetailsFragment, false ? 1 : 0), requireContext6, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
                }
            }
        });
        de registerForActivityResult = registerForActivityResult(new ce(i48), new ix5(this, 2));
        registerForActivityResult.getClass();
        this.K0 = registerForActivityResult;
        de registerForActivityResult2 = registerForActivityResult(new ce(i48), new ix5(this, i48));
        registerForActivityResult2.getClass();
        this.L0 = registerForActivityResult2;
        de registerForActivityResult3 = registerForActivityResult(new ce(i48), new ix5(this, i));
        registerForActivityResult3.getClass();
        this.M0 = registerForActivityResult3;
        this.N0 = n9e.M(new hx5(this, i7), new hx5(this, 2));
        this.O0 = n9e.M(new hx5(this, 3), new hx5(this, 4));
        this.P0 = n9e.M(new hx5(this, 5), new hx5(this, 6));
        this.Q0 = n9e.M(new ox5(this, 11), new ox5(this, 22));
        final int i51 = 3;
        final int i52 = 14;
        this.R0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i51;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222222222.getClass();
                                es1 es1Var222222222222222222222222222 = new es1(requireContext5222222222222222222222222222);
                                o8.d(es1Var222222222222222222222222222, 0, 7);
                                return es1Var222222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222222222 = new es1(requireContext52222222222222222222222222222);
                                o8.d(es1Var2222222222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i52;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext32222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext32222222222222222222222222222.getClass();
                                return new om0(requireContext32222222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext52222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext52222222222222222222222222222.getClass();
                                es1 es1Var2222222222222222222222222222 = new es1(requireContext52222222222222222222222222222);
                                o8.d(es1Var2222222222222222222222222222, 0, 7);
                                return es1Var2222222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222222222 = new es1(requireContext522222222222222222222222222222);
                                o8.d(es1Var22222222222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        });
        final int i53 = 25;
        final int i54 = 6;
        this.S0 = n9e.M(new Function0(this) { // from class: qx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r12 != null ? java.lang.Boolean.valueOf(r12.contains(defpackage.dv3.c())) : null, java.lang.Boolean.TRUE) != false) goto L60;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                EventHeadFlags eventHeadFlags;
                int i122 = i53;
                int i132 = 7;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i122) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ic6(requireContext);
                    case 1:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new g5j(requireContext2);
                    case 3:
                        return Boolean.valueOf(Intrinsics.c(ok3.s(eventDetailsFragment.F()), Sports.VOLLEYBALL));
                    case 4:
                        return Boolean.valueOf((Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) || eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled()) ? false : true);
                    case 5:
                        return new xx5(eventDetailsFragment.requireContext());
                    case 6:
                        FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                        requireActivity.getClass();
                        return new d66((AppCompatActivity) requireActivity);
                    case 7:
                        return Boolean.valueOf(ph0.v(new String[]{Sports.FOOTBALL, Sports.BASKETBALL, Sports.AUSSIE_RULES, Sports.HANDBALL, Sports.ICE_HOCKEY}, eventDetailsFragment.L()));
                    case 8:
                        String L = eventDetailsFragment.L();
                        switch (L.hashCode()) {
                            case -2002238939:
                                if (!L.equals(Sports.ICE_HOCKEY)) {
                                    return null;
                                }
                                Context requireContext322222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext322222222222222222222222222222.getClass();
                                return new om0(requireContext322222222222222222222222222222);
                            case 1767150:
                                if (!L.equals(Sports.HANDBALL)) {
                                    return null;
                                }
                                Context requireContext4 = eventDetailsFragment.requireContext();
                                requireContext4.getClass();
                                return new i69(requireContext4);
                            case 394668909:
                                if (!L.equals(Sports.FOOTBALL)) {
                                    return null;
                                }
                                Context requireContext3222222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext3222222222222222222222222222222.getClass();
                                return new om0(requireContext3222222222222222222222222222222);
                            case 470363802:
                                if (!L.equals(Sports.AUSSIE_RULES)) {
                                    return null;
                                }
                                Context requireContext522222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext522222222222222222222222222222.getClass();
                                es1 es1Var22222222222222222222222222222 = new es1(requireContext522222222222222222222222222222);
                                o8.d(es1Var22222222222222222222222222222, 0, 7);
                                return es1Var22222222222222222222222222222;
                            case 727149765:
                                if (!L.equals(Sports.BASKETBALL)) {
                                    return null;
                                }
                                Context requireContext5222222222222222222222222222222 = eventDetailsFragment.requireContext();
                                requireContext5222222222222222222222222222222.getClass();
                                es1 es1Var222222222222222222222222222222 = new es1(requireContext5222222222222222222222222222222);
                                o8.d(es1Var222222222222222222222222222222, 0, 7);
                                return es1Var222222222222222222222222222222;
                            default:
                                return null;
                        }
                    case 9:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET));
                    case 10:
                        Context requireContext6 = eventDetailsFragment.requireContext();
                        requireContext6.getClass();
                        w04 w04Var = new w04(requireContext6);
                        Event F = eventDetailsFragment.F();
                        z82 z82Var = w04Var.d;
                        ((lqb) z82Var.g).c.setText(w04Var.getContext().getString(R.string.cricket_runs_per_over));
                        ImageView imageView = ((lqb) z82Var.g).b;
                        imageView.setVisibility(0);
                        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                        apf a4 = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a4.a(ht9Var.a());
                        imageView.setOnClickListener(new cn(21, w04Var, F));
                        pu1 pu1Var = (pu1) z82Var.e;
                        pu1Var.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.home_primary)));
                        pu1 pu1Var2 = (pu1) z82Var.c;
                        pu1Var2.c.setImageTintList(ColorStateList.valueOf(w04Var.getContext().getColor(R.color.away_primary)));
                        TextView textView = pu1Var.d;
                        Team homeTeam$default = Event.getHomeTeam$default(F, null, 1, null);
                        Context context = w04Var.getContext();
                        context.getClass();
                        textView.setText(tba.p(context, homeTeam$default));
                        TextView textView2 = pu1Var2.d;
                        Team awayTeam$default = Event.getAwayTeam$default(F, null, 1, null);
                        Context context2 = w04Var.getContext();
                        context2.getClass();
                        textView2.setText(tba.p(context2, awayTeam$default));
                        return w04Var;
                    case 11:
                        return Boolean.valueOf((eventDetailsFragment.F() instanceof CricketEvent) && ok3.C(eventDetailsFragment.F()));
                    case 12:
                        Context requireContext7 = eventDetailsFragment.requireContext();
                        requireContext7.getClass();
                        CricketWagonWheelView cricketWagonWheelView = new CricketWagonWheelView(requireContext7, null, 6);
                        cricketWagonWheelView.l((CricketEvent) eventDetailsFragment.F());
                        return cricketWagonWheelView;
                    case 13:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.AMERICAN_FOOTBALL));
                    case 14:
                        Context requireContext8 = eventDetailsFragment.requireContext();
                        requireContext8.getClass();
                        kxk kxkVar = new kxk(requireContext8);
                        kxkVar.setLayoutParams(new hrf(-1, -2));
                        return kxkVar;
                    case 15:
                        Context requireContext9 = eventDetailsFragment.requireContext();
                        requireContext9.getClass();
                        return new xt(requireContext9);
                    case 16:
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new na9(requireContext10);
                    case 17:
                        dz5 E = eventDetailsFragment.E();
                        Event F2 = eventDetailsFragment.F();
                        Boolean bool = y05.a;
                        if (!y05.a(E.i()) && F2.getStreamContentId() != null) {
                            List<String> streamContentGeoRestrictions = F2.getStreamContentGeoRestrictions();
                            break;
                        }
                        r9 = false;
                        return Boolean.valueOf(r9);
                    case 18:
                        Boolean bool2 = (Boolean) eventDetailsFragment.V.getValue();
                        bool2.booleanValue();
                        return bool2;
                    case 19:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext11, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 20:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext12, null, 6);
                        Context context3 = adBannerView.getContext();
                        context3.getClass();
                        int s = ao2.s(4, context3);
                        Context context4 = adBannerView.getContext();
                        context4.getClass();
                        int s2 = ao2.s(8, context4);
                        adBannerView.setPaddingRelative(s2, s, s2, s);
                        ltb ltbVar = new ltb();
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, eventDetailsFragment.F().getSportSlug());
                        ltbVar.put("event_status", eventDetailsFragment.F().getStatus().getType());
                        Event F3 = eventDetailsFragment.F();
                        TeamSides teamSides = TeamSides.ORIGINAL;
                        ltbVar.put("home_team_id", String.valueOf(F3.getHomeTeam(teamSides).getId()));
                        ltbVar.put("away_team_id", String.valueOf(eventDetailsFragment.F().getAwayTeam(teamSides).getId()));
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        ltbVar.put("language", language);
                        ltbVar.put("page", "event");
                        Integer F4 = o3a.F(eventDetailsFragment.F().getTournament());
                        if (F4 != null) {
                            ltbVar.put("unique_tournament_id", String.valueOf(F4.intValue()));
                        }
                        adBannerView.setCustomTargeting(ltbVar.d());
                        return adBannerView;
                    case 21:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        int i142 = eventDetailsFragment.t;
                        requireContext13.getClass();
                        return Boolean.valueOf(rld.t(requireContext13) && ok3.D(eventDetailsFragment.F()) && rld.a(i142) && !zu3.z.hasMcc(Integer.valueOf(i142)) && !zu3.V.hasMcc(Integer.valueOf(i142)));
                    case 22:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        return new bld(requireContext14);
                    case 23:
                        Boolean bool3 = (Boolean) eventDetailsFragment.V.getValue();
                        bool3.booleanValue();
                        return bool3;
                    case 24:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        FeaturedOddsView featuredOddsView = new FeaturedOddsView(requireContext15, null, 6, 0);
                        featuredOddsView.setLocation(vmd.EVENT_DETAILS);
                        featuredOddsView.setAction(new jx5(eventDetailsFragment, i132));
                        featuredOddsView.setVisibility(8);
                        return featuredOddsView;
                    case 25:
                        Set set = ceb.a;
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return Boolean.valueOf(ceb.a(requireContext16, eventDetailsFragment.F()));
                    case 26:
                        return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
                    case 27:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new lmj(requireContext17);
                    case 28:
                        return Boolean.valueOf(cu1.g.contains(eventDetailsFragment.L()));
                    default:
                        FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                        requireActivity2.getClass();
                        String sportSlug = eventDetailsFragment.F().getSportSlug();
                        x2g x2gVar = (x2g) eventDetailsFragment.D().x.d();
                        bhi bhiVar = new bhi(requireActivity2, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(eventDetailsFragment, 22));
                        bhiVar.setOnMediaCTAButtonListener(new hx5(eventDetailsFragment, 23));
                        bhiVar.r(null, eventDetailsFragment.F());
                        return bhiVar;
                }
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i54;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
        final int i55 = 17;
        this.T0 = n9e.M(new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i55;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        }, new Function0(this) { // from class: rx5
            public final /* synthetic */ EventDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean contains;
                SharedPreferences d;
                int i142 = i6;
                int i152 = 12;
                int i162 = 8;
                EventDetailsFragment eventDetailsFragment = this.b;
                switch (i142) {
                    case 0:
                        Context requireContext = eventDetailsFragment.requireContext();
                        requireContext.getClass();
                        cu1 cu1Var = new cu1(requireContext);
                        cu1Var.setBannerClickListener(new hx5(eventDetailsFragment, 14));
                        return cu1Var;
                    case 1:
                        contains = od5.e.contains(eventDetailsFragment.L());
                        break;
                    case 2:
                        Context requireContext2 = eventDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new od5(requireContext2);
                    case 3:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 4:
                        Context requireContext3 = eventDetailsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.h = new Pair(Boolean.TRUE, Boolean.FALSE);
                        g5kVar.d = new jx5(eventDetailsFragment, 9);
                        g5kVar.m = new ur1(eventDetailsFragment, 3);
                        g5kVar.b();
                        return typeHeaderView;
                    case 5:
                        String L = eventDetailsFragment.L();
                        if (Intrinsics.c(L, Sports.FOOTBALL)) {
                            Context requireContext4 = eventDetailsFragment.requireContext();
                            requireContext4.getClass();
                            return new pj8(requireContext4);
                        }
                        if (Intrinsics.c(L, Sports.BASKETBALL)) {
                            return new jr1(eventDetailsFragment);
                        }
                        return null;
                    case 6:
                        Context requireContext5 = eventDetailsFragment.requireContext();
                        requireContext5.getClass();
                        return new geb(requireContext5);
                    case 7:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                            Context requireContext6 = eventDetailsFragment.requireContext();
                            requireContext6.getClass();
                            return new dq9(requireContext6);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                            Context requireContext7 = eventDetailsFragment.requireContext();
                            requireContext7.getClass();
                            return new e14(requireContext7);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL)) {
                            Context requireContext8 = eventDetailsFragment.requireContext();
                            requireContext8.getClass();
                            return new om1(requireContext8);
                        }
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.DARTS)) {
                            Context requireContext9 = eventDetailsFragment.requireContext();
                            requireContext9.getClass();
                            return new yc4(requireContext9);
                        }
                        Set set = wyh.a;
                        String L2 = eventDetailsFragment.L();
                        L2.getClass();
                        if (!wyh.b.contains(L2) || ok3.G(eventDetailsFragment.F())) {
                            return null;
                        }
                        Context requireContext10 = eventDetailsFragment.requireContext();
                        requireContext10.getClass();
                        return new usi(requireContext10);
                    case 8:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 9:
                        Context requireContext11 = eventDetailsFragment.requireContext();
                        requireContext11.getClass();
                        vb6 vb6Var = new vb6(requireContext11);
                        vb6Var.setOnMoreStatsClick(new hx5(eventDetailsFragment, 17));
                        return vb6Var;
                    case 10:
                        if (Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL) && ok3.C(eventDetailsFragment.F())) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 11:
                        Context requireContext12 = eventDetailsFragment.requireContext();
                        requireContext12.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext12.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PR_XAIST", "");
                        return Boolean.valueOf(string == null || string.length() == 0);
                    case 12:
                        Context requireContext13 = eventDetailsFragment.requireContext();
                        requireContext13.getClass();
                        wm1 wm1Var = new wm1(requireContext13);
                        wm1Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, i152));
                        wm1Var.setOnPlayerClick(new jx5(eventDetailsFragment, i162));
                        return wm1Var;
                    case 13:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY);
                        break;
                    case 14:
                        Context requireContext14 = eventDetailsFragment.requireContext();
                        requireContext14.getClass();
                        me9 me9Var = new me9(requireContext14);
                        me9Var.setOnBoxScoreClick(new hx5(eventDetailsFragment, 25));
                        me9Var.setOnPlayerClick(new jx5(eventDetailsFragment, i152));
                        return me9Var;
                    case 15:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS);
                        break;
                    case 16:
                        Context requireContext15 = eventDetailsFragment.requireContext();
                        requireContext15.getClass();
                        return new p6j(requireContext15, true);
                    case 17:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL);
                        break;
                    case 18:
                        if (!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA) && eventDetailsFragment.F().getManOfMatch() != null) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 19:
                        Context requireContext16 = eventDetailsFragment.requireContext();
                        requireContext16.getClass();
                        return new ote(requireContext16);
                    case 20:
                        Context requireContext17 = eventDetailsFragment.requireContext();
                        requireContext17.getClass();
                        return new xvb(requireContext17);
                    case 21:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 22:
                        Context requireContext18 = eventDetailsFragment.requireContext();
                        requireContext18.getClass();
                        h08 h08Var = new h08(requireContext18, null);
                        h08Var.setVisibility(8);
                        o8.d(h08Var, 0, 7);
                        LinearLayout linearLayout = h08Var.getBinding().a;
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(8, requireContext18), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                        return h08Var;
                    case 23:
                        if (((Boolean) eventDetailsFragment.M.getValue()).booleanValue() && eventDetailsFragment.D().l() && ((!ok3.E(eventDetailsFragment.F()) && !ok3.C(eventDetailsFragment.F())) || !Intrinsics.c(eventDetailsFragment.F().getCorrectAiInsight(), Boolean.FALSE))) {
                            r4 = true;
                        }
                        return Boolean.valueOf(r4);
                    case 24:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.E_SPORTS);
                        break;
                    case 25:
                        Context requireContext19 = eventDetailsFragment.requireContext();
                        requireContext19.getClass();
                        return new oq5(requireContext19);
                    case 26:
                        Context requireContext20 = eventDetailsFragment.requireContext();
                        requireContext20.getClass();
                        return new pse(requireContext20);
                    case 27:
                        contains = Intrinsics.c(eventDetailsFragment.L(), Sports.MMA);
                        break;
                    case 28:
                        Context requireContext21 = eventDetailsFragment.requireContext();
                        requireContext21.getClass();
                        return new on1(requireContext21);
                    default:
                        Context requireContext22 = eventDetailsFragment.requireContext();
                        requireContext22.getClass();
                        return new ilc(requireContext22);
                }
                return Boolean.valueOf(contains);
            }
        });
    }

    public final InformationView C() {
        return (InformationView) this.W.getValue();
    }

    public final mr5 D() {
        return (mr5) this.w.getValue();
    }

    public final dz5 E() {
        return (dz5) this.y.getValue();
    }

    public final Event F() {
        Object d = D().v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final tu7 G() {
        return (tu7) this.z.getValue();
    }

    public final Team H(int i, LineupsResponse lineupsResponse) {
        List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
        if (players == null || !players.isEmpty()) {
            Iterator<T> it = players.iterator();
            while (it.hasNext()) {
                if (((PlayerData) it.next()).getPlayer().getId() == i) {
                    return Event.getHomeTeam$default(F(), null, 1, null);
                }
            }
        }
        return Event.getAwayTeam$default(F(), null, 1, null);
    }

    public final u4g I() {
        return (u4g) this.A.getValue();
    }

    public final xx5 K() {
        return (xx5) this.J.getValue();
    }

    public final String L() {
        return (String) this.v.getValue();
    }

    public final dsi M() {
        return (dsi) this.x.getValue();
    }

    public final void N(int i, Integer num, Player player) {
        Double d;
        ArrayList arrayList;
        LineupsResponse lineupsResponse;
        Lineups homeLineups$default;
        List<PlayerData> players;
        LineupsResponse lineupsResponse2;
        Object obj;
        PlayerEventStatistics statistics;
        Boolean valueOf = player != null ? Boolean.valueOf(player.getDisabled()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(valueOf, bool)) {
            return;
        }
        int intValue = num.intValue();
        if (!Intrinsics.c(F().getHasEventPlayerStatistics(), bool)) {
            int i2 = PlayerActivity.Z;
            Context requireContext = requireContext();
            requireContext.getClass();
            int intValue2 = num.intValue();
            UniqueTournament uniqueTournament = F().getTournament().getUniqueTournament();
            jle.q(requireContext, intValue2, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
            return;
        }
        if (player != null) {
            iy5 iy5Var = (iy5) E().x.d();
            if (iy5Var == null || (lineupsResponse2 = iy5Var.o) == null) {
                d = null;
            } else {
                TeamSides teamSides = TeamSides.REVERSIBLE;
                Iterator it = CollectionsKt.w0(lineupsResponse2.getAwayLineups(teamSides).getPlayers(), lineupsResponse2.getHomeLineups(teamSides).getPlayers()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((PlayerData) obj).getPlayer().getId() == intValue) {
                            break;
                        }
                    }
                }
                PlayerData playerData = (PlayerData) obj;
                d = (playerData == null || (statistics = playerData.getStatistics()) == null) ? null : statistics.getRating();
            }
            iy5 iy5Var2 = (iy5) E().x.d();
            if (iy5Var2 == null || (lineupsResponse = iy5Var2.o) == null || (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) == null || (players = homeLineups$default.getPlayers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(k13.r(players, 10));
                Iterator<T> it2 = players.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((PlayerData) it2.next()).getPlayer().getId()));
                }
            }
            Boolean valueOf2 = arrayList != null ? Boolean.valueOf(arrayList.contains(Integer.valueOf(intValue))) : null;
            int i3 = (!Intrinsics.c(valueOf2, Boolean.TRUE) && (Intrinsics.c(valueOf2, Boolean.FALSE) || i != 1)) ? 2 : 1;
            Event F = F();
            Team homeTeam$default = i3 == 1 ? Event.getHomeTeam$default(F, null, 1, null) : Event.getAwayTeam$default(F, null, 1, null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                PlayerEventStatisticsModal c = jpe.c(f8h.i(F(), player, homeTeam$default, i3, d, 96), null);
                AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                if (appCompatActivity != null) {
                    me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                }
            }
        }
    }

    public final void O() {
        ia0 ia0Var = ia0.q;
        if (!ok3.p().e().getIsLoggedIn()) {
            Bundle bundle = new Bundle();
            bundle.putInt("login_action", 1);
            int i = LoginScreenActivity.M;
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            this.M0.a(wxf.v(requireActivity, bundle, 4), null);
            return;
        }
        if (ok3.p().e().getIsActiveCrowdsourcer()) {
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.z0(requireContext, kv.CLICK, "reputation_score", "event_details");
            int i2 = ProfileDetailsActivity.L;
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            Intent intent = new Intent(requireContext2, (Class<?>) ProfileDetailsActivity.class);
            intent.putExtra("screen_name", "contribution_performance");
            intent.putExtra("OPEN_PROFILE_ID", (String) null);
            requireContext2.startActivity(intent);
            return;
        }
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        AlertDialog create = new AlertDialog.Builder(requireContext3, R.style.RedesignDialog).create();
        View inflate = LayoutInflater.from(requireContext3).inflate(R.layout.dialog_contribution_info, (ViewGroup) null, false);
        int i3 = R.id.badge_1;
        if (((ImageView) nq8.B(R.id.badge_1, inflate)) != null) {
            i3 = R.id.badge_2;
            if (((ImageView) nq8.B(R.id.badge_2, inflate)) != null) {
                i3 = R.id.icons_container;
                if (((FrameLayout) nq8.B(R.id.icons_container, inflate)) != null) {
                    i3 = R.id.text;
                    if (((TextView) nq8.B(R.id.text, inflate)) != null) {
                        create.setView((ScrollView) inflate);
                        create.setButton(-1, requireContext3.getString(R.string.button_text_ok_got_it), new i0(create, 6));
                        create.show();
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public final void P() {
        ia0 ia0Var = ia0.q;
        if (ok3.p().e().getIsLoggedIn()) {
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.e0(requireContext, hta.TOP_CONTRIBUTORS, "event_details");
            int i = ProfileTopLeaderboardsActivity.N;
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            yfa.I(requireContext2, baf.b);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("login_action", 2);
        int i2 = LoginScreenActivity.M;
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        this.M0.a(wxf.v(requireActivity, bundle, 4), null);
    }

    public final void Q(vte vteVar) {
        n1k n1kVar;
        if (vteVar instanceof tte) {
            tte tteVar = (tte) vteVar;
            n1kVar = new n1k(tteVar.d, tteVar.c, tteVar.f);
        } else {
            if (!(vteVar instanceof ute)) {
                return;
            }
            ute uteVar = (ute) vteVar;
            n1kVar = new n1k(uteVar.b, uteVar.a, uteVar.d);
        }
        gv9 gv9Var = (gv9) n1kVar.a;
        Integer num = (Integer) n1kVar.b;
        Long l = (Long) n1kVar.c;
        Context requireContext = requireContext();
        requireContext.getClass();
        int id = F().getId();
        long startTimestamp = F().getStartTimestamp();
        gv9Var.getClass();
        EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = new EventPlayerOfTheMatchVoteBottomSheet();
        eventPlayerOfTheMatchVoteBottomSheet.setArguments(fz8.C(fz8.D(id, "EVENT_ID"), fz8.E(startTimestamp, "EVENT_TIMESTAMP"), fz8.G("PLAYERS", new ArrayList(gv9Var)), fz8.D(num != null ? num.intValue() : -1, "VOTED_PLAYER_ID"), fz8.E(l != null ? l.longValue() : -1L, "VOTE_END_TIMESTAMP")));
        if (requireContext instanceof csk) {
            requireContext = ((csk) requireContext).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(eventPlayerOfTheMatchVoteBottomSheet, appCompatActivity, rq3Var, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0de9  */
    /* JADX WARN: Removed duplicated region for block: B:454:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x05f9  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.sofascore.model.mvvm.model.TeamSides, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(iy5 iy5Var) {
        boolean z;
        List list;
        List list2;
        EventIncidentsResponse eventIncidentsResponse;
        EventBestPlayersResponse eventBestPlayersResponse;
        PregameFormResponse pregameFormResponse;
        Object obj;
        zsi zsiVar;
        EventGraphResponse eventGraphResponse;
        Object obj2;
        EventDetailsFragment eventDetailsFragment;
        ky5 ky5Var;
        ViewParent viewParent;
        gv9 gv9Var;
        n6j n6jVar;
        ?? r10;
        gv9 gv9Var2;
        EventBestPlayersResponse eventBestPlayersResponse2;
        vte vteVar;
        PregameFormResponse pregameFormResponse2;
        boolean c;
        ote oteVar;
        SeasonInfo seasonInfo;
        ede edeVar;
        xt xtVar;
        w04 w04Var;
        ?? r1;
        d66 d66Var;
        ji5 ji5Var;
        EventDetailsFragment eventDetailsFragment2;
        ny5 ny5Var;
        rh rhVar;
        boolean isEmpty;
        boolean c2;
        int i;
        List list3;
        int i2;
        s5j s5jVar;
        List list4;
        on1 on1Var;
        gv9 gv9Var3;
        List list5;
        PromotionalOffersBannerView promotionalOffersBannerView;
        PromotionalOffersBannerView promotionalOffersBannerView2;
        wm1 wm1Var;
        kxk kxkVar;
        g5j g5jVar;
        y5f y5fVar;
        ic6 ic6Var;
        h4 h4Var;
        ?? r5;
        List<Incident> incidents;
        h4 h4Var2;
        oq5 oq5Var;
        p6j p6jVar;
        vb6 vb6Var;
        k3 k3Var;
        int i3;
        int i4;
        TeamSides teamSides;
        String alpha2;
        String str;
        Country country;
        Country country2;
        Country country3;
        String alpha22;
        Country country4;
        Country country5;
        String alpha23;
        String string;
        ua9 pa9Var;
        EventHeadFlags eventHeadFlags;
        MediaHighlightedItem<?> highlightedItem;
        VotesResponse votesResponse;
        VotesResponse votesResponse2;
        Boolean bool = iy5Var.t;
        if (!this.F && (votesResponse = iy5Var.f) != null) {
            if (this.r) {
                VoteType voteType = this.s ? I().o : null;
                dz5 E = E();
                votesResponse2 = votesResponse;
                xw3.L(un0.z(E), null, null, new kv7(E, F(), this.s, voteType, votesResponse2, (rq3) null), 3);
            } else {
                votesResponse2 = votesResponse;
            }
            if (Intrinsics.c(L(), Sports.MMA)) {
                jqc jqcVar = (jqc) this.C.getValue();
                xw3.L(un0.z(jqcVar), null, null, new iqc(jqcVar, F(), false, votesResponse2, null), 3);
            }
        }
        List list6 = iy5Var.G;
        boolean z2 = iy5Var.y;
        List list7 = iy5Var.A;
        EventGraphResponse eventGraphResponse2 = iy5Var.g;
        PregameFormResponse pregameFormResponse3 = iy5Var.m;
        EventBestPlayersResponse eventBestPlayersResponse3 = iy5Var.l;
        zsi zsiVar2 = iy5Var.K;
        LineupsResponse lineupsResponse = iy5Var.o;
        EventIncidentsResponse eventIncidentsResponse2 = iy5Var.a;
        U(bool);
        Context requireContext = requireContext();
        requireContext.getClass();
        boolean z3 = G().m;
        boolean D = ok3.D(F());
        int i5 = ke0.c;
        joa joaVar = this.p0;
        if (z3 && D && rld.a(i5) && !zu3.z.hasMcc(Integer.valueOf(i5)) && !zu3.V.hasMcc(Integer.valueOf(i5)) && Intrinsics.c(bool, Boolean.TRUE) && !rld.q(requireContext)) {
            bld bldVar = (bld) joaVar.getValue();
            if (bldVar != null) {
                bldVar.setCallback(new hx5(this, 26));
                Unit unit = Unit.a;
            }
            bld bldVar2 = (bld) joaVar.getValue();
            if (bldVar2 != null) {
                String string2 = getString(R.string.featured_odds);
                string2.getClass();
                List c3 = D().l.c();
                c3.getClass();
                bldVar2.getBinding().d.setText(string2);
                if (bldVar2.e || c3.isEmpty()) {
                    z = z2;
                    list = list7;
                } else {
                    FrameLayout frameLayout = bldVar2.getBinding().a;
                    frameLayout.getClass();
                    z = z2;
                    list = list7;
                    tgj.p(frameLayout, 0L, 3);
                    bldVar2.e = true;
                    bldVar2.getBinding().c.setOnClickListener(new cd5(bldVar2, 25));
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) c3.get(0);
                    if (oddsCountryProvider.getBranded()) {
                        bldVar2.getBinding().e.setVisibility(0);
                        as9.k(bldVar2.getBinding().e, oddsCountryProvider.getProvider().getId());
                        Colors colors = oddsCountryProvider.getProvider().getColors();
                        String primary = colors != null ? colors.getPrimary() : null;
                        if (primary != null && primary.length() != 0) {
                            v9g.K(bldVar2.getBinding().e.getBackground().mutate(), Color.parseColor(colors.getPrimary()));
                        }
                    } else {
                        bldVar2.getBinding().e.setVisibility(8);
                    }
                }
                Unit unit2 = Unit.a;
            } else {
                z = z2;
                list = list7;
            }
        } else {
            z = z2;
            list = list7;
            bld bldVar3 = (bld) joaVar.getValue();
            if (bldVar3 != null) {
                bldVar3.setVisibility(8);
                Unit unit3 = Unit.a;
            }
        }
        if (this.K == null) {
            MediaHighlightSummaryResponse mediaHighlightSummaryResponse = D().J;
            Object item = (mediaHighlightSummaryResponse == null || (highlightedItem = mediaHighlightSummaryResponse.getHighlightedItem()) == null) ? null : highlightedItem.getItem();
            Event F = F();
            boolean z4 = item instanceof Highlight;
            qa9 qa9Var = qa9.a;
            if (z4) {
                pa9Var = new ra9((Highlight) item, F.getId());
            } else if (item instanceof WSCStory) {
                WSCStory wSCStory = (WSCStory) item;
                pa9Var = wSCStory.getStoryUrl() != null ? new ta9(wSCStory) : new sa9(wSCStory);
            } else {
                pa9Var = item instanceof LiveStreamHighlightItem ? new pa9(((LiveStreamHighlightItem) item).getStreamContentId()) : qa9Var;
            }
            this.K = pa9Var;
            if (pa9Var instanceof pa9) {
                E().t(((pa9) pa9Var).a, F());
                Unit unit4 = Unit.a;
            } else if (pa9Var.equals(qa9Var)) {
                n4c n4cVar = (n4c) this.N0.getValue();
                if (n4cVar != null) {
                    Context requireContext2 = requireContext();
                    requireContext2.getClass();
                    n4cVar.l(haa.r(requireContext2, F(), D().J), new hx5(this, 27));
                    g7 g7Var = this.D;
                    if (g7Var == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    g7.o(g7Var, n4cVar, 2);
                }
            } else {
                na9 na9Var = (na9) this.m0.getValue();
                E();
                boolean isInitialized = BlazeSDK.INSTANCE.isInitialized();
                int id = F().getId();
                String sportSlug = F().getSportSlug();
                x2g x2gVar = (x2g) D().x.d();
                na9Var.l(pa9Var, isInitialized, id, sportSlug, Intrinsics.c((x2gVar == null || (eventHeadFlags = (EventHeadFlags) yaa.x(x2gVar)) == null) ? null : Boolean.valueOf(eventHeadFlags.getMedia()), Boolean.TRUE), new hx5(this, 29));
                Unit unit5 = Unit.a;
            }
        }
        c68 c68Var = (c68) this.Y.getValue();
        Event F2 = F();
        my5 my5Var = iy5Var.r;
        my5 my5Var2 = iy5Var.s;
        gy4 gy4Var = c68Var.d;
        my5Var.getClass();
        my5Var2.getClass();
        my5 my5Var3 = !F2.shouldReverseTeams() ? my5Var : null;
        my5 my5Var4 = my5Var3 == null ? my5Var2 : my5Var3;
        Integer num = my5Var4.c;
        if (F2.shouldReverseTeams()) {
            my5Var2 = null;
        }
        if (my5Var2 == null) {
            my5Var2 = my5Var;
        }
        Integer num2 = my5Var2.c;
        boolean z5 = (F2.getPreviousLegEventId() == null || num == null || num2 == null) ? false : true;
        if (z5 || ok3.x(F2)) {
            list2 = list6;
            eventIncidentsResponse = eventIncidentsResponse2;
        } else {
            list2 = list6;
            eventIncidentsResponse = eventIncidentsResponse2;
            if (Event.getHomeScore$default(F2, null, 1, null).getSeries() == null || Event.getAwayScore$default(F2, null, 1, null).getSeries() == null) {
                c68Var.setVisibility(8);
                eventGraphResponse = eventGraphResponse2;
                obj = Sports.MMA;
                pregameFormResponse = pregameFormResponse3;
                eventBestPlayersResponse = eventBestPlayersResponse3;
                zsiVar = zsiVar2;
                obj2 = Sports.TENNIS;
                if (lineupsResponse != null) {
                    Integer num3 = D().q;
                    Integer num4 = D().r;
                    if (num3 != null) {
                        if (num4 == null) {
                            eventDetailsFragment = this;
                            num4 = Integer.valueOf(eventDetailsFragment.H(num3.intValue(), lineupsResponse).getId());
                        } else {
                            eventDetailsFragment = this;
                        }
                        int u = ok3.u(num4.intValue(), eventDetailsFragment.F());
                        eventDetailsFragment.D().q = null;
                        Event F3 = eventDetailsFragment.F();
                        Team homeTeam$default = u == 1 ? Event.getHomeTeam$default(F3, null, 1, null) : Event.getAwayTeam$default(F3, null, 1, null);
                        PlayerEventStatistics playerEventStatistics = null;
                        Player player = null;
                        for (PlayerData playerData : (u == 1 ? LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null) : LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)).getPlayers()) {
                            if (playerData.getPlayer().getId() == num3.intValue()) {
                                player = playerData.getPlayer();
                                playerEventStatistics = playerData.getStatistics();
                            }
                        }
                        if (player != null) {
                            FragmentActivity activity = eventDetailsFragment.getActivity();
                            if (activity != null) {
                                PlayerEventStatistics playerEventStatistics2 = playerEventStatistics;
                                PlayerEventStatisticsModal c4 = jpe.c(f8h.i(eventDetailsFragment.F(), player, homeTeam$default, u, playerEventStatistics2 != null ? playerEventStatistics2.getRating() : null, 96), null);
                                AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                                if (appCompatActivity != null) {
                                    me4.n(c4, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                Unit unit6 = Unit.a;
                            }
                            Unit unit7 = Unit.a;
                        }
                        ky5Var = iy5Var.k;
                        if (ky5Var != null && (k3Var = (k3) eventDetailsFragment.v0.getValue()) != null) {
                            k3Var.l(ky5Var, !qea.y(Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null)) && qea.y(Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null)));
                            Unit unit8 = Unit.a;
                        }
                        viewParent = (o8) eventDetailsFragment.w0.getValue();
                        if (viewParent instanceof om1) {
                            zsi zsiVar3 = zsiVar;
                            if (viewParent instanceof dq9) {
                                ((dq9) viewParent).l(zsiVar3 instanceof ysi ? (ysi) zsiVar3 : null);
                            } else if (viewParent instanceof go1) {
                                ((go1) viewParent).a(eventDetailsFragment.F());
                            }
                        } else {
                            om1 om1Var = (om1) viewParent;
                            Event F4 = eventDetailsFragment.F();
                            zsi zsiVar4 = zsiVar;
                            wsi wsiVar = zsiVar4 instanceof wsi ? (wsi) zsiVar4 : null;
                            om1Var.e = F4;
                            ((eoh) om1Var.d).setValue(wsiVar);
                            if (om1Var.getVisibility() != 0) {
                                om1Var.setVisibility(0);
                                om1Var.f.b.setContent(new tc3(1456204418, new vn6(14, om1Var, F4), true));
                            }
                        }
                        gv9Var = iy5Var.L;
                        if (gv9Var != null && (vb6Var = (vb6) eventDetailsFragment.x0.getValue()) != null) {
                            vb6Var.l(gv9Var);
                            Unit unit9 = Unit.a;
                        }
                        n6jVar = iy5Var.q;
                        if (n6jVar != null && (p6jVar = (p6j) eventDetailsFragment.A0.getValue()) != null) {
                            Event F5 = eventDetailsFragment.F();
                            int i6 = p6j.k;
                            p6jVar.l(n6jVar, F5, true, false, null);
                            Unit unit10 = Unit.a;
                        }
                        if (lineupsResponse != null) {
                            if (!Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                                lineupsResponse = null;
                            }
                            if (lineupsResponse != null) {
                                Context requireContext3 = eventDetailsFragment.requireContext();
                                requireContext3.getClass();
                                r10 = 0;
                                gv9Var2 = o02.c0(requireContext3, lineupsResponse, Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId(), Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId());
                                joa joaVar2 = eventDetailsFragment.t0;
                                joa joaVar3 = eventDetailsFragment.s0;
                                joa joaVar4 = eventDetailsFragment.r0;
                                if (gv9Var2 != null) {
                                    me9 me9Var = (me9) eventDetailsFragment.z0.getValue();
                                    if (me9Var != null) {
                                        me9Var.setData(gv9Var2);
                                        Unit unit11 = Unit.a;
                                    }
                                    cu1 cu1Var = (cu1) joaVar3.getValue();
                                    if (cu1Var != null) {
                                        cu1Var.setVisibility(8);
                                        Unit unit12 = Unit.a;
                                    }
                                    od5 od5Var = (od5) joaVar2.getValue();
                                    if (od5Var != null) {
                                        od5Var.setVisibility(8);
                                        Unit unit13 = Unit.a;
                                    }
                                    lmj lmjVar = (lmj) joaVar4.getValue();
                                    if (lmjVar != null) {
                                        lmjVar.setVisibility(8);
                                        Unit unit14 = Unit.a;
                                    }
                                } else {
                                    cu1 cu1Var2 = (cu1) joaVar3.getValue();
                                    if (cu1Var2 != null) {
                                        eventBestPlayersResponse2 = eventBestPlayersResponse;
                                        cu1Var2.j(eventDetailsFragment.F(), eventBestPlayersResponse2);
                                        Unit unit15 = Unit.a;
                                    } else {
                                        eventBestPlayersResponse2 = eventBestPlayersResponse;
                                    }
                                    od5 od5Var2 = (od5) joaVar2.getValue();
                                    if (od5Var2 != null) {
                                        od5Var2.j(eventDetailsFragment.F(), eventBestPlayersResponse2);
                                        Unit unit16 = Unit.a;
                                    }
                                    lmj lmjVar2 = (lmj) joaVar4.getValue();
                                    if (lmjVar2 != null) {
                                        vte vteVar2 = iy5Var.x;
                                        int id2 = eventDetailsFragment.F().getId();
                                        Context requireContext4 = eventDetailsFragment.requireContext();
                                        requireContext4.getClass();
                                        lmjVar2.l(vteVar2, id2, ccd.B(requireContext4, o3a.F(eventDetailsFragment.F().getTournament()), BrandLocation.PlayerOfTheMatch), new h84(15, eventDetailsFragment, iy5Var), new xw5(2, eventDetailsFragment, iy5Var), new ox5(eventDetailsFragment, 0));
                                        Unit unit17 = Unit.a;
                                    }
                                }
                                vteVar = iy5Var.x;
                                if (vteVar != null) {
                                    if (eventDetailsFragment.D().s) {
                                        eventDetailsFragment.D().s = false;
                                        lmj lmjVar3 = (lmj) joaVar4.getValue();
                                        if (lmjVar3 != null) {
                                            krk krkVar = eventDetailsFragment.l;
                                            krkVar.getClass();
                                            eventDetailsFragment.t(((hy4) krkVar).b, new xw5(4, eventDetailsFragment, lmjVar3));
                                        }
                                        if ((vteVar instanceof tte) || (vteVar instanceof ute)) {
                                            eventDetailsFragment.Q(vteVar);
                                        }
                                    }
                                    Unit unit18 = Unit.a;
                                }
                                joa joaVar5 = eventDetailsFragment.Z;
                                if (pregameFormResponse != null) {
                                    v5f v5fVar = (v5f) joaVar5.getValue();
                                    if (v5fVar != null) {
                                        String L = eventDetailsFragment.L();
                                        int i7 = v5f.g;
                                        pregameFormResponse2 = pregameFormResponse;
                                        v5fVar.l(pregameFormResponse2, L, false);
                                        Unit unit19 = Unit.a;
                                    } else {
                                        pregameFormResponse2 = pregameFormResponse;
                                    }
                                    kqc kqcVar = (kqc) eventDetailsFragment.d0.getValue();
                                    if (kqcVar != null) {
                                        Integer homeTeamRanking = eventDetailsFragment.F().getHomeTeamRanking();
                                        Integer awayTeamRanking = eventDetailsFragment.F().getAwayTeamRanking();
                                        TeamForm homeTeam = pregameFormResponse2.getHomeTeam();
                                        bu1 bu1Var = kqcVar.d;
                                        kqcVar.j(homeTeam, homeTeamRanking, (ImageView) bu1Var.d, (TextView) bu1Var.g, (TextView) bu1Var.i, (hs1) bu1Var.c);
                                        kqcVar.j(pregameFormResponse2.getAwayTeam(), awayTeamRanking, (ImageView) bu1Var.j, (TextView) bu1Var.h, (TextView) bu1Var.k, (hs1) bu1Var.f);
                                        ((TextView) bu1Var.e).setVisibility(pregameFormResponse2.getHasMmaRankings() ? 0 : 8);
                                        kqcVar.getRoot().setVisibility(0);
                                        Unit unit20 = Unit.a;
                                    }
                                } else {
                                    pregameFormResponse2 = pregameFormResponse;
                                }
                                c = Intrinsics.c(eventDetailsFragment.L(), obj);
                                joa joaVar6 = eventDetailsFragment.C0;
                                if (c) {
                                    ((xvb) joaVar6.getValue()).setHasRankings(Intrinsics.c(pregameFormResponse2 != null ? Boolean.valueOf(pregameFormResponse2.getHasMmaRankings()) : r10, Boolean.TRUE));
                                }
                                ((xvb) joaVar6.getValue()).j(eventDetailsFragment.F(), iy5Var.I, iy5Var.J);
                                oteVar = (ote) eventDetailsFragment.B0.getValue();
                                if (oteVar != null) {
                                    oteVar.a(eventDetailsFragment.F());
                                    Unit unit21 = Unit.a;
                                }
                                seasonInfo = iy5Var.p;
                                if (seasonInfo != null && (oq5Var = (oq5) eventDetailsFragment.E0.getValue()) != null) {
                                    oq5Var.j(seasonInfo);
                                    Unit unit22 = Unit.a;
                                }
                                edeVar = (ede) eventDetailsFragment.X.getValue();
                                if (edeVar != null) {
                                    List<Incident> incidents2 = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : r10;
                                    if (incidents2 == null) {
                                        incidents2 = km5.a;
                                    }
                                    edeVar.j(eventDetailsFragment.F(), incidents2);
                                }
                                joa joaVar7 = eventDetailsFragment.i0;
                                if (eventGraphResponse != null) {
                                    Set set = wyh.a;
                                    String L2 = eventDetailsFragment.L();
                                    L2.getClass();
                                    EventGraphResponse eventGraphResponse3 = (wyh.c.contains(L2) || Intrinsics.c(eventDetailsFragment.L(), Sports.HANDBALL)) ? eventGraphResponse : r10;
                                    if (eventGraphResponse3 != null && (h4Var2 = (h4) joaVar7.getValue()) != null) {
                                        Event F6 = eventDetailsFragment.F();
                                        List<Incident> incidents3 = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : r10;
                                        if (incidents3 == null) {
                                            incidents3 = km5.a;
                                        }
                                        h4Var2.j(F6, eventGraphResponse3, incidents3, true, false);
                                        Unit unit23 = Unit.a;
                                    }
                                }
                                xtVar = (xt) eventDetailsFragment.l0.getValue();
                                if (xtVar != null) {
                                    Event F7 = eventDetailsFragment.F();
                                    EventGraphResponse eventGraphResponse4 = iy5Var.h;
                                    List<Incident> incidents4 = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : r10;
                                    if (incidents4 == null) {
                                        incidents4 = km5.a;
                                    }
                                    xtVar.j(F7, eventGraphResponse4, eventGraphResponse, incidents4);
                                    Unit unit24 = Unit.a;
                                }
                                w04Var = (w04) eventDetailsFragment.j0.getValue();
                                if (w04Var != null) {
                                    w04Var.j(eventDetailsFragment.F(), iy5Var.i);
                                    Unit unit25 = Unit.a;
                                }
                                r1 = (CricketWagonWheelView) eventDetailsFragment.k0.getValue();
                                if (r1 != 0) {
                                    Event F8 = eventDetailsFragment.F();
                                    if (eventIncidentsResponse == null || (incidents = eventIncidentsResponse.getIncidents()) == null) {
                                        r5 = r10;
                                    } else {
                                        r5 = new ArrayList();
                                        for (Object obj3 : incidents) {
                                            if (obj3 instanceof Incident.CricketIncident) {
                                                r5.add(obj3);
                                            }
                                        }
                                    }
                                    if (r5 == 0) {
                                        r5 = km5.a;
                                    }
                                    r1.p(F8, r5);
                                    Unit unit26 = Unit.a;
                                }
                                d66Var = (d66) eventDetailsFragment.h0.getValue();
                                if (d66Var != null) {
                                    d66Var.l(eventDetailsFragment.F(), !ok3.G(eventDetailsFragment.F()) && ((h4Var = (h4) joaVar7.getValue()) == null || h4Var.getVisibility() != 0));
                                    Unit unit27 = Unit.a;
                                }
                                ji5Var = (ji5) eventDetailsFragment.T.getValue();
                                if (ji5Var != null) {
                                    int i8 = 0;
                                    int i9 = 0;
                                    Class<EventDetailsFragment> cls = EventDetailsFragment.class;
                                    eventDetailsFragment2 = this;
                                    ji5Var.j(iy5Var.u, eventDetailsFragment.F(), new ox5(eventDetailsFragment, 1), new ox5(eventDetailsFragment, 2), new ny(i9, eventDetailsFragment, cls, "onTopContributorsClick", "onTopContributorsClick()V", i8, 21), new ny(i9, this, cls, "onReputationClick", "onReputationClick()V", i8, 22));
                                    Unit unit28 = Unit.a;
                                } else {
                                    eventDetailsFragment2 = eventDetailsFragment;
                                }
                                ny5Var = iy5Var.H;
                                if (ny5Var != null && (ic6Var = (ic6) eventDetailsFragment2.f0.getValue()) != null) {
                                    ic6Var.setData(ny5Var);
                                    Unit unit29 = Unit.a;
                                }
                                rhVar = (rh) eventDetailsFragment2.J0.getValue();
                                if (rhVar != null) {
                                    if (xe6.c().b().longValue() < eventDetailsFragment2.F().getStartTimestamp()) {
                                        rhVar.a(eventDetailsFragment2.F());
                                    } else {
                                        g7 g7Var2 = eventDetailsFragment2.D;
                                        if (g7Var2 == null) {
                                            Intrinsics.i(L6.G1);
                                            throw r10;
                                        }
                                        g7Var2.B(rhVar);
                                    }
                                }
                                isEmpty = list.isEmpty();
                                joa joaVar8 = eventDetailsFragment2.O0;
                                if (!isEmpty && (y5fVar = (y5f) joaVar8.getValue()) != null) {
                                    y5fVar.j(eventDetailsFragment2.F(), eventDetailsFragment2.F().getTournament(), iy5Var.A, Event.getHomeTeam$default(eventDetailsFragment2.F(), r10, 1, r10).getId(), Event.getAwayTeam$default(eventDetailsFragment2.F(), r10, 1, r10).getId(), (z || Intrinsics.c(eventDetailsFragment2.L(), obj2)) ? false : true);
                                    Unit unit30 = Unit.a;
                                }
                                c2 = Intrinsics.c(Boolean.valueOf(iy5Var.M), Boolean.TRUE);
                                joa joaVar9 = eventDetailsFragment2.S0;
                                if (c2) {
                                    geb gebVar = (geb) joaVar9.getValue();
                                    if (gebVar != null) {
                                        gebVar.setVisibility(0);
                                        Unit unit31 = Unit.a;
                                    }
                                    geb gebVar2 = (geb) joaVar9.getValue();
                                    if (gebVar2 != null) {
                                        gebVar2.o(eventDetailsFragment2.F());
                                        Unit unit32 = Unit.a;
                                    }
                                } else {
                                    geb gebVar3 = (geb) joaVar9.getValue();
                                    if (gebVar3 != null) {
                                        gebVar3.setVisibility(8);
                                        Unit unit33 = Unit.a;
                                    }
                                }
                                joa joaVar10 = eventDetailsFragment2.g0;
                                joa joaVar11 = eventDetailsFragment2.e0;
                                if (z) {
                                    if (list.isEmpty() || ((y5f) joaVar8.getValue()) == null) {
                                        r63 r63Var = (r63) joaVar11.getValue();
                                        if (r63Var != null) {
                                            r63Var.setEventData(eventDetailsFragment2.F());
                                            Unit unit34 = Unit.a;
                                        }
                                    } else {
                                        r63 r63Var2 = (r63) joaVar11.getValue();
                                        if (r63Var2 != null) {
                                            r63Var2.setVisibility(8);
                                            Unit unit35 = Unit.a;
                                        }
                                    }
                                    if (ok3.E(eventDetailsFragment2.F()) && (g5jVar = (g5j) joaVar10.getValue()) != null) {
                                        g5jVar.j(eventDetailsFragment2.F(), iy5Var.z);
                                        Unit unit36 = Unit.a;
                                    }
                                    i = 8;
                                } else {
                                    r63 r63Var3 = (r63) joaVar11.getValue();
                                    i = 8;
                                    if (r63Var3 != null) {
                                        r63Var3.setVisibility(8);
                                        Unit unit37 = Unit.a;
                                    }
                                    g5j g5jVar2 = (g5j) joaVar10.getValue();
                                    if (g5jVar2 != null) {
                                        g5jVar2.setVisibility(8);
                                        Unit unit38 = Unit.a;
                                    }
                                }
                                list3 = iy5Var.B;
                                if (list3 != null) {
                                    if (list3.size() == 2) {
                                        v5f v5fVar2 = (v5f) joaVar5.getValue();
                                        if (v5fVar2 != null) {
                                            v5fVar2.j();
                                            Unit unit39 = Unit.a;
                                        }
                                        z5f z5fVar = (z5f) eventDetailsFragment2.P0.getValue();
                                        if (z5fVar != null) {
                                            i2 = 0;
                                            z5fVar.j(eventDetailsFragment2.F(), (StandingsTableRow) list3.get(0), (StandingsTableRow) list3.get(1), iy5Var.C, new ox5(eventDetailsFragment2, 3));
                                            Unit unit40 = Unit.a;
                                            Unit unit41 = Unit.a;
                                        }
                                    }
                                    i2 = 0;
                                    Unit unit412 = Unit.a;
                                } else {
                                    i2 = 0;
                                }
                                s5jVar = (s5j) eventDetailsFragment2.Q0.getValue();
                                if (s5jVar != null) {
                                    s5jVar.m(iy5Var.D);
                                    Unit unit42 = Unit.a;
                                }
                                list4 = iy5Var.F;
                                if (list4 != null) {
                                    Integer display = Event.getHomeScore$default(eventDetailsFragment2.F(), r10, 1, r10).getDisplay();
                                    int intValue = display != null ? display.intValue() : i2;
                                    Integer display2 = Event.getAwayScore$default(eventDetailsFragment2.F(), r10, 1, r10).getDisplay();
                                    int intValue2 = intValue + (display2 != null ? display2.intValue() : i2);
                                    if (ok3.C(eventDetailsFragment2.F())) {
                                        HashSet hashSet = new HashSet();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj4 : list4) {
                                            if (hashSet.add(((EventGraphPoint) obj4).getPeriod())) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                        if (intValue2 != arrayList.size()) {
                                            list4 = r10;
                                        }
                                    }
                                    if (list4 != null && (kxkVar = (kxk) eventDetailsFragment2.R0.getValue()) != null) {
                                        kxkVar.l(eventDetailsFragment2.F(), list4);
                                        Unit unit43 = Unit.a;
                                    }
                                }
                                on1Var = (on1) eventDetailsFragment2.T0.getValue();
                                if (on1Var != null) {
                                    on1Var.l(iy5Var.N);
                                    Unit unit44 = Unit.a;
                                }
                                gv9Var3 = iy5Var.O;
                                if (gv9Var3 != null && (wm1Var = (wm1) eventDetailsFragment2.y0.getValue()) != null) {
                                    wm1Var.setData(gv9Var3);
                                    Unit unit45 = Unit.a;
                                }
                                joa joaVar12 = eventDetailsFragment2.c0;
                                if (list2 != null || (promotionalOffersBannerView2 = (PromotionalOffersBannerView) joaVar12.getValue()) == null) {
                                    list5 = list2;
                                } else {
                                    list5 = list2;
                                    PromotionalOffersBannerView.j(promotionalOffersBannerView2, list5, new rdf(eventDetailsFragment2.F()), fv.EVENT_SCREEN);
                                    Unit unit46 = Unit.a;
                                }
                                promotionalOffersBannerView = (PromotionalOffersBannerView) joaVar12.getValue();
                                if (promotionalOffersBannerView != null) {
                                    promotionalOffersBannerView.setVisibility((list5 == null || list5.isEmpty()) ? i : i2);
                                    Unit unit47 = Unit.a;
                                    return;
                                }
                                return;
                            }
                        }
                        r10 = 0;
                        gv9Var2 = null;
                        joa joaVar22 = eventDetailsFragment.t0;
                        joa joaVar32 = eventDetailsFragment.s0;
                        joa joaVar42 = eventDetailsFragment.r0;
                        if (gv9Var2 != null) {
                        }
                        vteVar = iy5Var.x;
                        if (vteVar != null) {
                        }
                        joa joaVar52 = eventDetailsFragment.Z;
                        if (pregameFormResponse != null) {
                        }
                        c = Intrinsics.c(eventDetailsFragment.L(), obj);
                        joa joaVar62 = eventDetailsFragment.C0;
                        if (c) {
                        }
                        ((xvb) joaVar62.getValue()).j(eventDetailsFragment.F(), iy5Var.I, iy5Var.J);
                        oteVar = (ote) eventDetailsFragment.B0.getValue();
                        if (oteVar != null) {
                        }
                        seasonInfo = iy5Var.p;
                        if (seasonInfo != null) {
                            oq5Var.j(seasonInfo);
                            Unit unit222 = Unit.a;
                        }
                        edeVar = (ede) eventDetailsFragment.X.getValue();
                        if (edeVar != null) {
                        }
                        joa joaVar72 = eventDetailsFragment.i0;
                        if (eventGraphResponse != null) {
                        }
                        xtVar = (xt) eventDetailsFragment.l0.getValue();
                        if (xtVar != null) {
                        }
                        w04Var = (w04) eventDetailsFragment.j0.getValue();
                        if (w04Var != null) {
                        }
                        r1 = (CricketWagonWheelView) eventDetailsFragment.k0.getValue();
                        if (r1 != 0) {
                        }
                        d66Var = (d66) eventDetailsFragment.h0.getValue();
                        if (d66Var != null) {
                        }
                        ji5Var = (ji5) eventDetailsFragment.T.getValue();
                        if (ji5Var != null) {
                        }
                        ny5Var = iy5Var.H;
                        if (ny5Var != null) {
                            ic6Var.setData(ny5Var);
                            Unit unit292 = Unit.a;
                        }
                        rhVar = (rh) eventDetailsFragment2.J0.getValue();
                        if (rhVar != null) {
                        }
                        isEmpty = list.isEmpty();
                        joa joaVar82 = eventDetailsFragment2.O0;
                        if (!isEmpty) {
                            y5fVar.j(eventDetailsFragment2.F(), eventDetailsFragment2.F().getTournament(), iy5Var.A, Event.getHomeTeam$default(eventDetailsFragment2.F(), r10, 1, r10).getId(), Event.getAwayTeam$default(eventDetailsFragment2.F(), r10, 1, r10).getId(), (z || Intrinsics.c(eventDetailsFragment2.L(), obj2)) ? false : true);
                            Unit unit302 = Unit.a;
                        }
                        c2 = Intrinsics.c(Boolean.valueOf(iy5Var.M), Boolean.TRUE);
                        joa joaVar92 = eventDetailsFragment2.S0;
                        if (c2) {
                        }
                        joa joaVar102 = eventDetailsFragment2.g0;
                        joa joaVar112 = eventDetailsFragment2.e0;
                        if (z) {
                        }
                        list3 = iy5Var.B;
                        if (list3 != null) {
                        }
                        s5jVar = (s5j) eventDetailsFragment2.Q0.getValue();
                        if (s5jVar != null) {
                        }
                        list4 = iy5Var.F;
                        if (list4 != null) {
                        }
                        on1Var = (on1) eventDetailsFragment2.T0.getValue();
                        if (on1Var != null) {
                        }
                        gv9Var3 = iy5Var.O;
                        if (gv9Var3 != null) {
                            wm1Var.setData(gv9Var3);
                            Unit unit452 = Unit.a;
                        }
                        joa joaVar122 = eventDetailsFragment2.c0;
                        if (list2 != null) {
                        }
                        list5 = list2;
                        promotionalOffersBannerView = (PromotionalOffersBannerView) joaVar122.getValue();
                        if (promotionalOffersBannerView != null) {
                        }
                    }
                }
                eventDetailsFragment = this;
                ky5Var = iy5Var.k;
                if (ky5Var != null) {
                    k3Var.l(ky5Var, !qea.y(Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null)) && qea.y(Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null)));
                    Unit unit82 = Unit.a;
                }
                viewParent = (o8) eventDetailsFragment.w0.getValue();
                if (viewParent instanceof om1) {
                }
                gv9Var = iy5Var.L;
                if (gv9Var != null) {
                    vb6Var.l(gv9Var);
                    Unit unit92 = Unit.a;
                }
                n6jVar = iy5Var.q;
                if (n6jVar != null) {
                    Event F52 = eventDetailsFragment.F();
                    int i62 = p6j.k;
                    p6jVar.l(n6jVar, F52, true, false, null);
                    Unit unit102 = Unit.a;
                }
                if (lineupsResponse != null) {
                }
                r10 = 0;
                gv9Var2 = null;
                joa joaVar222 = eventDetailsFragment.t0;
                joa joaVar322 = eventDetailsFragment.s0;
                joa joaVar422 = eventDetailsFragment.r0;
                if (gv9Var2 != null) {
                }
                vteVar = iy5Var.x;
                if (vteVar != null) {
                }
                joa joaVar522 = eventDetailsFragment.Z;
                if (pregameFormResponse != null) {
                }
                c = Intrinsics.c(eventDetailsFragment.L(), obj);
                joa joaVar622 = eventDetailsFragment.C0;
                if (c) {
                }
                ((xvb) joaVar622.getValue()).j(eventDetailsFragment.F(), iy5Var.I, iy5Var.J);
                oteVar = (ote) eventDetailsFragment.B0.getValue();
                if (oteVar != null) {
                }
                seasonInfo = iy5Var.p;
                if (seasonInfo != null) {
                }
                edeVar = (ede) eventDetailsFragment.X.getValue();
                if (edeVar != null) {
                }
                joa joaVar722 = eventDetailsFragment.i0;
                if (eventGraphResponse != null) {
                }
                xtVar = (xt) eventDetailsFragment.l0.getValue();
                if (xtVar != null) {
                }
                w04Var = (w04) eventDetailsFragment.j0.getValue();
                if (w04Var != null) {
                }
                r1 = (CricketWagonWheelView) eventDetailsFragment.k0.getValue();
                if (r1 != 0) {
                }
                d66Var = (d66) eventDetailsFragment.h0.getValue();
                if (d66Var != null) {
                }
                ji5Var = (ji5) eventDetailsFragment.T.getValue();
                if (ji5Var != null) {
                }
                ny5Var = iy5Var.H;
                if (ny5Var != null) {
                }
                rhVar = (rh) eventDetailsFragment2.J0.getValue();
                if (rhVar != null) {
                }
                isEmpty = list.isEmpty();
                joa joaVar822 = eventDetailsFragment2.O0;
                if (!isEmpty) {
                }
                c2 = Intrinsics.c(Boolean.valueOf(iy5Var.M), Boolean.TRUE);
                joa joaVar922 = eventDetailsFragment2.S0;
                if (c2) {
                }
                joa joaVar1022 = eventDetailsFragment2.g0;
                joa joaVar1122 = eventDetailsFragment2.e0;
                if (z) {
                }
                list3 = iy5Var.B;
                if (list3 != null) {
                }
                s5jVar = (s5j) eventDetailsFragment2.Q0.getValue();
                if (s5jVar != null) {
                }
                list4 = iy5Var.F;
                if (list4 != null) {
                }
                on1Var = (on1) eventDetailsFragment2.T0.getValue();
                if (on1Var != null) {
                }
                gv9Var3 = iy5Var.O;
                if (gv9Var3 != null) {
                }
                joa joaVar1222 = eventDetailsFragment2.c0;
                if (list2 != null) {
                }
                list5 = list2;
                promotionalOffersBannerView = (PromotionalOffersBannerView) joaVar1222.getValue();
                if (promotionalOffersBannerView != null) {
                }
            }
        }
        c68Var.setVisibility(0);
        if (z5) {
            zl zlVar = gy4Var.c;
            eventGraphResponse = eventGraphResponse2;
            LinearLayout linearLayout = (LinearLayout) zlVar.f;
            obj = Sports.MMA;
            ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
            pregameFormResponse = pregameFormResponse3;
            linearLayout.setVisibility(0);
            ((ImageView) zlVar.d).setVisibility(8);
            ((ImageView) zlVar.n).setVisibility(8);
            TextView textView = zlVar.g;
            if (ok3.x(F2)) {
                eventBestPlayersResponse = eventBestPlayersResponse3;
                string = c68Var.getContext().getString(R.string.first_leg);
            } else {
                eventBestPlayersResponse = eventBestPlayersResponse3;
                string = Intrinsics.c(ok3.s(F2), Sports.TENNIS) ? c68Var.getContext().getString(R.string.tennis_previous_match) : d68.a.contains(ok3.s(F2)) ? c68Var.getContext().getString(R.string.any_sport_previous_game) : c68Var.getContext().getString(R.string.previous_match);
            }
            textView.setText(string);
            Integer previousLegEventId = F2.getPreviousLegEventId();
            if (previousLegEventId != null) {
                int intValue3 = previousLegEventId.intValue();
                constraintLayout.setBackground(c68Var.getContext().getDrawable(R.drawable.selector_surface_2));
                constraintLayout.setOnClickListener(new l8(c68Var, intValue3, 2));
            }
            ((ImageView) zlVar.e).setVisibility(0);
            ((View) zlVar.i).setVisibility(0);
            Integer num5 = my5Var4.b;
            if (num5 != null) {
                as9.o((ImageView) zlVar.c, num5.intValue());
            }
            Integer num6 = my5Var2.b;
            if (num6 != null) {
                as9.o((ImageView) zlVar.m, num6.intValue());
            }
            i3 = 1;
            me4.s(new Object[]{num}, 1, dla.d(), "%d", (TextView) zlVar.j);
            me4.s(new Object[]{num2}, 1, dla.d(), "%d", (TextView) zlVar.k);
        } else {
            eventGraphResponse = eventGraphResponse2;
            obj = Sports.MMA;
            pregameFormResponse = pregameFormResponse3;
            eventBestPlayersResponse = eventBestPlayersResponse3;
            i3 = 1;
            ((LinearLayout) gy4Var.c.f).setVisibility(4);
        }
        if (ok3.x(F2) || !(Event.getHomeScore$default(F2, null, i3, null).getSeries() == null || Event.getAwayScore$default(F2, null, i3, null).getSeries() == null)) {
            zl zlVar2 = gy4Var.b;
            ImageView imageView = (ImageView) zlVar2.m;
            ImageView imageView2 = (ImageView) zlVar2.c;
            LinearLayout linearLayout2 = (LinearLayout) zlVar2.f;
            TextView textView2 = (TextView) zlVar2.k;
            TextView textView3 = (TextView) zlVar2.j;
            ImageView imageView3 = (ImageView) zlVar2.n;
            obj2 = Sports.TENNIS;
            ImageView imageView4 = (ImageView) zlVar2.d;
            zsiVar = zsiVar2;
            linearLayout2.setVisibility(0);
            boolean x = ok3.x(F2);
            TextView textView4 = zlVar2.g;
            if (x) {
                textView4.setText(c68Var.getContext().getString(R.string.aggregate));
                Integer aggregated = Event.getHomeScore$default(F2, null, 1, null).getAggregated();
                if (aggregated != null) {
                    int intValue4 = aggregated.intValue();
                    Integer aggregated2 = Event.getAwayScore$default(F2, null, 1, null).getAggregated();
                    if (aggregated2 != null) {
                        int intValue5 = aggregated2.intValue();
                        textView3.setText(String.format(dla.d(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue4)}, 1)));
                        me4.s(new Object[]{Integer.valueOf(intValue5)}, 1, dla.d(), "%d", textView2);
                    }
                }
            } else {
                textView4.setText(c68Var.getContext().getString(R.string.series));
                ((ConstraintLayout) zlVar2.b).setBackground(c68Var.getContext().getDrawable(R.drawable.selector_surface_2));
                Integer series = Event.getHomeScore$default(F2, null, 1, null).getSeries();
                if (series != null) {
                    int intValue6 = series.intValue();
                    Integer series2 = Event.getAwayScore$default(F2, null, 1, null).getSeries();
                    if (series2 != null) {
                        int intValue7 = series2.intValue();
                        textView3.setText(String.format(dla.d(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue6)}, 1)));
                        me4.s(new Object[]{Integer.valueOf(intValue7)}, 1, dla.d(), "%d", textView2);
                    }
                }
                ((View) zlVar2.l).setVisibility(0);
                ((ImageView) zlVar2.h).setVisibility(0);
                linearLayout2.setOnClickListener(new au7(c68Var, F2, 5));
            }
            if (my5Var4.a) {
                Country country6 = Event.getHomeTeam$default(F2, null, 1, null).getCountry();
                if (country6 == null || (alpha2 = country6.getAlpha2()) == null) {
                    SubTeam subTeam1 = Event.getHomeTeam$default(F2, null, 1, null).getSubTeam1();
                    alpha2 = (subTeam1 == null || (country2 = subTeam1.getCountry()) == null) ? null : country2.getAlpha2();
                    if (alpha2 == null) {
                        SubTeam subTeam2 = Event.getHomeTeam$default(F2, null, 1, null).getSubTeam2();
                        if (subTeam2 == null || (country = subTeam2.getCountry()) == null) {
                            str = null;
                            country3 = Event.getAwayTeam$default(F2, null, 1, null).getCountry();
                            if (country3 != null || (alpha23 = country3.getAlpha2()) == null) {
                                SubTeam subTeam12 = Event.getAwayTeam$default(F2, null, 1, null).getSubTeam1();
                                alpha22 = (subTeam12 != null || (country5 = subTeam12.getCountry()) == null) ? null : country5.getAlpha2();
                                if (alpha22 == null) {
                                    SubTeam subTeam22 = Event.getAwayTeam$default(F2, null, 1, null).getSubTeam2();
                                    alpha22 = (subTeam22 == null || (country4 = subTeam22.getCountry()) == null) ? null : country4.getAlpha2();
                                }
                            } else {
                                alpha22 = alpha23;
                            }
                            teamSides = null;
                            as9.c(imageView2, str, false, null, 6);
                            as9.c(imageView, alpha22, false, null, 6);
                            i4 = 1;
                        } else {
                            alpha2 = country.getAlpha2();
                        }
                    }
                }
                str = alpha2;
                country3 = Event.getAwayTeam$default(F2, null, 1, null).getCountry();
                if (country3 != null) {
                }
                SubTeam subTeam122 = Event.getAwayTeam$default(F2, null, 1, null).getSubTeam1();
                if (subTeam122 != null) {
                }
                if (alpha22 == null) {
                }
                teamSides = null;
                as9.c(imageView2, str, false, null, 6);
                as9.c(imageView, alpha22, false, null, 6);
                i4 = 1;
            } else {
                i4 = 1;
                teamSides = null;
                as9.o(imageView2, Event.getHomeTeam$default(F2, null, 1, null).getId());
                as9.o(imageView, Event.getAwayTeam$default(F2, null, 1, null).getId());
            }
            Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(F2, teamSides, i4, teamSides);
            if (aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == i4) {
                imageView4.setVisibility(0);
                imageView3.setVisibility(8);
            } else if (aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == 2) {
                imageView4.setVisibility(8);
                imageView3.setVisibility(0);
            } else {
                imageView4.setVisibility(8);
                imageView3.setVisibility(8);
            }
            if (lineupsResponse != null) {
            }
            eventDetailsFragment = this;
            ky5Var = iy5Var.k;
            if (ky5Var != null) {
            }
            viewParent = (o8) eventDetailsFragment.w0.getValue();
            if (viewParent instanceof om1) {
            }
            gv9Var = iy5Var.L;
            if (gv9Var != null) {
            }
            n6jVar = iy5Var.q;
            if (n6jVar != null) {
            }
            if (lineupsResponse != null) {
            }
            r10 = 0;
            gv9Var2 = null;
            joa joaVar2222 = eventDetailsFragment.t0;
            joa joaVar3222 = eventDetailsFragment.s0;
            joa joaVar4222 = eventDetailsFragment.r0;
            if (gv9Var2 != null) {
            }
            vteVar = iy5Var.x;
            if (vteVar != null) {
            }
            joa joaVar5222 = eventDetailsFragment.Z;
            if (pregameFormResponse != null) {
            }
            c = Intrinsics.c(eventDetailsFragment.L(), obj);
            joa joaVar6222 = eventDetailsFragment.C0;
            if (c) {
            }
            ((xvb) joaVar6222.getValue()).j(eventDetailsFragment.F(), iy5Var.I, iy5Var.J);
            oteVar = (ote) eventDetailsFragment.B0.getValue();
            if (oteVar != null) {
            }
            seasonInfo = iy5Var.p;
            if (seasonInfo != null) {
            }
            edeVar = (ede) eventDetailsFragment.X.getValue();
            if (edeVar != null) {
            }
            joa joaVar7222 = eventDetailsFragment.i0;
            if (eventGraphResponse != null) {
            }
            xtVar = (xt) eventDetailsFragment.l0.getValue();
            if (xtVar != null) {
            }
            w04Var = (w04) eventDetailsFragment.j0.getValue();
            if (w04Var != null) {
            }
            r1 = (CricketWagonWheelView) eventDetailsFragment.k0.getValue();
            if (r1 != 0) {
            }
            d66Var = (d66) eventDetailsFragment.h0.getValue();
            if (d66Var != null) {
            }
            ji5Var = (ji5) eventDetailsFragment.T.getValue();
            if (ji5Var != null) {
            }
            ny5Var = iy5Var.H;
            if (ny5Var != null) {
            }
            rhVar = (rh) eventDetailsFragment2.J0.getValue();
            if (rhVar != null) {
            }
            isEmpty = list.isEmpty();
            joa joaVar8222 = eventDetailsFragment2.O0;
            if (!isEmpty) {
            }
            c2 = Intrinsics.c(Boolean.valueOf(iy5Var.M), Boolean.TRUE);
            joa joaVar9222 = eventDetailsFragment2.S0;
            if (c2) {
            }
            joa joaVar10222 = eventDetailsFragment2.g0;
            joa joaVar11222 = eventDetailsFragment2.e0;
            if (z) {
            }
            list3 = iy5Var.B;
            if (list3 != null) {
            }
            s5jVar = (s5j) eventDetailsFragment2.Q0.getValue();
            if (s5jVar != null) {
            }
            list4 = iy5Var.F;
            if (list4 != null) {
            }
            on1Var = (on1) eventDetailsFragment2.T0.getValue();
            if (on1Var != null) {
            }
            gv9Var3 = iy5Var.O;
            if (gv9Var3 != null) {
            }
            joa joaVar12222 = eventDetailsFragment2.c0;
            if (list2 != null) {
            }
            list5 = list2;
            promotionalOffersBannerView = (PromotionalOffersBannerView) joaVar12222.getValue();
            if (promotionalOffersBannerView != null) {
            }
        } else {
            ((LinearLayout) gy4Var.b.f).setVisibility(4);
            zsiVar = zsiVar2;
            obj2 = Sports.TENNIS;
            if (lineupsResponse != null) {
            }
            eventDetailsFragment = this;
            ky5Var = iy5Var.k;
            if (ky5Var != null) {
            }
            viewParent = (o8) eventDetailsFragment.w0.getValue();
            if (viewParent instanceof om1) {
            }
            gv9Var = iy5Var.L;
            if (gv9Var != null) {
            }
            n6jVar = iy5Var.q;
            if (n6jVar != null) {
            }
            if (lineupsResponse != null) {
            }
            r10 = 0;
            gv9Var2 = null;
            joa joaVar22222 = eventDetailsFragment.t0;
            joa joaVar32222 = eventDetailsFragment.s0;
            joa joaVar42222 = eventDetailsFragment.r0;
            if (gv9Var2 != null) {
            }
            vteVar = iy5Var.x;
            if (vteVar != null) {
            }
            joa joaVar52222 = eventDetailsFragment.Z;
            if (pregameFormResponse != null) {
            }
            c = Intrinsics.c(eventDetailsFragment.L(), obj);
            joa joaVar62222 = eventDetailsFragment.C0;
            if (c) {
            }
            ((xvb) joaVar62222.getValue()).j(eventDetailsFragment.F(), iy5Var.I, iy5Var.J);
            oteVar = (ote) eventDetailsFragment.B0.getValue();
            if (oteVar != null) {
            }
            seasonInfo = iy5Var.p;
            if (seasonInfo != null) {
            }
            edeVar = (ede) eventDetailsFragment.X.getValue();
            if (edeVar != null) {
            }
            joa joaVar72222 = eventDetailsFragment.i0;
            if (eventGraphResponse != null) {
            }
            xtVar = (xt) eventDetailsFragment.l0.getValue();
            if (xtVar != null) {
            }
            w04Var = (w04) eventDetailsFragment.j0.getValue();
            if (w04Var != null) {
            }
            r1 = (CricketWagonWheelView) eventDetailsFragment.k0.getValue();
            if (r1 != 0) {
            }
            d66Var = (d66) eventDetailsFragment.h0.getValue();
            if (d66Var != null) {
            }
            ji5Var = (ji5) eventDetailsFragment.T.getValue();
            if (ji5Var != null) {
            }
            ny5Var = iy5Var.H;
            if (ny5Var != null) {
            }
            rhVar = (rh) eventDetailsFragment2.J0.getValue();
            if (rhVar != null) {
            }
            isEmpty = list.isEmpty();
            joa joaVar82222 = eventDetailsFragment2.O0;
            if (!isEmpty) {
            }
            c2 = Intrinsics.c(Boolean.valueOf(iy5Var.M), Boolean.TRUE);
            joa joaVar92222 = eventDetailsFragment2.S0;
            if (c2) {
            }
            joa joaVar102222 = eventDetailsFragment2.g0;
            joa joaVar112222 = eventDetailsFragment2.e0;
            if (z) {
            }
            list3 = iy5Var.B;
            if (list3 != null) {
            }
            s5jVar = (s5j) eventDetailsFragment2.Q0.getValue();
            if (s5jVar != null) {
            }
            list4 = iy5Var.F;
            if (list4 != null) {
            }
            on1Var = (on1) eventDetailsFragment2.T0.getValue();
            if (on1Var != null) {
            }
            gv9Var3 = iy5Var.O;
            if (gv9Var3 != null) {
            }
            joa joaVar122222 = eventDetailsFragment2.c0;
            if (list2 != null) {
            }
            list5 = list2;
            promotionalOffersBannerView = (PromotionalOffersBannerView) joaVar122222.getValue();
            if (promotionalOffersBannerView != null) {
            }
        }
    }

    public final void S(List list, boolean z) {
        View view;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ez5 ez5Var = (ez5) it.next();
            g7 g7Var = this.D;
            if (g7Var == null) {
                Intrinsics.i(L6.G1);
                throw null;
            }
            switch (ez5Var.ordinal()) {
                case 0:
                    view = (ii5) this.Q.getValue();
                    break;
                case 1:
                    view = (z06) this.R.getValue();
                    break;
                case 2:
                    view = C();
                    break;
                case 3:
                    view = (InformationView) this.U.getValue();
                    break;
                case 4:
                    view = (eqc) this.I0.getValue();
                    break;
                case 5:
                    view = (ilc) this.G0.getValue();
                    break;
                case 6:
                    view = (FeaturedOddsView) this.q0.getValue();
                    break;
                case 7:
                    view = (bld) this.p0.getValue();
                    break;
                case 8:
                    view = (AdBannerView) this.o0.getValue();
                    break;
                case 9:
                    view = (bhi) this.L.getValue();
                    break;
                case 10:
                    view = (geb) this.S0.getValue();
                    break;
                case 11:
                    view = (ede) this.X.getValue();
                    break;
                case 12:
                    view = (na9) this.m0.getValue();
                    break;
                case 13:
                    view = (c4f) this.P.getValue();
                    break;
                case 14:
                    view = (y5f) this.O0.getValue();
                    break;
                case 15:
                    view = (z5f) this.P0.getValue();
                    break;
                case 16:
                    view = (d66) this.h0.getValue();
                    break;
                case 17:
                    view = (h4) this.i0.getValue();
                    break;
                case 18:
                    view = (p6j) this.A0.getValue();
                    break;
                case 19:
                    view = (o8) this.w0.getValue();
                    break;
                case 20:
                    view = (xt) this.l0.getValue();
                    break;
                case 21:
                    view = (w04) this.j0.getValue();
                    break;
                case 22:
                    view = (CricketWagonWheelView) this.k0.getValue();
                    break;
                case 23:
                    view = (c68) this.Y.getValue();
                    break;
                case 24:
                    view = (v5f) this.Z.getValue();
                    break;
                case 25:
                    view = (cu1) this.s0.getValue();
                    break;
                case 26:
                    view = (od5) this.t0.getValue();
                    break;
                case 27:
                    view = (me9) this.z0.getValue();
                    break;
                case 28:
                    view = (vb6) this.x0.getValue();
                    break;
                case 29:
                    view = (TypeHeaderView) this.u0.getValue();
                    break;
                case 30:
                    view = (lmj) this.r0.getValue();
                    break;
                case 31:
                    view = (PromotionBannerView) this.a0.getValue();
                    break;
                case 32:
                    view = (PromotionBannerView) this.b0.getValue();
                    break;
                case 33:
                    view = (k3k) this.S.getValue();
                    break;
                case 34:
                    view = (r63) this.e0.getValue();
                    break;
                case 35:
                    view = (ic6) this.f0.getValue();
                    break;
                case 36:
                    view = (g5j) this.g0.getValue();
                    break;
                case 37:
                    view = (kqc) this.d0.getValue();
                    break;
                case 38:
                    view = (ksc) this.H0.getValue();
                    break;
                case 39:
                    view = (h08) this.D0.getValue();
                    break;
                case 40:
                    view = (ote) this.B0.getValue();
                    break;
                case 41:
                    view = (xvb) this.C0.getValue();
                    break;
                case 42:
                    view = (oq5) this.E0.getValue();
                    break;
                case 43:
                    view = (k3) this.v0.getValue();
                    break;
                case 44:
                    view = (ji5) this.T.getValue();
                    break;
                case 45:
                    view = (s5j) this.Q0.getValue();
                    break;
                case 46:
                    view = (kxk) this.R0.getValue();
                    break;
                case 47:
                    view = (on1) this.T0.getValue();
                    break;
                case 48:
                    view = (e91) this.I.getValue();
                    break;
                case 49:
                    view = (wm1) this.y0.getValue();
                    break;
                case 50:
                    view = (iuh) this.O.getValue();
                    break;
                case 51:
                    view = (PromotionalOffersBannerView) this.c0.getValue();
                    break;
                default:
                    zzl.b();
                    return;
            }
            if (view != null) {
                if (z) {
                    g7Var.p(g7Var.g.size(), view);
                } else {
                    g7.o(g7Var, view, 6);
                }
            }
        }
    }

    public final void T(Player player, Team team, Double d) {
        if (!Intrinsics.c(F().getHasEventPlayerStatistics(), Boolean.TRUE)) {
            int i = PlayerActivity.Z;
            Context requireContext = requireContext();
            requireContext.getClass();
            jle.q(requireContext, player.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
            return;
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        PlayerEventStatisticsModal c = jpe.c(f8h.i(F(), player, team, ok3.u(team.getId(), F()), d, 96), null);
        if (requireContext2 instanceof csk) {
            requireContext2 = ((csk) requireContext2).getBaseContext();
        }
        AppCompatActivity appCompatActivity = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
        if (appCompatActivity != null) {
            me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
        }
    }

    public final void U(Boolean bool) {
        Boolean bool2;
        gx5 gx5Var;
        if (((Boolean) this.V.getValue()).booleanValue() && G().m && (G().j.a.getValue() instanceof tnb)) {
            return;
        }
        boolean z = G().m;
        boolean D = ok3.D(F());
        FeaturedOddsView featuredOddsView = (FeaturedOddsView) this.q0.getValue();
        if (featuredOddsView != null) {
            bool2 = (Boolean) ((eoh) featuredOddsView.isOddsVisible).getValue();
            bool2.booleanValue();
        } else {
            bool2 = null;
        }
        if (z) {
            int i = ke0.c;
            if (D) {
                com.sofascore.model.Country country = zu3.V;
                if (country.hasMcc(Integer.valueOf(i)) || zu3.d0.hasMcc(Integer.valueOf(i)) || zu3.z.hasMcc(Integer.valueOf(i))) {
                    gx5Var = new gx5(zu3.z.hasMcc(Integer.valueOf(i)) || country.hasMcc(Integer.valueOf(i)) || !Intrinsics.c(bool, Boolean.TRUE), true);
                }
            }
            gx5Var = new gx5(Intrinsics.c(bool2, Boolean.FALSE), false);
        } else {
            gx5Var = new gx5(true, false);
        }
        boolean z2 = gx5Var.a;
        joa joaVar = this.o0;
        if (!z2) {
            ((AdBannerView) joaVar.getValue()).b();
            return;
        }
        AdBannerView adBannerView = (AdBannerView) joaVar.getValue();
        AdType.Banner banner = AdType.Banner.BelowOdds;
        adBannerView.getClass();
        banner.getClass();
        if (gx5Var.b) {
            adBannerView.b = false;
        }
        if (adBannerView.b) {
            return;
        }
        adBannerView.c(banner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void V(String str) {
        EventIncidentsResponse eventIncidentsResponse;
        List<Incident> incidents;
        EventIncidentsResponse eventIncidentsResponse2;
        g7 g7Var = this.D;
        List list = 0;
        r1 = null;
        List<Incident> list2 = null;
        list = 0;
        list = 0;
        if (g7Var == null) {
            Intrinsics.i(L6.G1);
            throw null;
        }
        yy9 yy9Var = g7Var instanceof yy9 ? (yy9) g7Var : null;
        if (yy9Var != null) {
            TypeHeaderView typeHeaderView = (TypeHeaderView) this.u0.getValue();
            if ((typeHeaderView != null ? typeHeaderView.getSelectedItem() : null) == null) {
                iy5 iy5Var = (iy5) E().x.d();
                if (iy5Var != null && (eventIncidentsResponse2 = iy5Var.a) != null) {
                    list2 = eventIncidentsResponse2.getIncidents();
                }
                if (list2 == null) {
                    list2 = km5.a;
                }
                yy9Var.G(list2, null, null, false, null);
                return;
            }
            iy5 iy5Var2 = (iy5) E().x.d();
            if (iy5Var2 != null && (eventIncidentsResponse = iy5Var2.a) != null && (incidents = eventIncidentsResponse.getIncidents()) != null) {
                list = new ArrayList();
                for (Object obj : incidents) {
                    Incident incident = (Incident) obj;
                    if (Intrinsics.c(str, "PENALTIES")) {
                        if (!Intrinsics.c(incident.getIncidentType(), IncidentKt.TYPE_SUSPENSION) && !Intrinsics.c(incident.getIncidentType(), "period")) {
                        }
                        list.add(obj);
                    } else if (!Intrinsics.c(incident.getIncidentType(), IncidentKt.TYPE_SUSPENSION)) {
                        list.add(obj);
                    }
                }
            }
            if (list == 0) {
                list = km5.a;
            }
            yy9Var.G(list, null, null, false, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void W() {
        ii5 ii5Var;
        Event F = F();
        ((z06) this.R.getValue()).a(F);
        joa joaVar = this.A0;
        p6j p6jVar = (p6j) joaVar.getValue();
        if (p6jVar != null) {
            p6jVar.n(F, new h84(14, this, F));
        }
        p6j p6jVar2 = (p6j) joaVar.getValue();
        Object obj = null;
        if (p6jVar2 != null) {
            int i = p6j.k;
            p6jVar2.n(F, null);
        }
        InformationView informationView = (InformationView) this.U.getValue();
        UniqueTournament uniqueTournament = F.getTournament().getUniqueTournament();
        Boolean valueOf = uniqueTournament != null ? Boolean.valueOf(uniqueTournament.getHasEventPlayerStatistics()) : null;
        Boolean bool = Boolean.TRUE;
        informationView.p(Intrinsics.c(valueOf, bool) && !Intrinsics.c(F.getHasEventPlayerStatistics(), bool) && ok3.D(F), false);
        if (ok3.E(F()) && F().getFinalResultOnly()) {
            InformationView.o(C(), getString(R.string.final_result_only) + " (FRO)");
            C().p(true, true);
        } else {
            String statusReason = F().getStatusReason();
            if (statusReason == null || statusReason.length() == 0) {
                C().p(false, true);
            } else {
                InformationView C = C();
                Set set = afi.a;
                Context context = getContext();
                String statusReason2 = F().getStatusReason();
                if (context != null) {
                    if (statusReason2 != null) {
                        switch (statusReason2.hashCode()) {
                            case -1909310055:
                                if (statusReason2.equals("Waterlogged pitch")) {
                                    statusReason2 = context.getString(R.string.reason_waterlogged_pitch);
                                    break;
                                }
                                break;
                            case -1644949150:
                                if (statusReason2.equals("Floodlight failure")) {
                                    statusReason2 = context.getString(R.string.reason_floodlight_failure);
                                    break;
                                }
                                break;
                            case -1631414940:
                                if (statusReason2.equals("Crowd trouble")) {
                                    statusReason2 = context.getString(R.string.reason_crowd_trouble);
                                    break;
                                }
                                break;
                            case -1420924006:
                                if (statusReason2.equals("Drinks break")) {
                                    statusReason2 = context.getString(R.string.reason_drinks_break);
                                    break;
                                }
                                break;
                            case -612516201:
                                if (statusReason2.equals("Referee injury")) {
                                    statusReason2 = context.getString(R.string.reason_referee_injury);
                                    break;
                                }
                                break;
                            case -610642448:
                                if (statusReason2.equals("Spectator on pitch")) {
                                    statusReason2 = context.getString(R.string.reason_pitch_invader);
                                    break;
                                }
                                break;
                            case -444290602:
                                if (statusReason2.equals("Object thrown on pitch")) {
                                    statusReason2 = context.getString(R.string.reason_object_thrown_on_pitch);
                                    break;
                                }
                                break;
                            case -258292256:
                                if (statusReason2.equals("Frozen pitch")) {
                                    statusReason2 = context.getString(R.string.reason_frozen_pitch);
                                    break;
                                }
                                break;
                            case -53576586:
                                if (statusReason2.equals("Fixture clash")) {
                                    statusReason2 = context.getString(R.string.reason_fixture_clash);
                                    break;
                                }
                                break;
                            case 70814:
                                if (statusReason2.equals("Fog")) {
                                    statusReason2 = context.getString(R.string.reason_fog);
                                    break;
                                }
                                break;
                            case 2189910:
                                if (statusReason2.equals("Fire")) {
                                    statusReason2 = context.getString(R.string.reason_fire);
                                    break;
                                }
                                break;
                            case 2581923:
                                if (statusReason2.equals("Snow")) {
                                    statusReason2 = context.getString(R.string.reason_snow);
                                    break;
                                }
                                break;
                            case 67876848:
                                if (statusReason2.equals("Fight")) {
                                    statusReason2 = context.getString(R.string.reason_fight);
                                    break;
                                }
                                break;
                            case 286768821:
                                if (statusReason2.equals("Insufficient players")) {
                                    statusReason2 = context.getString(R.string.reason_insufficient_players);
                                    break;
                                }
                                break;
                            case 1000062324:
                                if (statusReason2.equals("Other reason")) {
                                    statusReason2 = context.getString(R.string.other_reason);
                                    break;
                                }
                                break;
                            case 1346640467:
                                if (statusReason2.equals("Weather problem")) {
                                    statusReason2 = context.getString(R.string.reason_weather_problem);
                                    break;
                                }
                                break;
                            case 1637855176:
                                if (statusReason2.equals("Awaiting officials decision")) {
                                    statusReason2 = context.getString(R.string.reason_awaiting_officials_decision);
                                    break;
                                }
                                break;
                        }
                    }
                } else {
                    statusReason2 = null;
                }
                InformationView.o(C, statusReason2);
                C().p(true, true);
            }
        }
        h08 h08Var = (h08) this.D0.getValue();
        if (h08Var != null) {
            h08Var.l(F, true);
            SofaDivider sofaDivider = h08Var.e;
            if (sofaDivider != null) {
                sofaDivider.setDividerVisibility(false);
            }
        }
        if (F.getEventEditorName() != null && (ii5Var = (ii5) this.Q.getValue()) != null) {
            ii5Var.j(F.getEventEditorName(), F.getStatus());
        }
        if (F instanceof MmaEvent) {
            ksc kscVar = (ksc) this.H0.getValue();
            if (kscVar != null) {
                Gender gender = ((MmaEvent) F).getGender();
                ez0 ez0Var = kscVar.d;
                ((MmaStatsHeadDualView) ez0Var.c).q(true, true, gender);
                ((MmaStatsTorsoDualView) ez0Var.e).q(true, true, gender);
                ((MmaStatsLegsDualView) ez0Var.d).q(true, true, gender);
            }
            String fightState = ((MmaEvent) F).getFightState();
            Iterator<E> it = f08.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((f08) next).a.equals(fightState)) {
                        obj = next;
                    }
                }
            }
            f08 f08Var = (f08) obj;
            joa joaVar2 = this.G0;
            if (f08Var == null) {
                ilc ilcVar = (ilc) joaVar2.getValue();
                if (ilcVar != null) {
                    ilcVar.setVisibility(8);
                    return;
                }
                return;
            }
            ilc ilcVar2 = (ilc) joaVar2.getValue();
            if (ilcVar2 != null) {
                ilcVar2.setVisibility(0);
                int ordinal = f08Var.ordinal();
                int i2 = R.color.red_fighter_default;
                int i3 = R.color.blue_fighter_default;
                int i4 = R.color.n_lv_3;
                switch (ordinal) {
                    case 2:
                    case 3:
                        i4 = R.color.red_fighter_default;
                        i2 = R.color.n_lv_1;
                        break;
                    case 4:
                    case 6:
                        i3 = R.color.n_lv_3;
                        i4 = R.color.red_fighter_default;
                        break;
                    case 5:
                    case 7:
                        i2 = R.color.blue_fighter_default;
                        break;
                    default:
                        i2 = R.color.n_lv_3;
                        i3 = i2;
                        break;
                }
                pn2 pn2Var = ilcVar2.d;
                pn2Var.e.setText(f08Var.b);
                pn2Var.e.setTextColor(ilcVar2.getContext().getColor(i2));
                pn2Var.d.setImageTintList(ColorStateList.valueOf(ilcVar2.getContext().getColor(i4)));
                pn2Var.c.setImageTintList(ColorStateList.valueOf(ilcVar2.getContext().getColor(i3)));
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.details_fragment_layout, (ViewGroup) null, false);
        int i = R.id.details_fragment_coordinator;
        if (((CoordinatorLayout) nq8.B(R.id.details_fragment_coordinator, inflate)) != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                return new hy4(swipeRefreshLayout, recyclerView, swipeRefreshLayout);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!D().M || F().getEventEditorName() == null) {
            return;
        }
        D().M = false;
        o();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x008c, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.AUSSIE_RULES) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00ac, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.TABLE_TENNIS) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0139, code lost:
    
        r6 = requireContext();
        r6.getClass();
        r2 = new defpackage.wye(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00b6, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.DARTS) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0122, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0090, code lost:
    
        r6 = requireContext();
        r6.getClass();
        r2 = new defpackage.pif(r6, defpackage.ok3.r(F()));
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0798  */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, Bundle bundle) {
        g7 yy9Var;
        fy5 fy5Var;
        fy5 fy5Var2;
        ksc kscVar;
        this.s = I().n;
        int i = 0;
        U0 = 0;
        int i2 = 2;
        int i3 = 1;
        if (Intrinsics.c(L(), Sports.FOOTBALL)) {
            FragmentActivity requireActivity = requireActivity();
            k0 k0Var = new k0(this, i2);
            u6b viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
            requireActivity().k().i0(ljg.j(F().getId(), "PLAYER_OF_THE_MATCH_VOTE_REQUEST_"), getViewLifecycleOwner(), new ix5(this, i3));
        }
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((hy4) krkVar).c;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, new hx5(this, 8), 2);
        String L = L();
        switch (L.hashCode()) {
            case -2005973498:
                break;
            case -1452201948:
                if (L.equals(Sports.E_SPORTS)) {
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    yy9Var = new mq5(requireContext);
                    break;
                }
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                yy9Var = new yy9(requireContext2, ok3.r(F()));
                break;
            case -1160328212:
                if (L.equals(Sports.VOLLEYBALL)) {
                    Context requireContext3 = requireContext();
                    requireContext3.getClass();
                    yy9Var = new lxk(requireContext3, ok3.r(F()));
                    break;
                }
                Context requireContext22 = requireContext();
                requireContext22.getClass();
                yy9Var = new yy9(requireContext22, ok3.r(F()));
                break;
            case -877324069:
                if (L.equals(Sports.TENNIS)) {
                    List<Integer> childEvents = F().getChildEvents();
                    if (childEvents != null && !childEvents.isEmpty()) {
                        Context requireContext4 = requireContext();
                        requireContext4.getClass();
                        yy9Var = new xk4(requireContext4);
                        break;
                    } else {
                        Context requireContext5 = requireContext();
                        requireContext5.getClass();
                        yy9Var = new wye(requireContext5);
                        break;
                    }
                }
                Context requireContext222 = requireContext();
                requireContext222.getClass();
                yy9Var = new yy9(requireContext222, ok3.r(F()));
                break;
            case 95355092:
                break;
            case 203883450:
                break;
            case 470363802:
                break;
            case 727149765:
                break;
            default:
                Context requireContext2222 = requireContext();
                requireContext2222.getClass();
                yy9Var = new yy9(requireContext2222, ok3.r(F()));
                break;
        }
        this.D = yy9Var;
        yy9Var.a.d = new nx5(this, i3);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((hy4) krkVar2).b;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((hy4) krkVar3).b;
        g7 g7Var = this.D;
        if (g7Var == null) {
            Intrinsics.i(L6.G1);
            throw null;
        }
        recyclerView2.setAdapter(g7Var);
        Event F = F();
        String sportSlug = F.getSportSlug();
        switch (sportSlug.hashCode()) {
            case -2002238939:
                if (sportSlug.equals(Sports.ICE_HOCKEY)) {
                    if (!ok3.E(F)) {
                        if (!ok3.D(F)) {
                            fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.q, ez5.s, ez5.A, ez5.w, ez5.C}), b.j(ez5.B, ez5.R, ez5.F, ez5.Y, ez5.m, ez5.O, ez5.G, ez5.x));
                            fy5Var = fy5Var2;
                            break;
                        } else {
                            fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.q, ez5.s, ez5.y, ez5.w, ez5.C), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.O, ez5.G, ez5.x));
                            break;
                        }
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.w, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                    fy5Var = new fy5(b.j(ez5.V, ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.w, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G));
                    break;
                } else {
                    ez5 ez5Var = ez5.V;
                    ez5 ez5Var2 = ez5.a;
                    ez5 ez5Var3 = ez5.b;
                    ez5 ez5Var4 = ez5.c;
                    ez5 ez5Var5 = ez5.f;
                    ez5 ez5Var6 = ez5.g;
                    ez5 ez5Var7 = ez5.h;
                    ez5 ez5Var8 = ez5.q;
                    ez5 ez5Var9 = ez5.j;
                    ez5 ez5Var10 = ez5.i;
                    if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType())) {
                        ez5Var10 = null;
                    }
                    ez5 ez5Var11 = ez5.l;
                    if (ok3.D(F)) {
                        ez5Var11 = null;
                    }
                    fy5Var = new fy5(ph0.x(new ez5[]{ez5Var, ez5Var2, ez5Var3, ez5Var4, ez5Var5, ez5Var6, ez5Var7, ez5Var8, ez5Var9, ez5Var10, ez5Var11, ez5.k, ez5.s, ez5.U, ez5.W, ez5.y, ez5.w}), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.O, ez5.G, ez5.x));
                    break;
                }
            case -1452201948:
                if (sportSlug.equals(Sports.E_SPORTS)) {
                    if (!ok3.E(F)) {
                        fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l}), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.O, ez5.P, ez5.G, ez5.x));
                        fy5Var = fy5Var2;
                        break;
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.l, ez5.m, ez5.i, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.P, ez5.G));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case -1160328212:
                if (sportSlug.equals(Sports.VOLLEYBALL)) {
                    if (!ok3.E(F)) {
                        fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.k, ez5.s, ez5.T, ez5.z, ez5.w}), b.j(ez5.R, ez5.m, ez5.O, ez5.G, ez5.x, ez5.Y));
                        fy5Var = fy5Var2;
                        break;
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.w, ez5.n, ez5.x), b.j(ez5.R, ez5.O, ez5.G, ez5.Y));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case -877324069:
                if (sportSlug.equals(Sports.TENNIS)) {
                    if (!ok3.E(F)) {
                        if (!ok3.D(F)) {
                            fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.r, ez5.w}), b.j(ez5.R, ez5.m, ez5.S, ez5.F, ez5.Y, ez5.O, ez5.x, ez5.G));
                            fy5Var = fy5Var2;
                            break;
                        } else {
                            fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.j, ez5.g, ez5.h, ez5.i, ez5.l, ez5.r, ez5.w), b.j(ez5.R, ez5.m, ez5.S, ez5.F, ez5.Y, ez5.O, ez5.G));
                            break;
                        }
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.S, ez5.J, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case -83759494:
                if (sportSlug.equals(Sports.AMERICAN_FOOTBALL)) {
                    if (!ok3.E(F)) {
                        fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.s, ez5.t, ez5.y}), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.O, ez5.G, ez5.x));
                        fy5Var = fy5Var2;
                        break;
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case 108225:
                if (sportSlug.equals(Sports.MMA)) {
                    if (!ok3.D(F)) {
                        fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.d, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.R, ez5.m, ez5.L, ez5.M}), b.j(ez5.O, ez5.K, ez5.G, ez5.Y));
                        fy5Var = fy5Var2;
                        break;
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.d, ez5.e, ez5.m, ez5.M), b.j(ez5.R, ez5.O, ez5.G, ez5.K, ez5.Y));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case 394668909:
                if (sportSlug.equals(Sports.FOOTBALL)) {
                    if (!ok3.E(F)) {
                        if (!ok3.D(F)) {
                            fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.k, ez5.q, ez5.j, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.p, ez5.w}), b.j(ez5.D, ez5.R, ez5.F, ez5.Y, ez5.m, ez5.H, ez5.O, ez5.G, ez5.x, ez5.X));
                            fy5Var = fy5Var2;
                            break;
                        } else {
                            fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.k, ez5.q, ez5.j, ez5.i, ez5.p, ez5.w), b.j(ez5.o, ez5.D, ez5.R, ez5.F, ez5.Y, ez5.m, ez5.H, ez5.O, ez5.G, ez5.x, ez5.X));
                            break;
                        }
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.o, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.H, ez5.w, ez5.n, ez5.x, ez5.I), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G, ez5.Q, ez5.X));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case 727149765:
                if (sportSlug.equals(Sports.BASKETBALL)) {
                    if (!ok3.E(F)) {
                        if (!ok3.D(F)) {
                            fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.q, ez5.j, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.s, ez5.z, ez5.w}), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.H, ez5.O, ez5.G, ez5.x, ez5.E));
                            fy5Var = fy5Var2;
                            break;
                        } else {
                            fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.q, ez5.j, ez5.i, ez5.s, ez5.y, ez5.w), b.j(ez5.R, ez5.F, ez5.Y, ez5.m, ez5.H, ez5.O, ez5.G, ez5.x, ez5.E));
                            break;
                        }
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.H, ez5.w, ez5.n, ez5.x, ez5.E), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G, ez5.Q));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            case 1032299505:
                if (sportSlug.equals(Sports.CRICKET)) {
                    if (!ok3.E(F)) {
                        fy5Var2 = new fy5(ph0.x(new ez5[]{ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, !ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(F.getStatusType()) ? ez5.i : null, ez5.l, ez5.s, ez5.u, ez5.v, ez5.R}), b.j(ez5.m, ez5.N, ez5.O, ez5.G, ez5.x, ez5.Y));
                        fy5Var = fy5Var2;
                        break;
                    } else {
                        fy5Var = new fy5(b.j(ez5.a, ez5.b, ez5.c, ez5.f, ez5.g, ez5.h, ez5.i, ez5.l, ez5.m, ez5.n, ez5.x), b.j(ez5.R, ez5.F, ez5.Y, ez5.O, ez5.G));
                        break;
                    }
                }
                if (!ok3.E(F)) {
                }
                break;
            default:
                if (!ok3.E(F)) {
                }
                break;
        }
        S(fy5Var.a, true);
        S(fy5Var.b, false);
        if (Intrinsics.c(L(), Sports.BASEBALL)) {
            z8e.y(this, E().u, new wx5(this, rq3Var, i));
        }
        z8e.y(this, E().v, new wx5(this, rq3Var, i3));
        dz5 E = E();
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        E.g(viewLifecycleOwner2, new hx5(this, 10));
        E().g.e(getViewLifecycleOwner(), new z1(9, new jx5(this, i)));
        ((jqc) this.C.getValue()).e.e(getViewLifecycleOwner(), new z1(9, new jx5(this, i3)));
        D().v.e(getViewLifecycleOwner(), new z1(9, new jx5(this, 2)));
        if (((Boolean) this.V.getValue()).booleanValue()) {
            z8e.y(this, G().j, new r1(this, rq3Var, 20));
        }
        E().x.e(getViewLifecycleOwner(), new z1(9, new jx5(this, 3)));
        String string = F().shouldReverseTeams() ? getString(R.string.toolbar_subtitle_template_reversed) : getString(R.string.toolbar_subtitle_template);
        string.getClass();
        ((lec) E().h.c).e(getViewLifecycleOwner(), new z1(9, new xw5(i3, this, string)));
        E().z.e(getViewLifecycleOwner(), new z1(9, new jx5(this, 4)));
        I().f.e(getViewLifecycleOwner(), new z1(9, new jx5(this, 5)));
        D().R.e(this, new z1(9, new jx5(this, 6)));
        joa joaVar = this.H0;
        ksc kscVar2 = (ksc) joaVar.getValue();
        if (kscVar2 != null) {
            ((d46) this.B.getValue()).h.e(this, new z1(9, new kz3(kscVar2, 22)));
        }
        if ((F() instanceof MmaEvent) && (kscVar = (ksc) joaVar.getValue()) != null) {
            Gender r = ok3.r(F());
            ez0 ez0Var = kscVar.d;
            ((MmaStatsHeadDualView) ez0Var.c).q(true, true, r);
            ((MmaStatsTorsoDualView) ez0Var.e).q(true, true, r);
            ((MmaStatsLegsDualView) ez0Var.d).q(true, true, r);
        }
        ((z06) this.R.getValue()).a(F());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        bhi bhiVar;
        dz5 E = E();
        Event F = F();
        String s = ok3.s(F);
        iz2 z = un0.z(E);
        hs4 hs4Var = z45.a;
        rq3 rq3Var = null;
        xw3.L(z, hq4.c, null, new yy5(F, s, E, null), 2);
        tu7 G = G();
        Event F2 = F();
        if (G.m) {
            xw3.L(un0.z(G), null, null, new pu7(G, F2, null), 3);
        }
        if (((ksc) this.H0.getValue()) != null) {
            d46 d46Var = (d46) this.B.getValue();
            xw3.L(un0.z(d46Var), null, null, new ce4(d46Var, F(), rq3Var, 16), 3);
        }
        if (!(this.K instanceof pa9) || (bhiVar = (bhi) this.L.getValue()) == null) {
            return;
        }
        Event F3 = F();
        if ((bhiVar.s == null || Boolean.valueOf(!r2.isPlaying()).equals(Boolean.TRUE)) && ok3.D(F3) && !bhiVar.y) {
            this.H = true;
            Integer streamContentId = F().getStreamContentId();
            if (streamContentId != null) {
                E().t(streamContentId.intValue(), F());
            }
            Unit unit = Unit.a;
        }
    }
}
