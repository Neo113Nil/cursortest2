package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.details.view.TeamInfoView;
import com.sofascore.results.team.details.view.TeamRecentFormView;
import com.sofascore.results.team.details.view.TeamSalaryCapInfoView;
import com.sofascore.results.team.details.view.TeamTournamentsInfoView;
import com.sofascore.results.team.details.view.TennisGrandSlamPerformanceView;
import com.sofascore.results.team.details.view.TennisPlayerRankingView;
import com.sofascore.results.team.details.view.TennisPrizeFactsView;
import com.sofascore.results.team.details.view.TennisProfileFactsView;
import com.sofascore.results.view.FeaturedMatchView;
import com.sofascore.results.view.SuggestEditView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gvi implements krk {
    public final SwipeRefreshLayout a;
    public final LinearLayout b;
    public final GambleRegulationFooterView c;
    public final LinearLayout d;
    public final ComposeView e;
    public final ViewStub f;
    public final PromotionalOffersBannerView g;
    public final FrameLayout h;
    public final SwipeRefreshLayout i;
    public final TeamAchievementsView j;
    public final FeaturedMatchView k;
    public final SuggestEditView l;
    public final TeamInfoView m;
    public final TeamRecentFormView n;
    public final TeamSalaryCapInfoView o;
    public final TeamTournamentsInfoView p;
    public final TennisGrandSlamPerformanceView q;
    public final TennisPlayerRankingView r;
    public final TennisPrizeFactsView s;
    public final TennisProfileFactsView t;

    public gvi(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, GambleRegulationFooterView gambleRegulationFooterView, LinearLayout linearLayout2, ComposeView composeView, ViewStub viewStub, PromotionalOffersBannerView promotionalOffersBannerView, FrameLayout frameLayout, SwipeRefreshLayout swipeRefreshLayout2, TeamAchievementsView teamAchievementsView, FeaturedMatchView featuredMatchView, SuggestEditView suggestEditView, TeamInfoView teamInfoView, TeamRecentFormView teamRecentFormView, TeamSalaryCapInfoView teamSalaryCapInfoView, TeamTournamentsInfoView teamTournamentsInfoView, TennisGrandSlamPerformanceView tennisGrandSlamPerformanceView, TennisPlayerRankingView tennisPlayerRankingView, TennisPrizeFactsView tennisPrizeFactsView, TennisProfileFactsView tennisProfileFactsView) {
        this.a = swipeRefreshLayout;
        this.b = linearLayout;
        this.c = gambleRegulationFooterView;
        this.d = linearLayout2;
        this.e = composeView;
        this.f = viewStub;
        this.g = promotionalOffersBannerView;
        this.h = frameLayout;
        this.i = swipeRefreshLayout2;
        this.j = teamAchievementsView;
        this.k = featuredMatchView;
        this.l = suggestEditView;
        this.m = teamInfoView;
        this.n = teamRecentFormView;
        this.o = teamSalaryCapInfoView;
        this.p = teamTournamentsInfoView;
        this.q = tennisGrandSlamPerformanceView;
        this.r = tennisPlayerRankingView;
        this.s = tennisPrizeFactsView;
        this.t = tennisProfileFactsView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
