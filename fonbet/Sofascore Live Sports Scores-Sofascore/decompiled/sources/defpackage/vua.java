package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.RatedTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.model.profile.Organization;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.details.view.tennis.TennisGroundTypeView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.fragment.details.compose.totr.share.TeamOfTheRoundShareBottomSheet;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.view.FeaturedMatchView;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vua implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueDetailsFragment b;

    public /* synthetic */ vua(LeagueDetailsFragment leagueDetailsFragment, int i) {
        this.a = i;
        this.b = leagueDetailsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0bd3  */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v132, types: [tua] */
    /* JADX WARN: Type inference failed for: r0v69, types: [ka9] */
    /* JADX WARN: Type inference failed for: r10v44, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v19, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v3, types: [cue] */
    /* JADX WARN: Type inference failed for: r4v48, types: [boolean] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        joa joaVar;
        joa joaVar2;
        int i;
        long j;
        List list;
        Boolean bool;
        Integer num;
        List list2;
        boolean z;
        PromotionalOffersBannerView promotionalOffersBannerView;
        UniqueTournament uniqueTournament;
        ?? r1;
        boolean z2;
        String str;
        Category category;
        Season l;
        boolean z3;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse;
        nue nueVar;
        xmd xmdVar;
        gv9 gv9Var;
        and andVar;
        old oldVar;
        GambleRegulationFooterView gambleRegulationFooterView;
        gv9 gv9Var2;
        Object obj2;
        int i2 = this.a;
        int i3 = 10;
        LeagueDetailsFragment leagueDetailsFragment = this.b;
        switch (i2) {
            case 0:
                dyi F = leagueDetailsFragment.F();
                int i4 = dyi.w;
                F.l = false;
                F.q = (TeamOfTheWeekResponse) obj;
                F.o();
                break;
            case 1:
                LeagueDetailsFragment leagueDetailsFragment2 = this.b;
                joa joaVar3 = leagueDetailsFragment2.U;
                joa joaVar4 = leagueDetailsFragment2.I;
                eva evaVar = (eva) obj;
                if (evaVar != null) {
                    List list3 = evaVar.i;
                    List list4 = evaVar.l;
                    List list5 = evaVar.f;
                    UniqueTournamentDetails uniqueTournamentDetails = evaVar.a;
                    if (leagueDetailsFragment2.getActivity() != null) {
                        BrandingTournament brandingTournament = leagueDetailsFragment2.H().k;
                        leagueDetailsFragment2.n();
                        if (list5 == null || list5.isEmpty()) {
                            List list6 = evaVar.e;
                            if (list6 != null) {
                                if (list6.size() > 1) {
                                    leagueDetailsFragment2.E().l(list6.size(), null);
                                } else {
                                    ii5 E = leagueDetailsFragment2.E();
                                    int size = list6.size();
                                    String editorName = ((ProfileData) CollectionsKt.Y(list6)).getEditorName();
                                    if (editorName == null) {
                                        editorName = ((ProfileData) CollectionsKt.Y(list6)).getNickname();
                                    }
                                    E.l(size, editorName);
                                }
                                leagueDetailsFragment2.E().setOnClickListener(new au7(18, leagueDetailsFragment2, list6));
                            }
                        } else {
                            leagueDetailsFragment2.E().l(1, ((Organization) CollectionsKt.Y(list5)).getName());
                            leagueDetailsFragment2.E().setOnClickListener(new cd5(leagueDetailsFragment2, 13));
                        }
                        if (uniqueTournamentDetails != null) {
                            bva bvaVar = (bva) leagueDetailsFragment2.D.getValue();
                            boolean z4 = leagueDetailsFragment2.C().l;
                            bvaVar.getClass();
                            j = 1000;
                            dd ddVar = bvaVar.d;
                            if (bvaVar.e) {
                                bvaVar.e = false;
                                if (Intrinsics.c(uniqueTournamentDetails.getCategory().getSport().getSlug(), Sports.TENNIS) && uniqueTournamentDetails.getGroundType() != null) {
                                    TennisGroundTypeView tennisGroundTypeView = (TennisGroundTypeView) ((z82) ddVar.c).f;
                                    String groundType = uniqueTournamentDetails.getGroundType();
                                    groundType.getClass();
                                    ?? r10 = tennisGroundTypeView.d.c;
                                    r10.setVisibility(0);
                                    Context context = tennisGroundTypeView.getContext();
                                    r10.setText(context == null ? null : d2a.x(context, groundType, true));
                                    Context context2 = tennisGroundTypeView.getContext();
                                    context2.getClass();
                                    r10.setBackgroundTintList(ColorStateList.valueOf(d2a.y(context2, groundType)));
                                }
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                if (endDateTimestamp == null || startDateTimestamp == null || endDateTimestamp.intValue() <= startDateTimestamp.intValue() || !z4) {
                                    joaVar = joaVar3;
                                    joaVar2 = joaVar4;
                                    i = 1;
                                    ((ConstraintLayout) ((ez0) ddVar.d).b).setVisibility(8);
                                } else {
                                    ez0 ez0Var = (ez0) ddVar.d;
                                    TextView textView = (TextView) ez0Var.e;
                                    long intValue = startDateTimestamp.intValue();
                                    bi4 bi4Var = bi4.PATTERN_DMM;
                                    ConcurrentHashMap concurrentHashMap = hk4.a;
                                    i = 1;
                                    fn0.u(intValue, hk4.a(bi4Var.d()), textView);
                                    TextView textView2 = (TextView) ez0Var.c;
                                    ProgressBar progressBar = (ProgressBar) ez0Var.d;
                                    String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(endDateTimestamp.intValue()));
                                    format.getClass();
                                    textView2.setText(format);
                                    joaVar = joaVar3;
                                    joaVar2 = joaVar4;
                                    progressBar.setProgress((int) ((((System.currentTimeMillis() / 1000) - startDateTimestamp.intValue()) * 100) / (endDateTimestamp.intValue() - startDateTimestamp.intValue())));
                                    progressBar.setVisibility(0);
                                    ((ConstraintLayout) ez0Var.b).setVisibility(0);
                                }
                            } else {
                                joaVar = joaVar3;
                                joaVar2 = joaVar4;
                                i = 1;
                            }
                            ?? r0 = (tua) leagueDetailsFragment2.J.getValue();
                            if (r0 != 0) {
                                FragmentActivity requireActivity = leagueDetailsFragment2.requireActivity();
                                requireActivity.getClass();
                                r0.n(requireActivity, evaVar, leagueDetailsFragment2.C().l, ((list4 == null || list4.isEmpty()) ? i : 0) ^ 1);
                            }
                        } else {
                            joaVar = joaVar3;
                            joaVar2 = joaVar4;
                            i = 1;
                            j = 1000;
                        }
                        qrj qrjVar = (qrj) leagueDetailsFragment2.K.getValue();
                        if (qrjVar != null) {
                            Integer F2 = o3a.F(leagueDetailsFragment2.G());
                            qrjVar.l(F2 != null ? F2.intValue() : -1, list4, uniqueTournamentDetails, leagueDetailsFragment2.G().getSportSlug());
                        }
                        v6j v6jVar = (v6j) leagueDetailsFragment2.L.getValue();
                        if (v6jVar != null) {
                            v6jVar.j(uniqueTournamentDetails, evaVar.j);
                        }
                        r6j r6jVar = (r6j) leagueDetailsFragment2.M.getValue();
                        if (r6jVar != null) {
                            List<UniqueTournament> linkedUniqueTournaments = uniqueTournamentDetails != null ? uniqueTournamentDetails.getLinkedUniqueTournaments() : null;
                            cva cvaVar = r6jVar.d;
                            if (r6jVar.getVisibility() != 0 && linkedUniqueTournaments != null && !linkedUniqueTournaments.isEmpty()) {
                                r6jVar.setVisibility(0);
                                cvaVar.c.setText(r6jVar.getContext().getString(R.string.related_competitions));
                                for (UniqueTournament uniqueTournament2 : linkedUniqueTournaments) {
                                    LayoutInflater from = LayoutInflater.from(r6jVar.getContext());
                                    LinearLayout linearLayout = cvaVar.b;
                                    View inflate = from.inflate(R.layout.league_details_footer_row, (ViewGroup) linearLayout, false);
                                    linearLayout.addView(inflate);
                                    rua a = rua.a(inflate);
                                    as9.q(a.b, Integer.valueOf(uniqueTournament2.getId()), 0, null);
                                    a.c.setText(tba.x(uniqueTournament2));
                                    z8e.a0(r6jVar, j, new deh(25, r6jVar, uniqueTournament2));
                                }
                            }
                        }
                        bu7 bu7Var = evaVar.k;
                        if (bu7Var != null) {
                            ((FeaturedMatchView) joaVar2.getValue()).setVisibility(0);
                            FeaturedMatchView featuredMatchView = (FeaturedMatchView) joaVar2.getValue();
                            vmd vmdVar = vmd.LEAGUE_DETAILS;
                            boolean H = tz9.H(leagueDetailsFragment2.H().k);
                            BrandingTournament brandingTournament2 = leagueDetailsFragment2.H().k;
                            Boolean valueOf = brandingTournament2 != null ? Boolean.valueOf((boolean) (brandingTournament2.getOddsProviderId() != null ? i : 0)) : null;
                            BrandingTournament brandingTournament3 = leagueDetailsFragment2.H().k;
                            featuredMatchView.j(bu7Var, true, vmdVar, H, valueOf, brandingTournament3 != null ? brandingTournament3.getForceOdds() : null);
                            xmd xmdVar2 = bu7Var.b;
                            and andVar2 = (xmdVar2 == null || (gv9Var2 = xmdVar2.a) == null) ? null : (and) CollectionsKt.firstOrNull(gv9Var2);
                            if ((xmdVar2 != null ? xmdVar2.b : null) == null || andVar2 == null || leagueDetailsFragment2.X != null) {
                                list = list3;
                                if (xmdVar2 == null) {
                                    zsk zskVar = leagueDetailsFragment2.X;
                                    if (zskVar != null) {
                                        zskVar.a();
                                    }
                                    leagueDetailsFragment2.X = null;
                                }
                            } else {
                                g6b lifecycle = leagueDetailsFragment2.getLifecycle();
                                lifecycle.getClass();
                                zsk zskVar2 = new zsk(lifecycle, 45);
                                list = list3;
                                zskVar2.b((FeaturedMatchView) joaVar2.getValue(), new m61(leagueDetailsFragment2, bu7Var, xmdVar2, andVar2, 12), null);
                                leagueDetailsFragment2.X = zskVar2;
                            }
                        } else {
                            list = list3;
                            ((FeaturedMatchView) joaVar2.getValue()).setVisibility(8);
                            GambleRegulationFooterView gambleRegulationFooterView2 = (GambleRegulationFooterView) joaVar.getValue();
                            if (gambleRegulationFooterView2 != null) {
                                gambleRegulationFooterView2.setVisibility(8);
                            }
                        }
                        if (bu7Var != null && (xmdVar = bu7Var.b) != null && (gv9Var = xmdVar.a) != null && (andVar = (and) CollectionsKt.firstOrNull(gv9Var)) != null && (oldVar = andVar.a) != null && (gambleRegulationFooterView = (GambleRegulationFooterView) joaVar.getValue()) != null) {
                            Boolean bool2 = oldVar.e;
                            int i5 = GambleRegulationFooterView.e;
                            gambleRegulationFooterView.j(bool2, false);
                        }
                        UniqueTournament uniqueTournament3 = leagueDetailsFragment2.G().getUniqueTournament();
                        if (uniqueTournament3 != null && (playerOfTheSeasonResponse = evaVar.c) != null && (nueVar = (nue) leagueDetailsFragment2.O.getValue()) != null) {
                            int id = uniqueTournament3.getId();
                            Season l2 = leagueDetailsFragment2.C().l();
                            int id2 = l2 != null ? l2.getId() : 0;
                            String sportSlug = leagueDetailsFragment2.G().getSportSlug();
                            ij8 ij8Var = new ij8(27, leagueDetailsFragment2, playerOfTheSeasonResponse);
                            int i6 = nue.g;
                            nueVar.l(id, id2, playerOfTheSeasonResponse, sportSlug, ij8Var, null);
                        }
                        iuh iuhVar = (iuh) leagueDetailsFragment2.C.getValue();
                        if (iuhVar != null) {
                            iuhVar.m(fv.LEAGUE_SCREEN);
                        }
                        TopPerformanceResponse topPerformanceResponse = evaVar.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : null;
                            if (ratedTopPlayersStatistics == null) {
                                leagueDetailsFragment2.H().s = false;
                            } else {
                                ?? r24 = (cue) leagueDetailsFragment2.P.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : null;
                                r24.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : null, topPerformanceResponse.getPlayerOfTheTournament(), new wua(leagueDetailsFragment2, 0), new wua(leagueDetailsFragment2, i), new wua(leagueDetailsFragment2, 2));
                            }
                        }
                        exa exaVar = evaVar.p;
                        if (exaVar != null && !exaVar.b.isEmpty()) {
                            lxa lxaVar = (lxa) leagueDetailsFragment2.W.getValue();
                            if (lxaVar != null) {
                                Integer F3 = o3a.F(leagueDetailsFragment2.G());
                                lxaVar.m(exaVar, F3 != null ? F3.intValue() : -1, new wua(leagueDetailsFragment2, 4));
                            }
                            if (Intrinsics.c(leagueDetailsFragment2.y, "goat")) {
                                leagueDetailsFragment2.y = null;
                                krk krkVar = leagueDetailsFragment2.l;
                                krkVar.getClass();
                                leagueDetailsFragment2.t(((oo8) krkVar).d, new vua(leagueDetailsFragment2, 7));
                            }
                        }
                        if (list != null) {
                            if (!list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (((TournamentRoundWrapper) it.next()).getHasTotw()) {
                                        z3 = true;
                                        bool = Boolean.valueOf(z3);
                                    }
                                }
                            }
                            z3 = false;
                            bool = Boolean.valueOf(z3);
                        } else {
                            bool = null;
                        }
                        Boolean bool3 = Boolean.TRUE;
                        int i7 = 6;
                        if (Intrinsics.c(bool, bool3)) {
                            leagueDetailsFragment2.F().setVisibility(0);
                            leagueDetailsFragment2.F().setOnItemSelectedCallback(new vua(leagueDetailsFragment2, 8));
                            leagueDetailsFragment2.F().setOnShareClickCallback(new vua(leagueDetailsFragment2, 9));
                            leagueDetailsFragment2.F().setOnChatClickCallback(new vua(leagueDetailsFragment2, 5));
                            dyi F4 = leagueDetailsFragment2.F();
                            UniqueTournament uniqueTournament4 = leagueDetailsFragment2.G().getUniqueTournament();
                            List list7 = list == null ? km5.a : list;
                            Integer num2 = leagueDetailsFragment2.C().j;
                            Season l3 = leagueDetailsFragment2.C().l();
                            int id3 = l3 != null ? l3.getId() : 0;
                            UniqueTournament uniqueTournament5 = leagueDetailsFragment2.G().getUniqueTournament();
                            boolean z5 = uniqueTournament5 != null && uniqueTournament5.getId() == 16 && (l = leagueDetailsFragment2.C().l()) != null && l.getId() == 58210;
                            F4.getClass();
                            list7.getClass();
                            F4.m = Intrinsics.c(uniqueTournament4 != null ? uniqueTournament4.getPlayerOfTheTournament() : null, bool3);
                            if (uniqueTournament4 == null || (str = tba.x(uniqueTournament4)) == null) {
                                String name = uniqueTournament4 != null ? uniqueTournament4.getName() : null;
                                str = name == null ? "" : name;
                            }
                            F4.h = str;
                            Integer valueOf2 = uniqueTournament4 != null ? Integer.valueOf(uniqueTournament4.getId()) : null;
                            String sportSlug2 = uniqueTournament4 != null ? uniqueTournament4.getSportSlug() : null;
                            String slug = (uniqueTournament4 == null || (category = uniqueTournament4.getCategory()) == null) ? null : category.getSlug();
                            String str2 = slug == null ? "" : slug;
                            String slug2 = uniqueTournament4 != null ? uniqueTournament4.getSlug() : null;
                            F4.l(valueOf2, sportSlug2, list7, num2, id3, z5, str2, slug2 == null ? "" : slug2);
                            if (leagueDetailsFragment2.x) {
                                leagueDetailsFragment2.x = false;
                                krk krkVar2 = leagueDetailsFragment2.l;
                                krkVar2.getClass();
                                leagueDetailsFragment2.t(((oo8) krkVar2).d, new vua(leagueDetailsFragment2, i7));
                            }
                        }
                        String str3 = evaVar.g;
                        if (str3 != null) {
                            ib9 ib9Var = (ib9) leagueDetailsFragment2.R.getValue();
                            UniqueTournament uniqueTournament6 = leagueDetailsFragment2.G().getUniqueTournament();
                            int id4 = uniqueTournament6 != null ? uniqueTournament6.getId() : 0;
                            ib9Var.getClass();
                            if (ib9Var.getVisibility() != 0) {
                                ib9Var.setVisibility(0);
                                t22 t22Var = ib9Var.d;
                                TextView textView3 = t22Var.d;
                                LinearLayout linearLayout2 = t22Var.b;
                                Integer valueOf3 = Integer.valueOf(id4);
                                Context context3 = ib9Var.getContext();
                                context3.getClass();
                                String I = pco.I(0, valueOf3, hkg.b0(context3));
                                ua5 ua5Var = ua5.a;
                                Context context4 = ib9Var.getContext();
                                context4.getClass();
                                int s = ao2.s(24, context4);
                                t25.a(s);
                                haa.q(textView3, I, ua5Var, new t25(s));
                                t22Var.c.setText(ib9Var.getContext().getString(R.string.football_historical_data_description, str3));
                                linearLayout2.getClass();
                                aba.y(linearLayout2, 0, 3);
                                linearLayout2.setOnClickListener(new l8(ib9Var, id4, 3));
                            }
                        }
                        Set set = aef.a;
                        Context requireContext = leagueDetailsFragment2.requireContext();
                        requireContext.getClass();
                        if (aef.e(requireContext, uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : null) && !tz9.H(brandingTournament)) {
                            ((PromotionBannerView) leagueDetailsFragment2.E.getValue()).setVisibility(0);
                        }
                        oxe oxeVar = (oxe) leagueDetailsFragment2.H.getValue();
                        Integer F5 = o3a.F(leagueDetailsFragment2.G());
                        gv9 gv9Var3 = evaVar.o;
                        oxeVar.getClass();
                        gv9Var3.getClass();
                        if (oxeVar.getVisibility() != 0 && !gv9Var3.isEmpty()) {
                            oxeVar.setVisibility(0);
                            oxeVar.d.b.setContent(new tc3(-1938202271, new nxe(F5, gv9Var3, 0), true));
                        }
                        if (leagueDetailsFragment2.C().l) {
                            String c = dv3.c();
                            List list8 = evaVar.h;
                            if (list8 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : list8) {
                                    Highlight highlight = (Highlight) obj3;
                                    if (highlight.getMediaType() != 1 && highlight.getMediaType() != 2 && highlight.getMediaType() != 6) {
                                    }
                                    arrayList.add(obj3);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Highlight highlight2 = (Highlight) next;
                                    List<String> forCountries = highlight2.getForCountries();
                                    if (forCountries == null || forCountries.isEmpty()) {
                                        z2 = true;
                                    } else {
                                        List<String> forCountries2 = highlight2.getForCountries();
                                        Boolean valueOf4 = forCountries2 != null ? Boolean.valueOf(forCountries2.contains(c)) : null;
                                        z2 = valueOf4 != null ? valueOf4.booleanValue() : false;
                                    }
                                    if (z2) {
                                        arrayList2.add(next);
                                    }
                                }
                                List L0 = CollectionsKt.L0(arrayList2, 3);
                                r1 = new ArrayList(k13.r(L0, 10));
                                Iterator it3 = L0.iterator();
                                while (it3.hasNext()) {
                                    r1.add(new r5c((Highlight) it3.next(), false, false, 0, (Integer) null, 62));
                                }
                            } else {
                                r1 = km5.a;
                            }
                            leagueDetailsFragment2.i.e = Integer.valueOf(r1.size());
                            if (leagueDetailsFragment2.w) {
                                leagueDetailsFragment2.w = false;
                                krk krkVar3 = leagueDetailsFragment2.l;
                                krkVar3.getClass();
                                leagueDetailsFragment2.t(((oo8) krkVar3).d, new vua(leagueDetailsFragment2, 11));
                            }
                            rfo.F(r1);
                            leagueDetailsFragment2.D().F(r1);
                        }
                        Brand brand = brandingTournament != null ? brandingTournament.getBrand() : null;
                        if (brandingTournament != null && brandingTournament.getImageDisplayType() != ImageDisplayType.UNKNOWN && brand != null && leagueDetailsFragment2.T == null) {
                            Context requireContext2 = leagueDetailsFragment2.requireContext();
                            requireContext2.getClass();
                            f32 f32Var = new f32(requireContext2, 0);
                            Integer F6 = o3a.F(leagueDetailsFragment2.G());
                            f32Var.b(brandingTournament.getBrand(), F6 != null ? F6.intValue() : 0, brandingTournament.getImageDisplayType(), brandingTournament.getBannerHeight(), brandingTournament.getAdUnitHeight(), brandingTournament.getUrl(), BrandLocation.LeagueScreen);
                            leagueDetailsFragment2.T = f32Var;
                        }
                        if (tz9.H(brandingTournament)) {
                            GambleRegulationFooterView gambleRegulationFooterView3 = (GambleRegulationFooterView) joaVar.getValue();
                            if (gambleRegulationFooterView3 != null) {
                                gambleRegulationFooterView3.setTextColor(R.color.on_color_secondary);
                            }
                        } else {
                            Set set2 = aef.a;
                            Context requireContext3 = leagueDetailsFragment2.requireContext();
                            requireContext3.getClass();
                            bef d = aef.d(requireContext3, uniqueTournamentDetails);
                            if (d != null && leagueDetailsFragment2.F == null) {
                                Context requireContext4 = leagueDetailsFragment2.requireContext();
                                requireContext4.getClass();
                                num = null;
                                PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext4, null, 6);
                                wnn.x(promotionBannerView, d, fv.LEAGUE_SCREEN);
                                promotionBannerView.setVisibility(0);
                                leagueDetailsFragment2.F = promotionBannerView;
                                list2 = evaVar.m;
                                if (list2 != null && (promotionalOffersBannerView = (PromotionalOffersBannerView) leagueDetailsFragment2.A.getValue()) != null) {
                                    uniqueTournament = leagueDetailsFragment2.G().getUniqueTournament();
                                    if (uniqueTournament != null) {
                                        num = Integer.valueOf(uniqueTournament.getId());
                                    }
                                    PromotionalOffersBannerView.j(promotionalOffersBannerView, list2, new tdf(leagueDetailsFragment2.G().getId(), num), fv.LEAGUE_SCREEN);
                                }
                                if (leagueDetailsFragment2.D().g.isEmpty() && leagueDetailsFragment2.D().h.isEmpty()) {
                                    String sportSlug3 = leagueDetailsFragment2.G().getSportSlug();
                                    z = leagueDetailsFragment2.C().l;
                                    sportSlug3.getClass();
                                    dva dvaVar = (sportSlug3.equals(Sports.BASKETBALL) || z) ? !sportSlug3.equals(Sports.BASKETBALL) ? new dva(b.j(lva.a, lva.b, lva.c, lva.k, lva.g, lva.h, lva.d, lva.f, lva.j, lva.i, lva.l, lva.m), b.j(lva.n, lva.p, lva.q, lva.s, lva.t, lva.u, lva.v, lva.e, lva.w)) : new dva(b.j(lva.a, lva.b, lva.c, lva.d, lva.f, lva.i, lva.k, lva.l, lva.m), b.j(lva.n, lva.o, lva.p, lva.q, lva.r, lva.s, lva.t, lva.u, lva.v, lva.x, lva.w)) : new dva(b.j(lva.a, lva.c, lva.f, lva.k, lva.j), b.j(lva.n, lva.p, lva.q, lva.e, lva.w));
                                    if (!z) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj4 : dvaVar.a) {
                                            if (((lva) obj4) != lva.b) {
                                                arrayList3.add(obj4);
                                            }
                                        }
                                        List list9 = dvaVar.b;
                                        list9.getClass();
                                        dvaVar = new dva(arrayList3, list9);
                                    }
                                    leagueDetailsFragment2.I(dvaVar.a, true);
                                    leagueDetailsFragment2.I(dvaVar.b, false);
                                }
                            }
                        }
                        num = null;
                        list2 = evaVar.m;
                        if (list2 != null) {
                            uniqueTournament = leagueDetailsFragment2.G().getUniqueTournament();
                            if (uniqueTournament != null) {
                            }
                            PromotionalOffersBannerView.j(promotionalOffersBannerView, list2, new tdf(leagueDetailsFragment2.G().getId(), num), fv.LEAGUE_SCREEN);
                        }
                        if (leagueDetailsFragment2.D().g.isEmpty()) {
                            String sportSlug32 = leagueDetailsFragment2.G().getSportSlug();
                            z = leagueDetailsFragment2.C().l;
                            sportSlug32.getClass();
                            if (sportSlug32.equals(Sports.BASKETBALL)) {
                            }
                            if (!z) {
                            }
                            leagueDetailsFragment2.I(dvaVar.a, true);
                            leagueDetailsFragment2.I(dvaVar.b, false);
                        }
                    }
                }
                break;
            case 2:
                fza fzaVar = (fza) obj;
                if (fzaVar != null) {
                    ArrayList arrayList4 = fzaVar.c;
                    hza hzaVar = (hza) leagueDetailsFragment.G.getValue();
                    UniqueTournament uniqueTournament7 = leagueDetailsFragment.G().getUniqueTournament();
                    boolean c2 = Intrinsics.c(uniqueTournament7 != null ? uniqueTournament7.getHasRating() : null, Boolean.TRUE);
                    vua vuaVar = new vua(leagueDetailsFragment, i3);
                    hzaVar.getClass();
                    e1d e1dVar = hzaVar.e;
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((jza) it4.next()).a);
                    }
                    ((eoh) e1dVar).setValue(l6g.W(arrayList5));
                    ((eoh) hzaVar.f).setValue(fzaVar.a);
                    hzaVar.g.i(fzaVar.b);
                    hzaVar.h = arrayList4;
                    if (hzaVar.getVisibility() != 0) {
                        hzaVar.setVisibility(0);
                        hzaVar.d.b.setContent(new tc3(948324000, new gza(hzaVar, vuaVar, c2, r12), true));
                    }
                }
                break;
            case 3:
                LeagueDetailsFragment leagueDetailsFragment3 = this.b;
                joa joaVar5 = leagueDetailsFragment3.V;
                List list10 = (List) obj;
                if (list10 == null || list10.isEmpty()) {
                    y1f y1fVar = (y1f) joaVar5.getValue();
                    if (y1fVar != null) {
                        y1fVar.setVisibility(8);
                    }
                } else {
                    y1f y1fVar2 = (y1f) joaVar5.getValue();
                    if (y1fVar2 != null) {
                        s26 s26Var = new s26(1, leagueDetailsFragment3, LeagueDetailsFragment.class, "showPlayerInfo", "showPlayerInfo(I)V", 0, 25);
                        fl8 fl8Var = new fl8(0, leagueDetailsFragment3, LeagueDetailsFragment.class, "showTopFollowedPlayersModal", "showTopFollowedPlayersModal()V", 0, 3);
                        y1fVar2.setVisibility(0);
                        dk2 dk2Var = y1fVar2.d;
                        dk2Var.c.setOnClickListener(new cne(fl8Var, 5));
                        int min = Math.min(2, list10.size());
                        if (min >= 0) {
                            while (true) {
                                nta ntaVar = (nta) list10.get(r12);
                                LinearLayout linearLayout3 = dk2Var.b;
                                linearLayout3.getClass();
                                ArrayList arrayList6 = y1fVar2.e;
                                if (r12 < 0 || r12 >= arrayList6.size()) {
                                    r1f a2 = r1f.a(LayoutInflater.from(y1fVar2.getContext()), linearLayout3);
                                    arrayList6.add(a2);
                                    linearLayout3.addView(a2.a, linearLayout3.indexOfChild(dk2Var.c));
                                    obj2 = a2;
                                } else {
                                    obj2 = arrayList6.get(r12);
                                }
                                r1f r1fVar = (r1f) obj2;
                                int i8 = r12 + 1;
                                rha.l(r1fVar, ntaVar, i8, null);
                                r1fVar.a.setOnClickListener(new eyd(11, s26Var, ntaVar));
                                if (r12 != min) {
                                    r12 = i8;
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                leagueDetailsFragment.H().s = true;
                break;
            case 5:
                TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = (TeamOfTheRoundChatInterface) obj;
                teamOfTheRoundChatInterface.getClass();
                int i9 = ChatActivity.Z;
                Context requireContext5 = leagueDetailsFragment.requireContext();
                requireContext5.getClass();
                tu[] tuVarArr = tu.a;
                uic.w(requireContext5, teamOfTheRoundChatInterface, "team_of_the_round", 56);
                break;
            case 6:
                ((View) obj).getClass();
                krk krkVar4 = leagueDetailsFragment.l;
                krkVar4.getClass();
                n layoutManager = ((oo8) krkVar4).d.getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(Math.max(0, leagueDetailsFragment.D().g.indexOf(leagueDetailsFragment.F())), 0);
                break;
            case 7:
                View view = (View) obj;
                view.getClass();
                RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
                if (recyclerView == null) {
                    break;
                } else {
                    n layoutManager2 = recyclerView.getLayoutManager();
                    layoutManager2.getClass();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    int size2 = leagueDetailsFragment.D().i.size() + leagueDetailsFragment.D().g.size();
                    lxa lxaVar2 = (lxa) leagueDetailsFragment.W.getValue();
                    linearLayoutManager.scrollToPositionWithOffset(size2 + (lxaVar2 != null ? leagueDetailsFragment.D().h.indexOf(lxaVar2) : 0), 0);
                    break;
                }
            case 8:
                int intValue2 = ((Integer) obj).intValue();
                kva H2 = leagueDetailsFragment.H();
                UniqueTournament uniqueTournament8 = leagueDetailsFragment.G().getUniqueTournament();
                int id5 = uniqueTournament8 != null ? uniqueTournament8.getId() : 0;
                Season l4 = leagueDetailsFragment.C().l();
                xw3.L(un0.z(H2), null, null, new fva(id5, l4 != null ? l4.getId() : 0, intValue2, null, H2), 3);
                break;
            case 9:
                TotrSharePayload totrSharePayload = (TotrSharePayload) obj;
                totrSharePayload.getClass();
                Context requireContext6 = leagueDetailsFragment.requireContext();
                requireContext6.getClass();
                TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet = new TeamOfTheRoundShareBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putParcelable("ARG_PAYLOAD", totrSharePayload);
                teamOfTheRoundShareBottomSheet.setArguments(bundle);
                if (requireContext6 instanceof csk) {
                    requireContext6 = ((csk) requireContext6).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext6 instanceof AppCompatActivity ? (AppCompatActivity) requireContext6 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(teamOfTheRoundShareBottomSheet, appCompatActivity, null, 3));
                }
                break;
            case 10:
                sza szaVar = (sza) obj;
                szaVar.getClass();
                kva H3 = leagueDetailsFragment.H();
                Integer F7 = o3a.F(leagueDetailsFragment.G());
                int intValue3 = F7 != null ? F7.intValue() : -1;
                String str4 = szaVar.b;
                H3.r = str4;
                xw3.L(un0.z(H3), null, null, new ok0(H3, intValue3, str4, (rq3) null, 26), 3);
                break;
            default:
                ((View) obj).getClass();
                krk krkVar5 = leagueDetailsFragment.l;
                krkVar5.getClass();
                n layoutManager3 = ((oo8) krkVar5).d.getLayoutManager();
                layoutManager3.getClass();
                ((LinearLayoutManager) layoutManager3).scrollToPosition(Math.max(0, leagueDetailsFragment.D().g.size()));
                break;
        }
        return Unit.a;
    }
}
