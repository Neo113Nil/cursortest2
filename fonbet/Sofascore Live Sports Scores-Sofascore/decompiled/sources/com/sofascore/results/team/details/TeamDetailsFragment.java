package com.sofascore.results.team.details;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.i;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.Money;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.RecentTeamTournamentsResponse;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.details.view.TeamInfoView;
import com.sofascore.results.team.details.view.TeamRecentFormView;
import com.sofascore.results.team.details.view.TeamSalaryCapInfoView;
import com.sofascore.results.team.details.view.TeamTournamentsInfoView;
import com.sofascore.results.team.details.view.TennisGrandSlamPerformanceView;
import com.sofascore.results.team.details.view.TennisPlayerRankingView;
import com.sofascore.results.team.details.view.TennisPrizeFactsView;
import com.sofascore.results.team.details.view.TennisProfileFactsView;
import com.sofascore.results.view.CardCtaWithTitleView;
import com.sofascore.results.view.FeaturedMatchView;
import com.sofascore.results.view.SuggestEditView;
import com.sofascore.results.view.branding.BrandingHeaderView;
import defpackage.bu7;
import defpackage.dsi;
import defpackage.duf;
import defpackage.fl8;
import defpackage.fuf;
import defpackage.gvi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ioe;
import defpackage.iz2;
import defpackage.joa;
import defpackage.krk;
import defpackage.kvi;
import defpackage.lvi;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.nui;
import defpackage.nvi;
import defpackage.otk;
import defpackage.pvi;
import defpackage.qu7;
import defpackage.rq3;
import defpackage.tz9;
import defpackage.ug5;
import defpackage.un0;
import defpackage.vmd;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.zsk;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoUnit;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/details/TeamDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lgvi;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamDetailsFragment extends Hilt_TeamDetailsFragment<gvi> {
    public final joa r;
    public final otk s;
    public final otk t;
    public final otk u;
    public boolean v;
    public zsk w;
    public final joa x;
    public final joa y;

    public TeamDetailsFragment() {
        kvi kviVar = new kvi(this, 0);
        ysa ysaVar = ysa.c;
        this.r = ypa.a(ysaVar, kviVar);
        fuf fufVar = duf.a;
        this.s = new otk(fufVar.getOrCreateKotlinClass(pvi.class), new lvi(this, 0), new lvi(this, 2), new lvi(this, 1));
        this.t = new otk(fufVar.getOrCreateKotlinClass(nui.class), new lvi(this, 3), new lvi(this, 5), new lvi(this, 4));
        this.u = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new lvi(this, 6), new lvi(this, 8), new lvi(this, 7));
        this.v = true;
        this.x = n9e.M(new kvi(this, 1), new kvi(this, 2));
        this.y = ypa.a(ysaVar, new kvi(this, 3));
    }

    public final Team C() {
        return (Team) this.r.getValue();
    }

    public final pvi D() {
        return (pvi) this.s.getValue();
    }

    public final void E(bu7 bu7Var) {
        Boolean bool;
        krk krkVar = this.l;
        krkVar.getClass();
        FeaturedMatchView featuredMatchView = ((gvi) krkVar).k;
        vmd vmdVar = vmd.TEAM_DETAILS;
        boolean G = tz9.G(D().i);
        BrandingTeam brandingTeam = D().i;
        if (brandingTeam != null) {
            bool = Boolean.valueOf(brandingTeam.getOddsProviderId() != null);
        } else {
            bool = null;
        }
        featuredMatchView.j(bu7Var, false, vmdVar, G, bool, Boolean.FALSE);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((gvi) krkVar2).k.setVisibility(0);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.team_details, (ViewGroup) null, false);
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
        if (linearLayout != null) {
            i = R.id.gamble_regulation_footer;
            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) nq8.B(R.id.gamble_regulation_footer, inflate);
            if (gambleRegulationFooterView != null) {
                i = R.id.llTeamFormRoot;
                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.llTeamFormRoot, inflate);
                if (linearLayout2 != null) {
                    i = R.id.nested_scroll_view;
                    if (((NestedScrollView) nq8.B(R.id.nested_scroll_view, inflate)) != null) {
                        i = R.id.player_age_notice;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.player_age_notice, inflate);
                        if (composeView != null) {
                            i = R.id.promotion_banner;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.promotion_banner, inflate);
                            if (viewStub != null) {
                                i = R.id.promotional_offer_banners;
                                PromotionalOffersBannerView promotionalOffersBannerView = (PromotionalOffersBannerView) nq8.B(R.id.promotional_offer_banners, inflate);
                                if (promotionalOffersBannerView != null) {
                                    i = R.id.promotional_offer_container;
                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.promotional_offer_container, inflate);
                                    if (frameLayout != null) {
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                        i = R.id.team_achievements;
                                        TeamAchievementsView teamAchievementsView = (TeamAchievementsView) nq8.B(R.id.team_achievements, inflate);
                                        if (teamAchievementsView != null) {
                                            i = R.id.team_details_featured_match;
                                            FeaturedMatchView featuredMatchView = (FeaturedMatchView) nq8.B(R.id.team_details_featured_match, inflate);
                                            if (featuredMatchView != null) {
                                                i = R.id.team_details_suggest_edit;
                                                SuggestEditView suggestEditView = (SuggestEditView) nq8.B(R.id.team_details_suggest_edit, inflate);
                                                if (suggestEditView != null) {
                                                    i = R.id.team_info_facts_view;
                                                    TeamInfoView teamInfoView = (TeamInfoView) nq8.B(R.id.team_info_facts_view, inflate);
                                                    if (teamInfoView != null) {
                                                        i = R.id.team_recent_form;
                                                        TeamRecentFormView teamRecentFormView = (TeamRecentFormView) nq8.B(R.id.team_recent_form, inflate);
                                                        if (teamRecentFormView != null) {
                                                            i = R.id.team_salary_cap_view;
                                                            TeamSalaryCapInfoView teamSalaryCapInfoView = (TeamSalaryCapInfoView) nq8.B(R.id.team_salary_cap_view, inflate);
                                                            if (teamSalaryCapInfoView != null) {
                                                                i = R.id.team_tournaments_view;
                                                                TeamTournamentsInfoView teamTournamentsInfoView = (TeamTournamentsInfoView) nq8.B(R.id.team_tournaments_view, inflate);
                                                                if (teamTournamentsInfoView != null) {
                                                                    i = R.id.team_venue_facts_view;
                                                                    if (((CardCtaWithTitleView) nq8.B(R.id.team_venue_facts_view, inflate)) != null) {
                                                                        i = R.id.tennis_grand_slam_performance;
                                                                        TennisGrandSlamPerformanceView tennisGrandSlamPerformanceView = (TennisGrandSlamPerformanceView) nq8.B(R.id.tennis_grand_slam_performance, inflate);
                                                                        if (tennisGrandSlamPerformanceView != null) {
                                                                            i = R.id.tennis_player_ranking_view;
                                                                            TennisPlayerRankingView tennisPlayerRankingView = (TennisPlayerRankingView) nq8.B(R.id.tennis_player_ranking_view, inflate);
                                                                            if (tennisPlayerRankingView != null) {
                                                                                i = R.id.tennis_prize_facts_view;
                                                                                TennisPrizeFactsView tennisPrizeFactsView = (TennisPrizeFactsView) nq8.B(R.id.tennis_prize_facts_view, inflate);
                                                                                if (tennisPrizeFactsView != null) {
                                                                                    i = R.id.tennis_profile_facts_view;
                                                                                    TennisProfileFactsView tennisProfileFactsView = (TennisProfileFactsView) nq8.B(R.id.tennis_profile_facts_view, inflate);
                                                                                    if (tennisProfileFactsView != null) {
                                                                                        return new gvi(swipeRefreshLayout, linearLayout, gambleRegulationFooterView, linearLayout2, composeView, viewStub, promotionalOffersBannerView, frameLayout, swipeRefreshLayout, teamAchievementsView, featuredMatchView, suggestEditView, teamInfoView, teamRecentFormView, teamSalaryCapInfoView, teamTournamentsInfoView, tennisGrandSlamPerformanceView, tennisPlayerRankingView, tennisPrizeFactsView, tennisProfileFactsView);
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
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((gvi) krkVar).i;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((gvi) krkVar2).l.setVisibility(8);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((gvi) krkVar3).j.setShowTrophyComparisonClickListener(new fl8(0, this, TeamDetailsFragment.class, "showTrophyComparison", "showTrophyComparison()V", 0, 26));
        final int i = 0;
        D().k.e(getViewLifecycleOwner(), new ioe(21, new Function1(this) { // from class: ivi
            public final /* synthetic */ TeamDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:283:0x0a82  */
            /* JADX WARN: Removed duplicated region for block: B:304:0x0a85  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                xmd xmdVar;
                xmd xmdVar2;
                gv9 gv9Var;
                and andVar;
                old oldVar;
                BrandingTeam brandingTeam;
                gv9 gv9Var2;
                Boolean bool;
                int i2;
                iuh iuhVar;
                List<UniqueTournament> uniqueTournaments;
                boolean z;
                Typeface typeface;
                String w;
                switch (i) {
                    case 0:
                        bu7 bu7Var = (bu7) obj;
                        TeamDetailsFragment teamDetailsFragment = this.b;
                        teamDetailsFragment.n();
                        if (bu7Var != null) {
                            teamDetailsFragment.E(bu7Var);
                            xmd xmdVar3 = bu7Var.b;
                            and andVar2 = (xmdVar3 == null || (gv9Var2 = xmdVar3.a) == null) ? null : (and) CollectionsKt.firstOrNull(gv9Var2);
                            if ((xmdVar3 != null ? xmdVar3.b : null) != null && andVar2 != null && teamDetailsFragment.w == null) {
                                g6b lifecycle = teamDetailsFragment.getLifecycle();
                                lifecycle.getClass();
                                zsk zskVar = new zsk(lifecycle, 45);
                                krk krkVar4 = teamDetailsFragment.l;
                                krkVar4.getClass();
                                zskVar.b(((gvi) krkVar4).k, new m61(andVar2, teamDetailsFragment, bu7Var, xmdVar3, 26), null);
                                teamDetailsFragment.w = zskVar;
                            } else if (xmdVar3 == null) {
                                zsk zskVar2 = teamDetailsFragment.w;
                                if (zskVar2 != null) {
                                    zskVar2.a();
                                }
                                xmdVar = null;
                                teamDetailsFragment.w = null;
                                krk krkVar5 = teamDetailsFragment.l;
                                krkVar5.getClass();
                                ((gvi) krkVar5).c.setVisibility(((bu7Var == null ? bu7Var.b : xmdVar) != null || ((brandingTeam = teamDetailsFragment.D().i) != null && brandingTeam.getOddsProviderId() == null)) ? 8 : 0);
                                if (bu7Var != null && (xmdVar2 = bu7Var.b) != null && (gv9Var = xmdVar2.a) != null && (andVar = (and) CollectionsKt.firstOrNull(gv9Var)) != null && (oldVar = andVar.a) != null) {
                                    krk krkVar6 = teamDetailsFragment.l;
                                    krkVar6.getClass();
                                    GambleRegulationFooterView gambleRegulationFooterView = ((gvi) krkVar6).c;
                                    Boolean bool2 = oldVar.e;
                                    int i3 = GambleRegulationFooterView.e;
                                    gambleRegulationFooterView.j(bool2, false);
                                }
                                break;
                            }
                        }
                        xmdVar = null;
                        krk krkVar52 = teamDetailsFragment.l;
                        krkVar52.getClass();
                        ((gvi) krkVar52).c.setVisibility(((bu7Var == null ? bu7Var.b : xmdVar) != null || ((brandingTeam = teamDetailsFragment.D().i) != null && brandingTeam.getOddsProviderId() == null)) ? 8 : 0);
                        if (bu7Var != null) {
                            krk krkVar62 = teamDetailsFragment.l;
                            krkVar62.getClass();
                            GambleRegulationFooterView gambleRegulationFooterView2 = ((gvi) krkVar62).c;
                            Boolean bool22 = oldVar.e;
                            int i32 = GambleRegulationFooterView.e;
                            gambleRegulationFooterView2.j(bool22, false);
                        }
                        break;
                    default:
                        TeamDetailsFragment teamDetailsFragment2 = this.b;
                        joa joaVar = teamDetailsFragment2.y;
                        hvi hviVar = (hvi) obj;
                        teamDetailsFragment2.n();
                        int i4 = 1;
                        if (teamDetailsFragment2.v) {
                            krk krkVar7 = teamDetailsFragment2.l;
                            krkVar7.getClass();
                            gvi gviVar = (gvi) krkVar7;
                            BrandingTeam brandingTeam2 = teamDetailsFragment2.D().i;
                            Brand brand = brandingTeam2 != null ? brandingTeam2.getBrand() : null;
                            if (brand != null && Intrinsics.c(brandingTeam2.getHeader(), Boolean.TRUE)) {
                                Context requireContext = teamDetailsFragment2.requireContext();
                                requireContext.getClass();
                                BrandingHeaderView brandingHeaderView = new BrandingHeaderView(requireContext, null, 6, 0);
                                BrandingHeaderView.d(brandingHeaderView, brand, BrandLocation.TeamScreen, Integer.valueOf(teamDetailsFragment2.C().getId()), 24);
                                gviVar.b.addView(brandingHeaderView, 0);
                            }
                            if (tz9.G(teamDetailsFragment2.D().i)) {
                                gviVar.c.setTextColor(R.color.on_color_secondary);
                            }
                            gviVar.l.d.c.setOnClickListener(new s61(9, new kvi(teamDetailsFragment2, 4)));
                            if ((brandingTeam2 != null ? brandingTeam2.getBrand() : null) != null && brandingTeam2.getImageDisplayType() != null && brandingTeam2.getImageDisplayType() != ImageDisplayType.UNKNOWN) {
                                Context requireContext2 = teamDetailsFragment2.requireContext();
                                requireContext2.getClass();
                                f32 f32Var = new f32(requireContext2, 0);
                                f32Var.b(brandingTeam2.getBrand(), teamDetailsFragment2.C().getId(), brandingTeam2.getImageDisplayType(), brandingTeam2.getBannerHeight(), brandingTeam2.getAdUnitHeight(), brandingTeam2.getUrl(), BrandLocation.TeamScreen);
                                LinearLayout linearLayout = gviVar.d;
                                linearLayout.addView(f32Var, linearLayout.getChildCount() - 1);
                            }
                        }
                        Event event = hviVar.a;
                        if (event != null) {
                            pvi D = teamDetailsFragment2.D();
                            xw3.L(un0.z(D), null, null, new nvi(D, event.getId(), null), 3);
                        }
                        bu7 bu7Var2 = event != null ? new bu7(event, null) : null;
                        PlayerTeamInfo playerTeamInfo = teamDetailsFragment2.C().getPlayerTeamInfo();
                        if (playerTeamInfo != null) {
                            if (playerTeamInfo.getUnderage()) {
                                krk krkVar8 = teamDetailsFragment2.l;
                                krkVar8.getClass();
                                ComposeView composeView = ((gvi) krkVar8).e;
                                composeView.setContent(new tc3(1551425404, new jvi(teamDetailsFragment2, i4), true));
                                composeView.setVisibility(0);
                            }
                            krk krkVar9 = teamDetailsFragment2.l;
                            krkVar9.getClass();
                            TennisProfileFactsView tennisProfileFactsView = ((gvi) krkVar9).t;
                            Team C = teamDetailsFragment2.C();
                            vy1 vy1Var = tennisProfileFactsView.d;
                            C.getClass();
                            if (tennisProfileFactsView.getVisibility() != 0) {
                                LinearLayout linearLayout2 = vy1Var.b;
                                if (linearLayout2.getChildCount() == 0) {
                                    tennisProfileFactsView.setVisibility(0);
                                    kqb.d(LayoutInflater.from(tennisProfileFactsView.getContext()), linearLayout2, true).d.setText(tennisProfileFactsView.getResources().getString(R.string.profile));
                                    Context context = tennisProfileFactsView.getContext();
                                    context.getClass();
                                    String p = tba.p(context, C);
                                    if (p.length() <= 0) {
                                        p = null;
                                    }
                                    if (p != null) {
                                        Context context2 = tennisProfileFactsView.getContext();
                                        context2.getClass();
                                        vm6 vm6Var = new vm6(context2);
                                        String string = vm6Var.getResources().getString(R.string.full_name);
                                        string.getClass();
                                        vm6Var.j(string, null, true);
                                        vm6Var.setLabelValue(p);
                                        linearLayout2.addView(vm6Var);
                                    }
                                    PlayerTeamInfo playerTeamInfo2 = C.getPlayerTeamInfo();
                                    if (playerTeamInfo2 != null) {
                                        Country country = C.getCountry();
                                        if (country != null) {
                                            Context context3 = tennisProfileFactsView.getContext();
                                            context3.getClass();
                                            vm6 vm6Var2 = new vm6(context3);
                                            String string2 = vm6Var2.getResources().getString(R.string.country);
                                            string2.getClass();
                                            vm6Var2.j(string2, null, true);
                                            Context context4 = vm6Var2.getContext();
                                            context4.getClass();
                                            vm6Var2.l(new wm6(tv3.c(context4, country.getName()), null, country.getAlpha2(), null, null, 54));
                                            linearLayout2.addView(vm6Var2);
                                        }
                                        String residence = playerTeamInfo2.getResidence();
                                        if (residence != null) {
                                            Context context5 = tennisProfileFactsView.getContext();
                                            context5.getClass();
                                            vm6 vm6Var3 = new vm6(context5);
                                            String string3 = vm6Var3.getResources().getString(R.string.residence);
                                            string3.getClass();
                                            vm6Var3.j(string3, null, true);
                                            vm6Var3.setLabelValue(residence);
                                            linearLayout2.addView(vm6Var3);
                                        }
                                        String birthplace = playerTeamInfo2.getBirthplace();
                                        if (birthplace != null) {
                                            Context context6 = tennisProfileFactsView.getContext();
                                            context6.getClass();
                                            vm6 vm6Var4 = new vm6(context6);
                                            String string4 = vm6Var4.getResources().getString(R.string.birthplace);
                                            string4.getClass();
                                            vm6Var4.j(string4, null, true);
                                            vm6Var4.setLabelValue(birthplace);
                                            linearLayout2.addView(vm6Var4);
                                        }
                                        Long birthDateTimestamp = playerTeamInfo2.getBirthDateTimestamp();
                                        if (birthDateTimestamp != null) {
                                            long longValue = birthDateTimestamp.longValue();
                                            if (Intrinsics.c(playerTeamInfo2.getDeceased(), Boolean.TRUE)) {
                                                bi4 bi4Var = bi4.PATTERN_DMMY;
                                                Locale d = dla.d();
                                                ZoneId of = ZoneId.of("GMT");
                                                of.getClass();
                                                String i5 = fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d)));
                                                Context context7 = tennisProfileFactsView.getContext();
                                                context7.getClass();
                                                vm6 vm6Var5 = new vm6(context7);
                                                String string5 = vm6Var5.getResources().getString(R.string.date_of_birth);
                                                string5.getClass();
                                                vm6Var5.j(string5, null, true);
                                                vm6Var5.setLabelValue(i5);
                                                linearLayout2.addView(vm6Var5);
                                            } else {
                                                int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(1000 * longValue)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                                                bi4 bi4Var2 = bi4.PATTERN_DMMY;
                                                Locale d2 = dla.d();
                                                ZoneId of2 = ZoneId.of("GMT");
                                                of2.getClass();
                                                String o = lnb.o("(", fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var2.d(), d2).withZone(of2).withDecimalStyle(DecimalStyle.of(d2))), ")");
                                                Context context8 = tennisProfileFactsView.getContext();
                                                context8.getClass();
                                                vm6 vm6Var6 = new vm6(context8);
                                                String string6 = vm6Var6.getResources().getString(R.string.age);
                                                string6.getClass();
                                                vm6Var6.j(string6, null, true);
                                                vm6Var6.setLabelValue(between + " " + o);
                                                linearLayout2.addView(vm6Var6);
                                            }
                                        }
                                        Double height = playerTeamInfo2.getHeight();
                                        if (height != null) {
                                            if (height.doubleValue() <= 0.0d) {
                                                height = null;
                                            }
                                            if (height != null) {
                                                double doubleValue = height.doubleValue();
                                                Context context9 = tennisProfileFactsView.getContext();
                                                context9.getClass();
                                                vm6 vm6Var7 = new vm6(context9);
                                                String string7 = vm6Var7.getResources().getString(R.string.player_height);
                                                string7.getClass();
                                                vm6Var7.j(string7, null, true);
                                                Context context10 = vm6Var7.getContext();
                                                context10.getClass();
                                                w = v7a.w(context10, doubleValue, (r4 & 4) == 0, false);
                                                vm6Var7.setLabelValue(w);
                                                linearLayout2.addView(vm6Var7);
                                            }
                                        }
                                        String plays = playerTeamInfo2.getPlays();
                                        if (plays != null) {
                                            Context context11 = tennisProfileFactsView.getContext();
                                            context11.getClass();
                                            vm6 vm6Var8 = new vm6(context11);
                                            String string8 = vm6Var8.getResources().getString(R.string.plays);
                                            string8.getClass();
                                            vm6Var8.j(string8, null, true);
                                            Context context12 = vm6Var8.getContext();
                                            context12.getClass();
                                            Locale locale = Locale.US;
                                            String k = i.k(locale, plays, locale);
                                            int hashCode = k.hashCode();
                                            if (hashCode != -368626485) {
                                                if (hashCode != 432389663) {
                                                    if (hashCode == 1513910740 && k.equals("left-handed")) {
                                                        plays = context12.getString(R.string.left_handed);
                                                    }
                                                } else if (k.equals("right-handed")) {
                                                    plays = context12.getString(R.string.right_handed);
                                                }
                                            } else if (k.equals("ambidextrous")) {
                                                plays = context12.getString(R.string.ambidextrous);
                                            }
                                            plays.getClass();
                                            vm6Var8.setLabelValue(plays);
                                            linearLayout2.addView(vm6Var8);
                                        }
                                    }
                                }
                            }
                            if (playerTeamInfo.getPrizeCurrentRaw() != null || playerTeamInfo.getPrizeTotalRaw() != null) {
                                krk krkVar10 = teamDetailsFragment2.l;
                                krkVar10.getClass();
                                TennisPrizeFactsView tennisPrizeFactsView = ((gvi) krkVar10).s;
                                vy1 vy1Var2 = tennisPrizeFactsView.d;
                                if (tennisPrizeFactsView.getVisibility() != 0) {
                                    LinearLayout linearLayout3 = vy1Var2.b;
                                    if (linearLayout3.getChildCount() <= 0) {
                                        tennisPrizeFactsView.setVisibility(0);
                                        kqb.d(LayoutInflater.from(tennisPrizeFactsView.getContext()), linearLayout3, true).d.setText(tennisPrizeFactsView.getResources().getString(R.string.prize_money));
                                        if (playerTeamInfo.getPrizeCurrentRaw() != null) {
                                            Money prizeCurrentRaw = playerTeamInfo.getPrizeCurrentRaw();
                                            prizeCurrentRaw.getClass();
                                            if (prizeCurrentRaw.getValue() > 0) {
                                                Context context13 = tennisPrizeFactsView.getContext();
                                                context13.getClass();
                                                vm6 vm6Var9 = new vm6(context13);
                                                String string9 = vm6Var9.getResources().getString(R.string.current_year);
                                                string9.getClass();
                                                vm6Var9.j(string9, null, true);
                                                Set set = o84.a;
                                                Context context14 = vm6Var9.getContext();
                                                context14.getClass();
                                                Money prizeCurrentRaw2 = playerTeamInfo.getPrizeCurrentRaw();
                                                prizeCurrentRaw2.getClass();
                                                vm6Var9.setLabelValue(o84.a(context14, prizeCurrentRaw2, 0L, 12));
                                                linearLayout3.addView(vm6Var9);
                                            }
                                        }
                                        if (playerTeamInfo.getPrizeTotalRaw() != null) {
                                            Money prizeTotalRaw = playerTeamInfo.getPrizeTotalRaw();
                                            prizeTotalRaw.getClass();
                                            if (prizeTotalRaw.getValue() > 0) {
                                                Context context15 = tennisPrizeFactsView.getContext();
                                                context15.getClass();
                                                vm6 vm6Var10 = new vm6(context15);
                                                String string10 = vm6Var10.getResources().getString(R.string.career_total);
                                                string10.getClass();
                                                vm6Var10.j(string10, null, true);
                                                Set set2 = o84.a;
                                                Context context16 = vm6Var10.getContext();
                                                context16.getClass();
                                                Money prizeTotalRaw2 = playerTeamInfo.getPrizeTotalRaw();
                                                prizeTotalRaw2.getClass();
                                                vm6Var10.setLabelValue(o84.a(context16, prizeTotalRaw2, 0L, 12));
                                                linearLayout3.addView(vm6Var10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        List list = hviVar.c;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse = hviVar.b;
                        if (list != null) {
                            Sport sport = teamDetailsFragment2.C().getSport();
                            if (Intrinsics.c(sport != null ? sport.getSlug() : null, Sports.TENNIS)) {
                                krk krkVar11 = teamDetailsFragment2.l;
                                krkVar11.getClass();
                                TennisPlayerRankingView tennisPlayerRankingView = ((gvi) krkVar11).r;
                                RecentTeamTournamentsResponse recentTeamTournamentsResponse = hviVar.d;
                                List<TeamUniqueTournament> uniqueTournaments2 = recentTeamTournamentsResponse != null ? recentTeamTournamentsResponse.getUniqueTournaments() : null;
                                if (uniqueTournaments2 == null) {
                                    uniqueTournaments2 = km5.a;
                                }
                                tennisPlayerRankingView.m(list, uniqueTournaments2);
                            }
                        }
                        if (teamDetailsFragment2.C().getPlayerTeamInfo() == null) {
                            krk krkVar12 = teamDetailsFragment2.l;
                            krkVar12.getClass();
                            ((gvi) krkVar12).m.l(teamDetailsFragment2.C(), list);
                        }
                        Integer capMaximum = teamDetailsFragment2.C().getCapMaximum();
                        Integer luxuryTaxThreshold = teamDetailsFragment2.C().getLuxuryTaxThreshold();
                        Integer signedPlayers = teamDetailsFragment2.C().getSignedPlayers();
                        Integer activeCap = teamDetailsFragment2.C().getActiveCap();
                        Integer totalCap = teamDetailsFragment2.C().getTotalCap();
                        Integer capSpace = teamDetailsFragment2.C().getCapSpace();
                        List j = b.j(capMaximum, luxuryTaxThreshold, signedPlayers, activeCap, totalCap, capSpace);
                        if (j == null || !j.isEmpty()) {
                            Iterator it = j.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Integer) it.next()) != null) {
                                        krk krkVar13 = teamDetailsFragment2.l;
                                        krkVar13.getClass();
                                        TeamSalaryCapInfoView teamSalaryCapInfoView = ((gvi) krkVar13).o;
                                        vy1 vy1Var3 = teamSalaryCapInfoView.d;
                                        if (teamSalaryCapInfoView.getVisibility() != 0) {
                                            LinearLayout linearLayout4 = vy1Var3.b;
                                            if (linearLayout4.getChildCount() <= 0) {
                                                teamSalaryCapInfoView.setVisibility(0);
                                                kqb.d(LayoutInflater.from(teamSalaryCapInfoView.getContext()), linearLayout4, true).d.setText(teamSalaryCapInfoView.getResources().getString(R.string.basketball_salary_cap));
                                                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                                                currencyInstance.setCurrency(Currency.getInstance("USD"));
                                                currencyInstance.setMinimumFractionDigits(0);
                                                currencyInstance.setMaximumFractionDigits(0);
                                                if (capMaximum != null) {
                                                    int intValue = capMaximum.intValue();
                                                    Context context17 = teamSalaryCapInfoView.getContext();
                                                    context17.getClass();
                                                    vm6 vm6Var11 = new vm6(context17);
                                                    String string11 = vm6Var11.getContext().getString(R.string.basketball_salary_cap_maximum);
                                                    string11.getClass();
                                                    vm6Var11.j(string11, null, true);
                                                    String format = currencyInstance.format(Integer.valueOf(intValue));
                                                    format.getClass();
                                                    vm6Var11.setLabelValue(format);
                                                    linearLayout4.addView(vm6Var11);
                                                }
                                                if (luxuryTaxThreshold != null) {
                                                    int intValue2 = luxuryTaxThreshold.intValue();
                                                    Context context18 = teamSalaryCapInfoView.getContext();
                                                    context18.getClass();
                                                    vm6 vm6Var12 = new vm6(context18);
                                                    String string12 = vm6Var12.getContext().getString(R.string.basketball_luxury_tax_threshold);
                                                    string12.getClass();
                                                    vm6Var12.j(string12, null, true);
                                                    String format2 = currencyInstance.format(Integer.valueOf(intValue2));
                                                    format2.getClass();
                                                    vm6Var12.setLabelValue(format2);
                                                    linearLayout4.addView(vm6Var12);
                                                }
                                                if (signedPlayers != null) {
                                                    int intValue3 = signedPlayers.intValue();
                                                    Context context19 = teamSalaryCapInfoView.getContext();
                                                    context19.getClass();
                                                    vm6 vm6Var13 = new vm6(context19);
                                                    String string13 = vm6Var13.getContext().getString(R.string.basketball_salary_players_signed);
                                                    string13.getClass();
                                                    vm6Var13.j(string13, null, true);
                                                    vm6Var13.setLabelValue(String.valueOf(intValue3));
                                                    linearLayout4.addView(vm6Var13);
                                                }
                                                if (activeCap != null) {
                                                    int intValue4 = activeCap.intValue();
                                                    Context context20 = teamSalaryCapInfoView.getContext();
                                                    context20.getClass();
                                                    vm6 vm6Var14 = new vm6(context20);
                                                    String string14 = vm6Var14.getContext().getString(R.string.basketball_salary_active_cap);
                                                    string14.getClass();
                                                    vm6Var14.j(string14, null, true);
                                                    String format3 = currencyInstance.format(Integer.valueOf(intValue4));
                                                    format3.getClass();
                                                    vm6Var14.setLabelValue(format3);
                                                    linearLayout4.addView(vm6Var14);
                                                }
                                                if (totalCap != null) {
                                                    int intValue5 = totalCap.intValue();
                                                    Context context21 = teamSalaryCapInfoView.getContext();
                                                    context21.getClass();
                                                    vm6 vm6Var15 = new vm6(context21);
                                                    String string15 = vm6Var15.getContext().getString(R.string.basketball_salary_total_cap);
                                                    string15.getClass();
                                                    vm6Var15.j(string15, null, true);
                                                    String format4 = currencyInstance.format(Integer.valueOf(intValue5));
                                                    format4.getClass();
                                                    vm6Var15.setLabelValue(format4);
                                                    linearLayout4.addView(vm6Var15);
                                                }
                                                if (capSpace != null) {
                                                    int intValue6 = capSpace.intValue();
                                                    Context context22 = teamSalaryCapInfoView.getContext();
                                                    context22.getClass();
                                                    vm6 vm6Var16 = new vm6(context22);
                                                    String string16 = vm6Var16.getContext().getString(R.string.basketball_salary_cap_space);
                                                    string16.getClass();
                                                    vm6Var16.j(string16, null, true);
                                                    String format5 = currencyInstance.format(Integer.valueOf(intValue6));
                                                    format5.getClass();
                                                    vm6Var16.setLabelValue(format5);
                                                    linearLayout4.addView(vm6Var16);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        List<UniqueTournament> uniqueTournaments3 = teamUniqueTournamentsResponse != null ? teamUniqueTournamentsResponse.getUniqueTournaments() : null;
                        krk krkVar14 = teamDetailsFragment2.l;
                        krkVar14.getClass();
                        TeamTournamentsInfoView teamTournamentsInfoView = ((gvi) krkVar14).p;
                        if (uniqueTournaments3 == null) {
                            uniqueTournaments3 = km5.a;
                        }
                        vy1 vy1Var4 = teamTournamentsInfoView.d;
                        uniqueTournaments3.getClass();
                        if (teamTournamentsInfoView.getVisibility() != 0) {
                            LinearLayout linearLayout5 = vy1Var4.b;
                            if (linearLayout5.getChildCount() <= 0 && !uniqueTournaments3.isEmpty()) {
                                teamTournamentsInfoView.setVisibility(0);
                                View inflate = LayoutInflater.from(teamTournamentsInfoView.getContext()).inflate(R.layout.main_section_left_with_icon, (ViewGroup) linearLayout5, false);
                                linearLayout5.addView(inflate);
                                lqb a = lqb.a(inflate);
                                TextView textView = a.c;
                                Context context23 = teamTournamentsInfoView.getContext();
                                context23.getClass();
                                try {
                                    typeface = z1g.a(R.font.sofascore_sans_bold, context23);
                                } catch (Exception unused) {
                                    typeface = Typeface.DEFAULT;
                                }
                                textView.setTypeface(typeface);
                                textView.setTextSize(2, 14.0f);
                                a.b.setVisibility(8);
                                textView.setText(teamTournamentsInfoView.getResources().getString(R.string.competitions));
                                for (UniqueTournament uniqueTournament : uniqueTournaments3) {
                                    View inflate2 = LayoutInflater.from(teamTournamentsInfoView.getContext()).inflate(R.layout.image_label_layout, (ViewGroup) linearLayout5, false);
                                    linearLayout5.addView(inflate2);
                                    int i6 = R.id.layout_image;
                                    ImageView imageView = (ImageView) nq8.B(R.id.layout_image, inflate2);
                                    if (imageView != null) {
                                        i6 = R.id.primary_label;
                                        TextView textView2 = (TextView) nq8.B(R.id.primary_label, inflate2);
                                        if (textView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                                            as9.q(imageView, Integer.valueOf(uniqueTournament.getId()), 0, null);
                                            textView2.setText(tba.x(uniqueTournament));
                                            constraintLayout.getClass();
                                            aba.y(constraintLayout, 0, 3);
                                            constraintLayout.setOnClickListener(new eyd(26, teamTournamentsInfoView, uniqueTournament));
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                                    break;
                                }
                            }
                        }
                        TeamAchievementsResponse teamAchievementsResponse = hviVar.g;
                        Sport sport2 = teamDetailsFragment2.C().getSport();
                        String slug = sport2 != null ? sport2.getSlug() : null;
                        if (teamAchievementsResponse != null && slug != null) {
                            krk krkVar15 = teamDetailsFragment2.l;
                            krkVar15.getClass();
                            ((gvi) krkVar15).j.l(teamAchievementsResponse, slug);
                        }
                        y5j y5jVar = hviVar.h;
                        if (y5jVar != null) {
                            krk krkVar16 = teamDetailsFragment2.l;
                            krkVar16.getClass();
                            ((gvi) krkVar16).q.l(y5jVar);
                        }
                        if (teamUniqueTournamentsResponse == null || (uniqueTournaments = teamUniqueTournamentsResponse.getUniqueTournaments()) == null) {
                            bool = null;
                        } else {
                            if (!uniqueTournaments.isEmpty()) {
                                Iterator<T> it2 = uniqueTournaments.iterator();
                                while (it2.hasNext()) {
                                    if (((UniqueTournament) it2.next()).getId() == 16) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        }
                        boolean c = Intrinsics.c(bool, Boolean.TRUE);
                        if (bu7Var2 != null) {
                            teamDetailsFragment2.E(bu7Var2);
                            i2 = 8;
                        } else {
                            krk krkVar17 = teamDetailsFragment2.l;
                            krkVar17.getClass();
                            i2 = 8;
                            ((gvi) krkVar17).k.setVisibility(8);
                        }
                        gv9 gv9Var3 = hviVar.f;
                        if (gv9Var3 != null) {
                            krk krkVar18 = teamDetailsFragment2.l;
                            krkVar18.getClass();
                            ((gvi) krkVar18).n.setData(gv9Var3);
                        }
                        if (c && (iuhVar = (iuh) joaVar.getValue()) != null) {
                            iuhVar.m(fv.TEAM_SCREEN);
                        }
                        krk krkVar19 = teamDetailsFragment2.l;
                        krkVar19.getClass();
                        ((gvi) krkVar19).l.setVisibility(0);
                        Set set3 = aef.a;
                        Context requireContext3 = teamDetailsFragment2.requireContext();
                        requireContext3.getClass();
                        UniqueTournament primaryUniqueTournament = teamDetailsFragment2.C().getPrimaryUniqueTournament();
                        if (aef.e(requireContext3, primaryUniqueTournament != null ? Integer.valueOf(primaryUniqueTournament.getId()) : null) && !tz9.G(teamDetailsFragment2.D().i)) {
                            krk krkVar20 = teamDetailsFragment2.l;
                            krkVar20.getClass();
                            LinearLayout linearLayout6 = ((gvi) krkVar20).d;
                            Context requireContext4 = teamDetailsFragment2.requireContext();
                            requireContext4.getClass();
                            PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext4, null, 6);
                            wnn.y(promotionBannerView, fv.TEAM_SCREEN);
                            promotionBannerView.setVisibility(0);
                            krk krkVar21 = teamDetailsFragment2.l;
                            krkVar21.getClass();
                            linearLayout6.addView(promotionBannerView, ((gvi) krkVar21).d.getChildCount() - 1);
                        }
                        n4c n4cVar = (n4c) teamDetailsFragment2.x.getValue();
                        if (n4cVar != null) {
                            if (n4cVar.getParent() != null) {
                                n4cVar = null;
                            }
                            if (n4cVar != null) {
                                Context requireContext5 = teamDetailsFragment2.requireContext();
                                requireContext5.getClass();
                                n4cVar.l(haa.r(requireContext5, teamDetailsFragment2.C(), ((nui) teamDetailsFragment2.t.getValue()).y), new kvi(teamDetailsFragment2, 5));
                                krk krkVar22 = teamDetailsFragment2.l;
                                krkVar22.getClass();
                                LinearLayout linearLayout7 = ((gvi) krkVar22).d;
                                krk krkVar23 = teamDetailsFragment2.l;
                                krkVar23.getClass();
                                LinearLayout linearLayout8 = ((gvi) krkVar23).d;
                                krk krkVar24 = teamDetailsFragment2.l;
                                krkVar24.getClass();
                                linearLayout7.addView(n4cVar, linearLayout8.indexOfChild(((gvi) krkVar24).n) + 1);
                            }
                        }
                        iuh iuhVar2 = (iuh) joaVar.getValue();
                        if (iuhVar2 != null) {
                            iuh iuhVar3 = (c && iuhVar2.getParent() == null) ? iuhVar2 : null;
                            if (iuhVar3 != null) {
                                krk krkVar25 = teamDetailsFragment2.l;
                                krkVar25.getClass();
                                LinearLayout linearLayout9 = ((gvi) krkVar25).d;
                                krk krkVar26 = teamDetailsFragment2.l;
                                krkVar26.getClass();
                                LinearLayout linearLayout10 = ((gvi) krkVar26).d;
                                krk krkVar27 = teamDetailsFragment2.l;
                                krkVar27.getClass();
                                linearLayout9.addView(iuhVar3, linearLayout10.indexOfChild(((gvi) krkVar27).l) - 1);
                            }
                        }
                        if (!tz9.G(teamDetailsFragment2.D().i)) {
                            Context requireContext6 = teamDetailsFragment2.requireContext();
                            requireContext6.getClass();
                            bef d3 = aef.d(requireContext6, teamDetailsFragment2.C());
                            if (d3 != null) {
                                krk krkVar28 = teamDetailsFragment2.l;
                                krkVar28.getClass();
                                if (((gvi) krkVar28).f.getParent() != null) {
                                    krk krkVar29 = teamDetailsFragment2.l;
                                    krkVar29.getClass();
                                    View inflate3 = ((gvi) krkVar29).f.inflate();
                                    inflate3.getClass();
                                    PromotionBannerView promotionBannerView2 = (PromotionBannerView) inflate3;
                                    wnn.x(promotionBannerView2, d3, fv.TEAM_SCREEN);
                                    promotionBannerView2.setVisibility(0);
                                }
                            }
                            List list2 = hviVar.i;
                            if (list2 != null) {
                                krk krkVar30 = teamDetailsFragment2.l;
                                krkVar30.getClass();
                                FrameLayout frameLayout = ((gvi) krkVar30).h;
                                if (!list2.isEmpty()) {
                                    i2 = 0;
                                }
                                frameLayout.setVisibility(i2);
                                krk krkVar31 = teamDetailsFragment2.l;
                                krkVar31.getClass();
                                PromotionalOffersBannerView.j(((gvi) krkVar31).g, list2, new sdf(teamDetailsFragment2.C().getId()), fv.TEAM_SCREEN);
                            }
                        }
                        teamDetailsFragment2.v = false;
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        D().m.e(getViewLifecycleOwner(), new ioe(21, new Function1(this) { // from class: ivi
            public final /* synthetic */ TeamDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:283:0x0a82  */
            /* JADX WARN: Removed duplicated region for block: B:304:0x0a85  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                xmd xmdVar;
                xmd xmdVar2;
                gv9 gv9Var;
                and andVar;
                old oldVar;
                BrandingTeam brandingTeam;
                gv9 gv9Var2;
                Boolean bool;
                int i22;
                iuh iuhVar;
                List<UniqueTournament> uniqueTournaments;
                boolean z;
                Typeface typeface;
                String w;
                switch (i2) {
                    case 0:
                        bu7 bu7Var = (bu7) obj;
                        TeamDetailsFragment teamDetailsFragment = this.b;
                        teamDetailsFragment.n();
                        if (bu7Var != null) {
                            teamDetailsFragment.E(bu7Var);
                            xmd xmdVar3 = bu7Var.b;
                            and andVar2 = (xmdVar3 == null || (gv9Var2 = xmdVar3.a) == null) ? null : (and) CollectionsKt.firstOrNull(gv9Var2);
                            if ((xmdVar3 != null ? xmdVar3.b : null) != null && andVar2 != null && teamDetailsFragment.w == null) {
                                g6b lifecycle = teamDetailsFragment.getLifecycle();
                                lifecycle.getClass();
                                zsk zskVar = new zsk(lifecycle, 45);
                                krk krkVar4 = teamDetailsFragment.l;
                                krkVar4.getClass();
                                zskVar.b(((gvi) krkVar4).k, new m61(andVar2, teamDetailsFragment, bu7Var, xmdVar3, 26), null);
                                teamDetailsFragment.w = zskVar;
                            } else if (xmdVar3 == null) {
                                zsk zskVar2 = teamDetailsFragment.w;
                                if (zskVar2 != null) {
                                    zskVar2.a();
                                }
                                xmdVar = null;
                                teamDetailsFragment.w = null;
                                krk krkVar52 = teamDetailsFragment.l;
                                krkVar52.getClass();
                                ((gvi) krkVar52).c.setVisibility(((bu7Var == null ? bu7Var.b : xmdVar) != null || ((brandingTeam = teamDetailsFragment.D().i) != null && brandingTeam.getOddsProviderId() == null)) ? 8 : 0);
                                if (bu7Var != null && (xmdVar2 = bu7Var.b) != null && (gv9Var = xmdVar2.a) != null && (andVar = (and) CollectionsKt.firstOrNull(gv9Var)) != null && (oldVar = andVar.a) != null) {
                                    krk krkVar62 = teamDetailsFragment.l;
                                    krkVar62.getClass();
                                    GambleRegulationFooterView gambleRegulationFooterView2 = ((gvi) krkVar62).c;
                                    Boolean bool22 = oldVar.e;
                                    int i32 = GambleRegulationFooterView.e;
                                    gambleRegulationFooterView2.j(bool22, false);
                                }
                                break;
                            }
                        }
                        xmdVar = null;
                        krk krkVar522 = teamDetailsFragment.l;
                        krkVar522.getClass();
                        ((gvi) krkVar522).c.setVisibility(((bu7Var == null ? bu7Var.b : xmdVar) != null || ((brandingTeam = teamDetailsFragment.D().i) != null && brandingTeam.getOddsProviderId() == null)) ? 8 : 0);
                        if (bu7Var != null) {
                            krk krkVar622 = teamDetailsFragment.l;
                            krkVar622.getClass();
                            GambleRegulationFooterView gambleRegulationFooterView22 = ((gvi) krkVar622).c;
                            Boolean bool222 = oldVar.e;
                            int i322 = GambleRegulationFooterView.e;
                            gambleRegulationFooterView22.j(bool222, false);
                        }
                        break;
                    default:
                        TeamDetailsFragment teamDetailsFragment2 = this.b;
                        joa joaVar = teamDetailsFragment2.y;
                        hvi hviVar = (hvi) obj;
                        teamDetailsFragment2.n();
                        int i4 = 1;
                        if (teamDetailsFragment2.v) {
                            krk krkVar7 = teamDetailsFragment2.l;
                            krkVar7.getClass();
                            gvi gviVar = (gvi) krkVar7;
                            BrandingTeam brandingTeam2 = teamDetailsFragment2.D().i;
                            Brand brand = brandingTeam2 != null ? brandingTeam2.getBrand() : null;
                            if (brand != null && Intrinsics.c(brandingTeam2.getHeader(), Boolean.TRUE)) {
                                Context requireContext = teamDetailsFragment2.requireContext();
                                requireContext.getClass();
                                BrandingHeaderView brandingHeaderView = new BrandingHeaderView(requireContext, null, 6, 0);
                                BrandingHeaderView.d(brandingHeaderView, brand, BrandLocation.TeamScreen, Integer.valueOf(teamDetailsFragment2.C().getId()), 24);
                                gviVar.b.addView(brandingHeaderView, 0);
                            }
                            if (tz9.G(teamDetailsFragment2.D().i)) {
                                gviVar.c.setTextColor(R.color.on_color_secondary);
                            }
                            gviVar.l.d.c.setOnClickListener(new s61(9, new kvi(teamDetailsFragment2, 4)));
                            if ((brandingTeam2 != null ? brandingTeam2.getBrand() : null) != null && brandingTeam2.getImageDisplayType() != null && brandingTeam2.getImageDisplayType() != ImageDisplayType.UNKNOWN) {
                                Context requireContext2 = teamDetailsFragment2.requireContext();
                                requireContext2.getClass();
                                f32 f32Var = new f32(requireContext2, 0);
                                f32Var.b(brandingTeam2.getBrand(), teamDetailsFragment2.C().getId(), brandingTeam2.getImageDisplayType(), brandingTeam2.getBannerHeight(), brandingTeam2.getAdUnitHeight(), brandingTeam2.getUrl(), BrandLocation.TeamScreen);
                                LinearLayout linearLayout = gviVar.d;
                                linearLayout.addView(f32Var, linearLayout.getChildCount() - 1);
                            }
                        }
                        Event event = hviVar.a;
                        if (event != null) {
                            pvi D = teamDetailsFragment2.D();
                            xw3.L(un0.z(D), null, null, new nvi(D, event.getId(), null), 3);
                        }
                        bu7 bu7Var2 = event != null ? new bu7(event, null) : null;
                        PlayerTeamInfo playerTeamInfo = teamDetailsFragment2.C().getPlayerTeamInfo();
                        if (playerTeamInfo != null) {
                            if (playerTeamInfo.getUnderage()) {
                                krk krkVar8 = teamDetailsFragment2.l;
                                krkVar8.getClass();
                                ComposeView composeView = ((gvi) krkVar8).e;
                                composeView.setContent(new tc3(1551425404, new jvi(teamDetailsFragment2, i4), true));
                                composeView.setVisibility(0);
                            }
                            krk krkVar9 = teamDetailsFragment2.l;
                            krkVar9.getClass();
                            TennisProfileFactsView tennisProfileFactsView = ((gvi) krkVar9).t;
                            Team C = teamDetailsFragment2.C();
                            vy1 vy1Var = tennisProfileFactsView.d;
                            C.getClass();
                            if (tennisProfileFactsView.getVisibility() != 0) {
                                LinearLayout linearLayout2 = vy1Var.b;
                                if (linearLayout2.getChildCount() == 0) {
                                    tennisProfileFactsView.setVisibility(0);
                                    kqb.d(LayoutInflater.from(tennisProfileFactsView.getContext()), linearLayout2, true).d.setText(tennisProfileFactsView.getResources().getString(R.string.profile));
                                    Context context = tennisProfileFactsView.getContext();
                                    context.getClass();
                                    String p = tba.p(context, C);
                                    if (p.length() <= 0) {
                                        p = null;
                                    }
                                    if (p != null) {
                                        Context context2 = tennisProfileFactsView.getContext();
                                        context2.getClass();
                                        vm6 vm6Var = new vm6(context2);
                                        String string = vm6Var.getResources().getString(R.string.full_name);
                                        string.getClass();
                                        vm6Var.j(string, null, true);
                                        vm6Var.setLabelValue(p);
                                        linearLayout2.addView(vm6Var);
                                    }
                                    PlayerTeamInfo playerTeamInfo2 = C.getPlayerTeamInfo();
                                    if (playerTeamInfo2 != null) {
                                        Country country = C.getCountry();
                                        if (country != null) {
                                            Context context3 = tennisProfileFactsView.getContext();
                                            context3.getClass();
                                            vm6 vm6Var2 = new vm6(context3);
                                            String string2 = vm6Var2.getResources().getString(R.string.country);
                                            string2.getClass();
                                            vm6Var2.j(string2, null, true);
                                            Context context4 = vm6Var2.getContext();
                                            context4.getClass();
                                            vm6Var2.l(new wm6(tv3.c(context4, country.getName()), null, country.getAlpha2(), null, null, 54));
                                            linearLayout2.addView(vm6Var2);
                                        }
                                        String residence = playerTeamInfo2.getResidence();
                                        if (residence != null) {
                                            Context context5 = tennisProfileFactsView.getContext();
                                            context5.getClass();
                                            vm6 vm6Var3 = new vm6(context5);
                                            String string3 = vm6Var3.getResources().getString(R.string.residence);
                                            string3.getClass();
                                            vm6Var3.j(string3, null, true);
                                            vm6Var3.setLabelValue(residence);
                                            linearLayout2.addView(vm6Var3);
                                        }
                                        String birthplace = playerTeamInfo2.getBirthplace();
                                        if (birthplace != null) {
                                            Context context6 = tennisProfileFactsView.getContext();
                                            context6.getClass();
                                            vm6 vm6Var4 = new vm6(context6);
                                            String string4 = vm6Var4.getResources().getString(R.string.birthplace);
                                            string4.getClass();
                                            vm6Var4.j(string4, null, true);
                                            vm6Var4.setLabelValue(birthplace);
                                            linearLayout2.addView(vm6Var4);
                                        }
                                        Long birthDateTimestamp = playerTeamInfo2.getBirthDateTimestamp();
                                        if (birthDateTimestamp != null) {
                                            long longValue = birthDateTimestamp.longValue();
                                            if (Intrinsics.c(playerTeamInfo2.getDeceased(), Boolean.TRUE)) {
                                                bi4 bi4Var = bi4.PATTERN_DMMY;
                                                Locale d = dla.d();
                                                ZoneId of = ZoneId.of("GMT");
                                                of.getClass();
                                                String i5 = fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d)));
                                                Context context7 = tennisProfileFactsView.getContext();
                                                context7.getClass();
                                                vm6 vm6Var5 = new vm6(context7);
                                                String string5 = vm6Var5.getResources().getString(R.string.date_of_birth);
                                                string5.getClass();
                                                vm6Var5.j(string5, null, true);
                                                vm6Var5.setLabelValue(i5);
                                                linearLayout2.addView(vm6Var5);
                                            } else {
                                                int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(1000 * longValue)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                                                bi4 bi4Var2 = bi4.PATTERN_DMMY;
                                                Locale d2 = dla.d();
                                                ZoneId of2 = ZoneId.of("GMT");
                                                of2.getClass();
                                                String o = lnb.o("(", fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var2.d(), d2).withZone(of2).withDecimalStyle(DecimalStyle.of(d2))), ")");
                                                Context context8 = tennisProfileFactsView.getContext();
                                                context8.getClass();
                                                vm6 vm6Var6 = new vm6(context8);
                                                String string6 = vm6Var6.getResources().getString(R.string.age);
                                                string6.getClass();
                                                vm6Var6.j(string6, null, true);
                                                vm6Var6.setLabelValue(between + " " + o);
                                                linearLayout2.addView(vm6Var6);
                                            }
                                        }
                                        Double height = playerTeamInfo2.getHeight();
                                        if (height != null) {
                                            if (height.doubleValue() <= 0.0d) {
                                                height = null;
                                            }
                                            if (height != null) {
                                                double doubleValue = height.doubleValue();
                                                Context context9 = tennisProfileFactsView.getContext();
                                                context9.getClass();
                                                vm6 vm6Var7 = new vm6(context9);
                                                String string7 = vm6Var7.getResources().getString(R.string.player_height);
                                                string7.getClass();
                                                vm6Var7.j(string7, null, true);
                                                Context context10 = vm6Var7.getContext();
                                                context10.getClass();
                                                w = v7a.w(context10, doubleValue, (r4 & 4) == 0, false);
                                                vm6Var7.setLabelValue(w);
                                                linearLayout2.addView(vm6Var7);
                                            }
                                        }
                                        String plays = playerTeamInfo2.getPlays();
                                        if (plays != null) {
                                            Context context11 = tennisProfileFactsView.getContext();
                                            context11.getClass();
                                            vm6 vm6Var8 = new vm6(context11);
                                            String string8 = vm6Var8.getResources().getString(R.string.plays);
                                            string8.getClass();
                                            vm6Var8.j(string8, null, true);
                                            Context context12 = vm6Var8.getContext();
                                            context12.getClass();
                                            Locale locale = Locale.US;
                                            String k = i.k(locale, plays, locale);
                                            int hashCode = k.hashCode();
                                            if (hashCode != -368626485) {
                                                if (hashCode != 432389663) {
                                                    if (hashCode == 1513910740 && k.equals("left-handed")) {
                                                        plays = context12.getString(R.string.left_handed);
                                                    }
                                                } else if (k.equals("right-handed")) {
                                                    plays = context12.getString(R.string.right_handed);
                                                }
                                            } else if (k.equals("ambidextrous")) {
                                                plays = context12.getString(R.string.ambidextrous);
                                            }
                                            plays.getClass();
                                            vm6Var8.setLabelValue(plays);
                                            linearLayout2.addView(vm6Var8);
                                        }
                                    }
                                }
                            }
                            if (playerTeamInfo.getPrizeCurrentRaw() != null || playerTeamInfo.getPrizeTotalRaw() != null) {
                                krk krkVar10 = teamDetailsFragment2.l;
                                krkVar10.getClass();
                                TennisPrizeFactsView tennisPrizeFactsView = ((gvi) krkVar10).s;
                                vy1 vy1Var2 = tennisPrizeFactsView.d;
                                if (tennisPrizeFactsView.getVisibility() != 0) {
                                    LinearLayout linearLayout3 = vy1Var2.b;
                                    if (linearLayout3.getChildCount() <= 0) {
                                        tennisPrizeFactsView.setVisibility(0);
                                        kqb.d(LayoutInflater.from(tennisPrizeFactsView.getContext()), linearLayout3, true).d.setText(tennisPrizeFactsView.getResources().getString(R.string.prize_money));
                                        if (playerTeamInfo.getPrizeCurrentRaw() != null) {
                                            Money prizeCurrentRaw = playerTeamInfo.getPrizeCurrentRaw();
                                            prizeCurrentRaw.getClass();
                                            if (prizeCurrentRaw.getValue() > 0) {
                                                Context context13 = tennisPrizeFactsView.getContext();
                                                context13.getClass();
                                                vm6 vm6Var9 = new vm6(context13);
                                                String string9 = vm6Var9.getResources().getString(R.string.current_year);
                                                string9.getClass();
                                                vm6Var9.j(string9, null, true);
                                                Set set = o84.a;
                                                Context context14 = vm6Var9.getContext();
                                                context14.getClass();
                                                Money prizeCurrentRaw2 = playerTeamInfo.getPrizeCurrentRaw();
                                                prizeCurrentRaw2.getClass();
                                                vm6Var9.setLabelValue(o84.a(context14, prizeCurrentRaw2, 0L, 12));
                                                linearLayout3.addView(vm6Var9);
                                            }
                                        }
                                        if (playerTeamInfo.getPrizeTotalRaw() != null) {
                                            Money prizeTotalRaw = playerTeamInfo.getPrizeTotalRaw();
                                            prizeTotalRaw.getClass();
                                            if (prizeTotalRaw.getValue() > 0) {
                                                Context context15 = tennisPrizeFactsView.getContext();
                                                context15.getClass();
                                                vm6 vm6Var10 = new vm6(context15);
                                                String string10 = vm6Var10.getResources().getString(R.string.career_total);
                                                string10.getClass();
                                                vm6Var10.j(string10, null, true);
                                                Set set2 = o84.a;
                                                Context context16 = vm6Var10.getContext();
                                                context16.getClass();
                                                Money prizeTotalRaw2 = playerTeamInfo.getPrizeTotalRaw();
                                                prizeTotalRaw2.getClass();
                                                vm6Var10.setLabelValue(o84.a(context16, prizeTotalRaw2, 0L, 12));
                                                linearLayout3.addView(vm6Var10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        List list = hviVar.c;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse = hviVar.b;
                        if (list != null) {
                            Sport sport = teamDetailsFragment2.C().getSport();
                            if (Intrinsics.c(sport != null ? sport.getSlug() : null, Sports.TENNIS)) {
                                krk krkVar11 = teamDetailsFragment2.l;
                                krkVar11.getClass();
                                TennisPlayerRankingView tennisPlayerRankingView = ((gvi) krkVar11).r;
                                RecentTeamTournamentsResponse recentTeamTournamentsResponse = hviVar.d;
                                List<TeamUniqueTournament> uniqueTournaments2 = recentTeamTournamentsResponse != null ? recentTeamTournamentsResponse.getUniqueTournaments() : null;
                                if (uniqueTournaments2 == null) {
                                    uniqueTournaments2 = km5.a;
                                }
                                tennisPlayerRankingView.m(list, uniqueTournaments2);
                            }
                        }
                        if (teamDetailsFragment2.C().getPlayerTeamInfo() == null) {
                            krk krkVar12 = teamDetailsFragment2.l;
                            krkVar12.getClass();
                            ((gvi) krkVar12).m.l(teamDetailsFragment2.C(), list);
                        }
                        Integer capMaximum = teamDetailsFragment2.C().getCapMaximum();
                        Integer luxuryTaxThreshold = teamDetailsFragment2.C().getLuxuryTaxThreshold();
                        Integer signedPlayers = teamDetailsFragment2.C().getSignedPlayers();
                        Integer activeCap = teamDetailsFragment2.C().getActiveCap();
                        Integer totalCap = teamDetailsFragment2.C().getTotalCap();
                        Integer capSpace = teamDetailsFragment2.C().getCapSpace();
                        List j = b.j(capMaximum, luxuryTaxThreshold, signedPlayers, activeCap, totalCap, capSpace);
                        if (j == null || !j.isEmpty()) {
                            Iterator it = j.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Integer) it.next()) != null) {
                                        krk krkVar13 = teamDetailsFragment2.l;
                                        krkVar13.getClass();
                                        TeamSalaryCapInfoView teamSalaryCapInfoView = ((gvi) krkVar13).o;
                                        vy1 vy1Var3 = teamSalaryCapInfoView.d;
                                        if (teamSalaryCapInfoView.getVisibility() != 0) {
                                            LinearLayout linearLayout4 = vy1Var3.b;
                                            if (linearLayout4.getChildCount() <= 0) {
                                                teamSalaryCapInfoView.setVisibility(0);
                                                kqb.d(LayoutInflater.from(teamSalaryCapInfoView.getContext()), linearLayout4, true).d.setText(teamSalaryCapInfoView.getResources().getString(R.string.basketball_salary_cap));
                                                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                                                currencyInstance.setCurrency(Currency.getInstance("USD"));
                                                currencyInstance.setMinimumFractionDigits(0);
                                                currencyInstance.setMaximumFractionDigits(0);
                                                if (capMaximum != null) {
                                                    int intValue = capMaximum.intValue();
                                                    Context context17 = teamSalaryCapInfoView.getContext();
                                                    context17.getClass();
                                                    vm6 vm6Var11 = new vm6(context17);
                                                    String string11 = vm6Var11.getContext().getString(R.string.basketball_salary_cap_maximum);
                                                    string11.getClass();
                                                    vm6Var11.j(string11, null, true);
                                                    String format = currencyInstance.format(Integer.valueOf(intValue));
                                                    format.getClass();
                                                    vm6Var11.setLabelValue(format);
                                                    linearLayout4.addView(vm6Var11);
                                                }
                                                if (luxuryTaxThreshold != null) {
                                                    int intValue2 = luxuryTaxThreshold.intValue();
                                                    Context context18 = teamSalaryCapInfoView.getContext();
                                                    context18.getClass();
                                                    vm6 vm6Var12 = new vm6(context18);
                                                    String string12 = vm6Var12.getContext().getString(R.string.basketball_luxury_tax_threshold);
                                                    string12.getClass();
                                                    vm6Var12.j(string12, null, true);
                                                    String format2 = currencyInstance.format(Integer.valueOf(intValue2));
                                                    format2.getClass();
                                                    vm6Var12.setLabelValue(format2);
                                                    linearLayout4.addView(vm6Var12);
                                                }
                                                if (signedPlayers != null) {
                                                    int intValue3 = signedPlayers.intValue();
                                                    Context context19 = teamSalaryCapInfoView.getContext();
                                                    context19.getClass();
                                                    vm6 vm6Var13 = new vm6(context19);
                                                    String string13 = vm6Var13.getContext().getString(R.string.basketball_salary_players_signed);
                                                    string13.getClass();
                                                    vm6Var13.j(string13, null, true);
                                                    vm6Var13.setLabelValue(String.valueOf(intValue3));
                                                    linearLayout4.addView(vm6Var13);
                                                }
                                                if (activeCap != null) {
                                                    int intValue4 = activeCap.intValue();
                                                    Context context20 = teamSalaryCapInfoView.getContext();
                                                    context20.getClass();
                                                    vm6 vm6Var14 = new vm6(context20);
                                                    String string14 = vm6Var14.getContext().getString(R.string.basketball_salary_active_cap);
                                                    string14.getClass();
                                                    vm6Var14.j(string14, null, true);
                                                    String format3 = currencyInstance.format(Integer.valueOf(intValue4));
                                                    format3.getClass();
                                                    vm6Var14.setLabelValue(format3);
                                                    linearLayout4.addView(vm6Var14);
                                                }
                                                if (totalCap != null) {
                                                    int intValue5 = totalCap.intValue();
                                                    Context context21 = teamSalaryCapInfoView.getContext();
                                                    context21.getClass();
                                                    vm6 vm6Var15 = new vm6(context21);
                                                    String string15 = vm6Var15.getContext().getString(R.string.basketball_salary_total_cap);
                                                    string15.getClass();
                                                    vm6Var15.j(string15, null, true);
                                                    String format4 = currencyInstance.format(Integer.valueOf(intValue5));
                                                    format4.getClass();
                                                    vm6Var15.setLabelValue(format4);
                                                    linearLayout4.addView(vm6Var15);
                                                }
                                                if (capSpace != null) {
                                                    int intValue6 = capSpace.intValue();
                                                    Context context22 = teamSalaryCapInfoView.getContext();
                                                    context22.getClass();
                                                    vm6 vm6Var16 = new vm6(context22);
                                                    String string16 = vm6Var16.getContext().getString(R.string.basketball_salary_cap_space);
                                                    string16.getClass();
                                                    vm6Var16.j(string16, null, true);
                                                    String format5 = currencyInstance.format(Integer.valueOf(intValue6));
                                                    format5.getClass();
                                                    vm6Var16.setLabelValue(format5);
                                                    linearLayout4.addView(vm6Var16);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        List<UniqueTournament> uniqueTournaments3 = teamUniqueTournamentsResponse != null ? teamUniqueTournamentsResponse.getUniqueTournaments() : null;
                        krk krkVar14 = teamDetailsFragment2.l;
                        krkVar14.getClass();
                        TeamTournamentsInfoView teamTournamentsInfoView = ((gvi) krkVar14).p;
                        if (uniqueTournaments3 == null) {
                            uniqueTournaments3 = km5.a;
                        }
                        vy1 vy1Var4 = teamTournamentsInfoView.d;
                        uniqueTournaments3.getClass();
                        if (teamTournamentsInfoView.getVisibility() != 0) {
                            LinearLayout linearLayout5 = vy1Var4.b;
                            if (linearLayout5.getChildCount() <= 0 && !uniqueTournaments3.isEmpty()) {
                                teamTournamentsInfoView.setVisibility(0);
                                View inflate = LayoutInflater.from(teamTournamentsInfoView.getContext()).inflate(R.layout.main_section_left_with_icon, (ViewGroup) linearLayout5, false);
                                linearLayout5.addView(inflate);
                                lqb a = lqb.a(inflate);
                                TextView textView = a.c;
                                Context context23 = teamTournamentsInfoView.getContext();
                                context23.getClass();
                                try {
                                    typeface = z1g.a(R.font.sofascore_sans_bold, context23);
                                } catch (Exception unused) {
                                    typeface = Typeface.DEFAULT;
                                }
                                textView.setTypeface(typeface);
                                textView.setTextSize(2, 14.0f);
                                a.b.setVisibility(8);
                                textView.setText(teamTournamentsInfoView.getResources().getString(R.string.competitions));
                                for (UniqueTournament uniqueTournament : uniqueTournaments3) {
                                    View inflate2 = LayoutInflater.from(teamTournamentsInfoView.getContext()).inflate(R.layout.image_label_layout, (ViewGroup) linearLayout5, false);
                                    linearLayout5.addView(inflate2);
                                    int i6 = R.id.layout_image;
                                    ImageView imageView = (ImageView) nq8.B(R.id.layout_image, inflate2);
                                    if (imageView != null) {
                                        i6 = R.id.primary_label;
                                        TextView textView2 = (TextView) nq8.B(R.id.primary_label, inflate2);
                                        if (textView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                                            as9.q(imageView, Integer.valueOf(uniqueTournament.getId()), 0, null);
                                            textView2.setText(tba.x(uniqueTournament));
                                            constraintLayout.getClass();
                                            aba.y(constraintLayout, 0, 3);
                                            constraintLayout.setOnClickListener(new eyd(26, teamTournamentsInfoView, uniqueTournament));
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                                    break;
                                }
                            }
                        }
                        TeamAchievementsResponse teamAchievementsResponse = hviVar.g;
                        Sport sport2 = teamDetailsFragment2.C().getSport();
                        String slug = sport2 != null ? sport2.getSlug() : null;
                        if (teamAchievementsResponse != null && slug != null) {
                            krk krkVar15 = teamDetailsFragment2.l;
                            krkVar15.getClass();
                            ((gvi) krkVar15).j.l(teamAchievementsResponse, slug);
                        }
                        y5j y5jVar = hviVar.h;
                        if (y5jVar != null) {
                            krk krkVar16 = teamDetailsFragment2.l;
                            krkVar16.getClass();
                            ((gvi) krkVar16).q.l(y5jVar);
                        }
                        if (teamUniqueTournamentsResponse == null || (uniqueTournaments = teamUniqueTournamentsResponse.getUniqueTournaments()) == null) {
                            bool = null;
                        } else {
                            if (!uniqueTournaments.isEmpty()) {
                                Iterator<T> it2 = uniqueTournaments.iterator();
                                while (it2.hasNext()) {
                                    if (((UniqueTournament) it2.next()).getId() == 16) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        }
                        boolean c = Intrinsics.c(bool, Boolean.TRUE);
                        if (bu7Var2 != null) {
                            teamDetailsFragment2.E(bu7Var2);
                            i22 = 8;
                        } else {
                            krk krkVar17 = teamDetailsFragment2.l;
                            krkVar17.getClass();
                            i22 = 8;
                            ((gvi) krkVar17).k.setVisibility(8);
                        }
                        gv9 gv9Var3 = hviVar.f;
                        if (gv9Var3 != null) {
                            krk krkVar18 = teamDetailsFragment2.l;
                            krkVar18.getClass();
                            ((gvi) krkVar18).n.setData(gv9Var3);
                        }
                        if (c && (iuhVar = (iuh) joaVar.getValue()) != null) {
                            iuhVar.m(fv.TEAM_SCREEN);
                        }
                        krk krkVar19 = teamDetailsFragment2.l;
                        krkVar19.getClass();
                        ((gvi) krkVar19).l.setVisibility(0);
                        Set set3 = aef.a;
                        Context requireContext3 = teamDetailsFragment2.requireContext();
                        requireContext3.getClass();
                        UniqueTournament primaryUniqueTournament = teamDetailsFragment2.C().getPrimaryUniqueTournament();
                        if (aef.e(requireContext3, primaryUniqueTournament != null ? Integer.valueOf(primaryUniqueTournament.getId()) : null) && !tz9.G(teamDetailsFragment2.D().i)) {
                            krk krkVar20 = teamDetailsFragment2.l;
                            krkVar20.getClass();
                            LinearLayout linearLayout6 = ((gvi) krkVar20).d;
                            Context requireContext4 = teamDetailsFragment2.requireContext();
                            requireContext4.getClass();
                            PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext4, null, 6);
                            wnn.y(promotionBannerView, fv.TEAM_SCREEN);
                            promotionBannerView.setVisibility(0);
                            krk krkVar21 = teamDetailsFragment2.l;
                            krkVar21.getClass();
                            linearLayout6.addView(promotionBannerView, ((gvi) krkVar21).d.getChildCount() - 1);
                        }
                        n4c n4cVar = (n4c) teamDetailsFragment2.x.getValue();
                        if (n4cVar != null) {
                            if (n4cVar.getParent() != null) {
                                n4cVar = null;
                            }
                            if (n4cVar != null) {
                                Context requireContext5 = teamDetailsFragment2.requireContext();
                                requireContext5.getClass();
                                n4cVar.l(haa.r(requireContext5, teamDetailsFragment2.C(), ((nui) teamDetailsFragment2.t.getValue()).y), new kvi(teamDetailsFragment2, 5));
                                krk krkVar22 = teamDetailsFragment2.l;
                                krkVar22.getClass();
                                LinearLayout linearLayout7 = ((gvi) krkVar22).d;
                                krk krkVar23 = teamDetailsFragment2.l;
                                krkVar23.getClass();
                                LinearLayout linearLayout8 = ((gvi) krkVar23).d;
                                krk krkVar24 = teamDetailsFragment2.l;
                                krkVar24.getClass();
                                linearLayout7.addView(n4cVar, linearLayout8.indexOfChild(((gvi) krkVar24).n) + 1);
                            }
                        }
                        iuh iuhVar2 = (iuh) joaVar.getValue();
                        if (iuhVar2 != null) {
                            iuh iuhVar3 = (c && iuhVar2.getParent() == null) ? iuhVar2 : null;
                            if (iuhVar3 != null) {
                                krk krkVar25 = teamDetailsFragment2.l;
                                krkVar25.getClass();
                                LinearLayout linearLayout9 = ((gvi) krkVar25).d;
                                krk krkVar26 = teamDetailsFragment2.l;
                                krkVar26.getClass();
                                LinearLayout linearLayout10 = ((gvi) krkVar26).d;
                                krk krkVar27 = teamDetailsFragment2.l;
                                krkVar27.getClass();
                                linearLayout9.addView(iuhVar3, linearLayout10.indexOfChild(((gvi) krkVar27).l) - 1);
                            }
                        }
                        if (!tz9.G(teamDetailsFragment2.D().i)) {
                            Context requireContext6 = teamDetailsFragment2.requireContext();
                            requireContext6.getClass();
                            bef d3 = aef.d(requireContext6, teamDetailsFragment2.C());
                            if (d3 != null) {
                                krk krkVar28 = teamDetailsFragment2.l;
                                krkVar28.getClass();
                                if (((gvi) krkVar28).f.getParent() != null) {
                                    krk krkVar29 = teamDetailsFragment2.l;
                                    krkVar29.getClass();
                                    View inflate3 = ((gvi) krkVar29).f.inflate();
                                    inflate3.getClass();
                                    PromotionBannerView promotionBannerView2 = (PromotionBannerView) inflate3;
                                    wnn.x(promotionBannerView2, d3, fv.TEAM_SCREEN);
                                    promotionBannerView2.setVisibility(0);
                                }
                            }
                            List list2 = hviVar.i;
                            if (list2 != null) {
                                krk krkVar30 = teamDetailsFragment2.l;
                                krkVar30.getClass();
                                FrameLayout frameLayout = ((gvi) krkVar30).h;
                                if (!list2.isEmpty()) {
                                    i22 = 0;
                                }
                                frameLayout.setVisibility(i22);
                                krk krkVar31 = teamDetailsFragment2.l;
                                krkVar31.getClass();
                                PromotionalOffersBannerView.j(((gvi) krkVar31).g, list2, new sdf(teamDetailsFragment2.C().getId()), fv.TEAM_SCREEN);
                            }
                        }
                        teamDetailsFragment2.v = false;
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (this.v) {
            pvi D = D();
            int id = C().getId();
            iz2 z = un0.z(D);
            hs4 hs4Var = z45.a;
            xw3.L(z, hq4.c, null, new qu7(D, id, (rq3) null), 2);
            return;
        }
        bu7 bu7Var = (bu7) D().k.d();
        if (bu7Var != null) {
            Event event = bu7Var.a;
            if (!ug5.u(event.getStartTimestamp()) && !ug5.v(event.getStartTimestamp())) {
                bu7Var = null;
            }
            if (bu7Var != null) {
                pvi D2 = D();
                xw3.L(un0.z(D2), null, null, new nvi(D2, bu7Var.a.getId(), null), 3);
                return;
            }
        }
        n();
    }
}
