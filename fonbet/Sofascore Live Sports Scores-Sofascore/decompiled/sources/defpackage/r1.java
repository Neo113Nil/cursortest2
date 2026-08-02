package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.button.MaterialButton;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.EventTeamHeatmapResponse;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.DistinctEventSet;
import com.sofascore.model.newNetwork.MmaStatisticAction;
import com.sofascore.model.newNetwork.MmaStatisticArea;
import com.sofascore.model.newNetwork.MmaStatisticClass;
import com.sofascore.model.newNetwork.MmaStatisticValues;
import com.sofascore.model.newNetwork.TeamCareerStatisticsResponse;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.dialog.EventListBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.player.statistics.season.baseball.BaseballPlayerSeasonStatisticsFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    private final Object e(Object obj) {
        MmaStatisticAction issued;
        MmaStatisticArea time;
        MmaStatisticClass ground;
        MmaStatisticAction issued2;
        MmaStatisticArea time2;
        MmaStatisticClass ground2;
        MmaStatisticAction issued3;
        MmaStatisticArea time3;
        MmaStatisticClass ground3;
        MmaStatisticAction issued4;
        MmaStatisticArea time4;
        MmaStatisticClass ground4;
        MmaStatisticAction issued5;
        MmaStatisticArea time5;
        MmaStatisticClass distance;
        MmaStatisticAction issued6;
        MmaStatisticArea time6;
        MmaStatisticClass distance2;
        MmaStatisticAction issued7;
        MmaStatisticArea transitions;
        MmaStatisticClass total;
        MmaStatisticAction issued8;
        MmaStatisticArea transitions2;
        MmaStatisticClass total2;
        MmaStatisticAction issued9;
        MmaStatisticArea submissions;
        MmaStatisticClass total3;
        MmaStatisticAction issued10;
        MmaStatisticArea submissions2;
        MmaStatisticClass total4;
        MmaStatisticAction issued11;
        MmaStatisticArea submissions3;
        MmaStatisticClass total5;
        MmaStatisticAction issued12;
        MmaStatisticArea submissions4;
        MmaStatisticClass total6;
        MmaStatisticAction issued13;
        MmaStatisticArea takedowns;
        MmaStatisticClass total7;
        MmaStatisticAction issued14;
        MmaStatisticArea takedowns2;
        MmaStatisticClass total8;
        MmaStatisticAction issued15;
        MmaStatisticArea takedowns3;
        MmaStatisticClass total9;
        MmaStatisticAction issued16;
        MmaStatisticArea takedowns4;
        MmaStatisticClass total10;
        MmaStatisticAction issued17;
        MmaStatisticArea significantStrikes;
        MmaStatisticClass legs;
        MmaStatisticAction issued18;
        MmaStatisticArea significantStrikes2;
        MmaStatisticClass legs2;
        MmaStatisticAction issued19;
        MmaStatisticArea significantStrikes3;
        MmaStatisticClass body;
        MmaStatisticAction issued20;
        MmaStatisticArea significantStrikes4;
        MmaStatisticClass body2;
        MmaStatisticAction issued21;
        MmaStatisticArea significantStrikes5;
        MmaStatisticClass head;
        MmaStatisticAction issued22;
        MmaStatisticArea significantStrikes6;
        MmaStatisticClass head2;
        MmaStatisticAction issued23;
        MmaStatisticArea strikes;
        MmaStatisticClass total11;
        MmaStatisticAction issued24;
        MmaStatisticArea significantStrikes7;
        MmaStatisticClass total12;
        MmaStatisticAction issued25;
        MmaStatisticArea strikes2;
        MmaStatisticClass total13;
        MmaStatisticAction issued26;
        MmaStatisticArea significantStrikes8;
        MmaStatisticClass total14;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        TeamCareerStatisticsResponse teamCareerStatisticsResponse = (TeamCareerStatisticsResponse) this.s;
        TeamCareerStatisticsResponse teamCareerStatisticsResponse2 = (TeamCareerStatisticsResponse) this.t;
        zqc zqcVar = zqc.CAREER;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        MmaStatisticValues landed = (teamCareerStatisticsResponse == null || (issued26 = teamCareerStatisticsResponse.getIssued()) == null || (significantStrikes8 = issued26.getSignificantStrikes()) == null || (total14 = significantStrikes8.getTotal()) == null) ? null : total14.getLanded();
        MmaStatisticValues landed2 = (teamCareerStatisticsResponse == null || (issued25 = teamCareerStatisticsResponse.getIssued()) == null || (strikes2 = issued25.getStrikes()) == null || (total13 = strikes2.getTotal()) == null) ? null : total13.getLanded();
        MmaStatisticValues landed3 = (teamCareerStatisticsResponse2 == null || (issued24 = teamCareerStatisticsResponse2.getIssued()) == null || (significantStrikes7 = issued24.getSignificantStrikes()) == null || (total12 = significantStrikes7.getTotal()) == null) ? null : total12.getLanded();
        MmaStatisticValues landed4 = (teamCareerStatisticsResponse2 == null || (issued23 = teamCareerStatisticsResponse2.getIssued()) == null || (strikes = issued23.getStrikes()) == null || (total11 = strikes.getTotal()) == null) ? null : total11.getLanded();
        brc brcVar = brc.a;
        arrayList3.add(ccd.p("landed_all_strikes", brcVar, landed != null ? landed.getRoundPct() : null, landed != null ? landed.getRoundAvg() : null, landed2 != null ? landed2.getRoundAvg() : null, landed3 != null ? landed3.getRoundPct() : null, landed3 != null ? landed3.getRoundAvg() : null, landed4 != null ? landed4.getRoundAvg() : null, 65280));
        arrayList2.add(new src("significant_strikes_average", arrayList3));
        ArrayList arrayList4 = new ArrayList();
        MmaStatisticValues landed5 = (teamCareerStatisticsResponse == null || (issued22 = teamCareerStatisticsResponse.getIssued()) == null || (significantStrikes6 = issued22.getSignificantStrikes()) == null || (head2 = significantStrikes6.getHead()) == null) ? null : head2.getLanded();
        MmaStatisticValues landed6 = (teamCareerStatisticsResponse2 == null || (issued21 = teamCareerStatisticsResponse2.getIssued()) == null || (significantStrikes5 = issued21.getSignificantStrikes()) == null || (head = significantStrikes5.getHead()) == null) ? null : head.getLanded();
        arrayList4.add(ccd.p("head", brc.e, landed5 != null ? landed5.getRoundPct() : null, landed5 != null ? landed5.getRoundAvg() : null, landed != null ? landed.getRoundAvg() : null, landed6 != null ? landed6.getRoundPct() : null, landed6 != null ? landed6.getRoundAvg() : null, landed3 != null ? landed3.getRoundAvg() : null, 65280));
        MmaStatisticValues landed7 = (teamCareerStatisticsResponse == null || (issued20 = teamCareerStatisticsResponse.getIssued()) == null || (significantStrikes4 = issued20.getSignificantStrikes()) == null || (body2 = significantStrikes4.getBody()) == null) ? null : body2.getLanded();
        MmaStatisticValues landed8 = (teamCareerStatisticsResponse2 == null || (issued19 = teamCareerStatisticsResponse2.getIssued()) == null || (significantStrikes3 = issued19.getSignificantStrikes()) == null || (body = significantStrikes3.getBody()) == null) ? null : body.getLanded();
        arrayList4.add(ccd.p("body", brc.f, landed7 != null ? landed7.getRoundPct() : null, landed7 != null ? landed7.getRoundAvg() : null, landed5 != null ? landed5.getRoundAvg() : null, landed8 != null ? landed8.getRoundPct() : null, landed8 != null ? landed8.getRoundAvg() : null, landed6 != null ? landed6.getRoundAvg() : null, 65280));
        MmaStatisticValues landed9 = (teamCareerStatisticsResponse == null || (issued18 = teamCareerStatisticsResponse.getIssued()) == null || (significantStrikes2 = issued18.getSignificantStrikes()) == null || (legs2 = significantStrikes2.getLegs()) == null) ? null : legs2.getLanded();
        MmaStatisticValues landed10 = (teamCareerStatisticsResponse2 == null || (issued17 = teamCareerStatisticsResponse2.getIssued()) == null || (significantStrikes = issued17.getSignificantStrikes()) == null || (legs = significantStrikes.getLegs()) == null) ? null : legs.getLanded();
        arrayList4.add(ccd.p("legs", brc.g, landed9 != null ? landed9.getRoundPct() : null, landed9 != null ? landed9.getRoundAvg() : null, landed5 != null ? landed5.getRoundAvg() : null, landed10 != null ? landed10.getRoundPct() : null, landed10 != null ? landed10.getRoundAvg() : null, landed6 != null ? landed6.getRoundAvg() : null, 65280));
        arrayList2.add(new src("significant_strikes_landed_by_zones", arrayList4));
        arrayList.add(new trc("striking_per_round", arrayList2));
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        MmaStatisticValues succeeded = (teamCareerStatisticsResponse == null || (issued16 = teamCareerStatisticsResponse.getIssued()) == null || (takedowns4 = issued16.getTakedowns()) == null || (total10 = takedowns4.getTotal()) == null) ? null : total10.getSucceeded();
        MmaStatisticValues attempted = (teamCareerStatisticsResponse == null || (issued15 = teamCareerStatisticsResponse.getIssued()) == null || (takedowns3 = issued15.getTakedowns()) == null || (total9 = takedowns3.getTotal()) == null) ? null : total9.getAttempted();
        MmaStatisticValues succeeded2 = (teamCareerStatisticsResponse2 == null || (issued14 = teamCareerStatisticsResponse2.getIssued()) == null || (takedowns2 = issued14.getTakedowns()) == null || (total8 = takedowns2.getTotal()) == null) ? null : total8.getSucceeded();
        MmaStatisticValues attempted2 = (teamCareerStatisticsResponse2 == null || (issued13 = teamCareerStatisticsResponse2.getIssued()) == null || (takedowns = issued13.getTakedowns()) == null || (total7 = takedowns.getTotal()) == null) ? null : total7.getAttempted();
        arrayList6.add(ccd.p("success_attempted", brcVar, succeeded != null ? succeeded.getPct15min() : null, succeeded != null ? succeeded.getAvg15min() : null, attempted != null ? attempted.getAvg15min() : null, succeeded2 != null ? succeeded2.getPct15min() : null, succeeded2 != null ? succeeded2.getAvg15min() : null, attempted2 != null ? attempted2.getAvg15min() : null, 65280));
        arrayList5.add(new src("takedowns_average", arrayList6));
        ArrayList arrayList7 = new ArrayList();
        MmaStatisticValues succeeded3 = (teamCareerStatisticsResponse == null || (issued12 = teamCareerStatisticsResponse.getIssued()) == null || (submissions4 = issued12.getSubmissions()) == null || (total6 = submissions4.getTotal()) == null) ? null : total6.getSucceeded();
        MmaStatisticValues attempted3 = (teamCareerStatisticsResponse == null || (issued11 = teamCareerStatisticsResponse.getIssued()) == null || (submissions3 = issued11.getSubmissions()) == null || (total5 = submissions3.getTotal()) == null) ? null : total5.getAttempted();
        MmaStatisticValues succeeded4 = (teamCareerStatisticsResponse2 == null || (issued10 = teamCareerStatisticsResponse2.getIssued()) == null || (submissions2 = issued10.getSubmissions()) == null || (total4 = submissions2.getTotal()) == null) ? null : total4.getSucceeded();
        MmaStatisticValues attempted4 = (teamCareerStatisticsResponse2 == null || (issued9 = teamCareerStatisticsResponse2.getIssued()) == null || (submissions = issued9.getSubmissions()) == null || (total3 = submissions.getTotal()) == null) ? null : total3.getAttempted();
        arrayList7.add(ccd.p("success_attempted", brcVar, succeeded3 != null ? succeeded3.getOverallPct() : null, succeeded3 != null ? succeeded3.getAvg15min() : null, attempted3 != null ? attempted3.getAvg15min() : null, succeeded4 != null ? succeeded4.getOverallPct() : null, succeeded4 != null ? succeeded4.getAvg15min() : null, attempted4 != null ? attempted4.getAvg15min() : null, 65280));
        arrayList5.add(new src("submissions_average", arrayList7));
        ArrayList arrayList8 = new ArrayList();
        MmaStatisticValues succeeded5 = (teamCareerStatisticsResponse == null || (issued8 = teamCareerStatisticsResponse.getIssued()) == null || (transitions2 = issued8.getTransitions()) == null || (total2 = transitions2.getTotal()) == null) ? null : total2.getSucceeded();
        MmaStatisticValues succeeded6 = (teamCareerStatisticsResponse2 == null || (issued7 = teamCareerStatisticsResponse2.getIssued()) == null || (transitions = issued7.getTransitions()) == null || (total = transitions.getTotal()) == null) ? null : total.getSucceeded();
        arrayList8.add(ccd.p("transitions_succeeded", brc.d, succeeded5 != null ? succeeded5.getAvg15min() : null, succeeded5 != null ? succeeded5.getAvg15min() : null, null, succeeded6 != null ? succeeded6.getAvg15min() : null, succeeded6 != null ? succeeded6.getAvg15min() : null, null, 65280));
        arrayList5.add(new src("transitions_succeeded", arrayList8, urc.c));
        arrayList.add(new trc("grappling_per_15_min", arrayList5));
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        MmaStatisticValues general = (teamCareerStatisticsResponse == null || (issued6 = teamCareerStatisticsResponse.getIssued()) == null || (time6 = issued6.getTime()) == null || (distance2 = time6.getDistance()) == null) ? null : distance2.getGeneral();
        MmaStatisticValues general2 = (teamCareerStatisticsResponse2 == null || (issued5 = teamCareerStatisticsResponse2.getIssued()) == null || (time5 = issued5.getTime()) == null || (distance = time5.getDistance()) == null) ? null : distance.getGeneral();
        brc brcVar2 = brc.b;
        arrayList10.add(ccd.p("distance", brcVar2, general != null ? general.getRoundPct() : null, general != null ? general.getRoundAvg() : null, null, general2 != null ? general2.getRoundPct() : null, general2 != null ? general2.getRoundAvg() : null, null, 32512));
        MmaStatisticValues general3 = (teamCareerStatisticsResponse == null || (issued4 = teamCareerStatisticsResponse.getIssued()) == null || (time4 = issued4.getTime()) == null || (ground4 = time4.getGround()) == null) ? null : ground4.getGeneral();
        MmaStatisticValues general4 = (teamCareerStatisticsResponse2 == null || (issued3 = teamCareerStatisticsResponse2.getIssued()) == null || (time3 = issued3.getTime()) == null || (ground3 = time3.getGround()) == null) ? null : ground3.getGeneral();
        arrayList10.add(ccd.p("ground", brcVar2, general3 != null ? general3.getRoundPct() : null, general3 != null ? general3.getRoundAvg() : null, null, general4 != null ? general4.getRoundPct() : null, general4 != null ? general4.getRoundAvg() : null, null, 32512));
        arrayList9.add(new src("average_time_in_position_per_round", arrayList10));
        ArrayList arrayList11 = new ArrayList();
        MmaStatisticValues control = (teamCareerStatisticsResponse == null || (issued2 = teamCareerStatisticsResponse.getIssued()) == null || (time2 = issued2.getTime()) == null || (ground2 = time2.getGround()) == null) ? null : ground2.getControl();
        MmaStatisticValues control2 = (teamCareerStatisticsResponse2 == null || (issued = teamCareerStatisticsResponse2.getIssued()) == null || (time = issued.getTime()) == null || (ground = time.getGround()) == null) ? null : ground.getControl();
        arrayList11.add(ccd.p("ground", brcVar2, control != null ? control.getOverallPct() : null, control != null ? control.getOverall() : null, general3 != null ? general3.getOverall() : null, control2 != null ? control2.getOverallPct() : null, control2 != null ? control2.getOverall() : null, general4 != null ? general4.getOverall() : null, 32512));
        arrayList9.add(new src("control_in_position_overall", arrayList11));
        arrayList.add(new trc("position_statistics", arrayList9));
        return sub.d(new Pair(zqcVar, arrayList));
    }

    private final Object f(Object obj) {
        gy6 gy6Var = (gy6) this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) this.t;
        gy6 gy6Var2 = gy6.a;
        fantasyCompetitionFixturesFragment.e = gy6Var == gy6Var2;
        krk krkVar = fantasyCompetitionFixturesFragment.l;
        krkVar.getClass();
        ((r68) krkVar).f.setEnabled(gy6Var == gy6Var2);
        MenuItem menuItem = fantasyCompetitionFixturesFragment.x;
        if (menuItem != null) {
            menuItem.setVisible(gy6Var == gy6.b);
        }
        int ordinal = gy6Var.ordinal();
        if (ordinal == 0) {
            krk krkVar2 = fantasyCompetitionFixturesFragment.l;
            krkVar2.getClass();
            tgj.G(((r68) krkVar2).b, 150L, 2);
            krk krkVar3 = fantasyCompetitionFixturesFragment.l;
            krkVar3.getClass();
            tgj.E(((r68) krkVar3).e, 150L, null, 14);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return null;
            }
            krk krkVar4 = fantasyCompetitionFixturesFragment.l;
            krkVar4.getClass();
            tgj.G(((r68) krkVar4).e, 150L, 2);
            krk krkVar5 = fantasyCompetitionFixturesFragment.l;
            krkVar5.getClass();
            tgj.E(((r68) krkVar5).b, 150L, null, 14);
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        gv9 gv9Var = (gv9) this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        MenuItem menuItem = ((FantasyCompetitionMyTeamFragment) this.t).v;
        if (menuItem != null) {
            menuItem.setVisible(true ^ (gv9Var == null || gv9Var.isEmpty()));
        }
        return Unit.a;
    }

    private final Object h(Object obj) {
        FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        e37 e37Var = (e37) this.t;
        return c6o.P(fantasyUserLeague, new Integer(e37Var.getK().n), e37Var.getK().m);
    }

    private final Object j(Object obj) {
        bnh bnhVar = (bnh) this.s;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        int i = ze3.C;
        FantasyLeagueActivity fantasyLeagueActivity = (FantasyLeagueActivity) this.t;
        int i2 = FantasyLeagueActivity.N;
        CoordinatorLayout coordinatorLayout = fantasyLeagueActivity.Q().e;
        coordinatorLayout.getClass();
        ze3 I = fkf.I(fantasyLeagueActivity, coordinatorLayout, bnhVar);
        if (I != null) {
            I.i();
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                r1 r1Var = new r1((AbstractChatFragment) obj2, rq3Var, 0);
                r1Var.s = obj;
                return r1Var;
            case 1:
                return new r1((k6e) this.s, (pk0) obj2, rq3Var, 1);
            case 2:
                r1 r1Var2 = new r1((w41) obj2, rq3Var, 2);
                r1Var2.s = obj;
                return r1Var2;
            case 3:
                return new r1((BaseModalBottomSheetDialog) this.s, (AppCompatActivity) obj2, rq3Var, 3);
            case 4:
                r1 r1Var3 = new r1((BaseballPlayerSeasonStatisticsFragment) obj2, rq3Var, 4);
                r1Var3.s = obj;
                return r1Var3;
            case 5:
                return new r1((Context) this.s, (fsf) obj2, rq3Var, 5);
            case 6:
                r1 r1Var4 = new r1((ChatActivity) obj2, rq3Var, 6);
                r1Var4.s = obj;
                return r1Var4;
            case 7:
                r1 r1Var5 = new r1((ChronologicalMatchesFragment) obj2, rq3Var, 7);
                r1Var5.s = obj;
                return r1Var5;
            case 8:
                r1 r1Var6 = new r1((CommentsChatFragment) obj2, rq3Var, 8);
                r1Var6.s = obj;
                return r1Var6;
            case 9:
                r1 r1Var7 = new r1((p63) obj2, rq3Var, 9);
                r1Var7.s = obj;
                return r1Var7;
            case 10:
                r1 r1Var8 = new r1((la3) obj2, rq3Var, 10);
                r1Var8.s = obj;
                return r1Var8;
            case 11:
                return new r1((Callable) this.s, (lj2) obj2, rq3Var, 11);
            case 12:
                r1 r1Var9 = new r1((w84) obj2, rq3Var, 12);
                r1Var9.s = obj;
                return r1Var9;
            case 13:
                return new r1((fa4) this.s, (String) obj2, rq3Var, 13);
            case 14:
                r1 r1Var10 = new r1((adi) obj2, rq3Var, 14);
                r1Var10.s = obj;
                return r1Var10;
            case 15:
                r1 r1Var11 = new r1((DateMatchesFragment) obj2, rq3Var, 15);
                r1Var11.s = obj;
                return r1Var11;
            case 16:
                return new r1((CategoriesForDateResponse) this.s, (String) obj2, rq3Var, 16);
            case 17:
                return new r1((List) this.s, (Map) obj2, rq3Var, 17);
            case 18:
                return new r1((ai4) this.s, (List) obj2, rq3Var, 18);
            case 19:
                r1 r1Var12 = new r1((EventActivity) obj2, rq3Var, 19);
                r1Var12.s = obj;
                return r1Var12;
            case 20:
                r1 r1Var13 = new r1((EventDetailsFragment) obj2, rq3Var, 20);
                r1Var13.s = obj;
                return r1Var13;
            case 21:
                r1 r1Var14 = new r1((EventListBottomSheet) obj2, rq3Var, 21);
                r1Var14.s = obj;
                return r1Var14;
            case 22:
                r1 r1Var15 = new r1((EventMatchesFragment) obj2, rq3Var, 22);
                r1Var15.s = obj;
                return r1Var15;
            case 23:
                return new r1((TeamCareerStatisticsResponse) this.s, (TeamCareerStatisticsResponse) obj2, rq3Var, 23);
            case 24:
                return new r1((v2g) this.s, (v2g) obj2, rq3Var, 24);
            case 25:
                r1 r1Var16 = new r1((FantasyCompetitionFixturesFragment) obj2, rq3Var, 25);
                r1Var16.s = obj;
                return r1Var16;
            case 26:
                r1 r1Var17 = new r1((FantasyCompetitionMyTeamFragment) obj2, rq3Var, 26);
                r1Var17.s = obj;
                return r1Var17;
            case 27:
                r1 r1Var18 = new r1((e37) obj2, rq3Var, 27);
                r1Var18.s = obj;
                return r1Var18;
            case 28:
                r1 r1Var19 = new r1((FantasyLeagueActivity) obj2, rq3Var, 28);
                r1Var19.s = obj;
                return r1Var19;
            default:
                return new r1((pb7) this.s, (e1d) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((r1) create((mq2) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((r1) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((r1) create((mle) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((r1) create((vnb) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((r1) create((du2) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((r1) create((String) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((r1) create(obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((r1) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((r1) create((adi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((r1) create((hh4) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((r1) create((FavoritesEventsData) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((r1) create((vnb) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((r1) create((List) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((r1) create((vnb) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((r1) create((gy6) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((r1) create((gv9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((r1) create((FantasyUserLeague) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((r1) create((bnh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((r1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        am1 am1Var;
        Object obj2;
        gv9 gv9Var;
        Object obj3;
        fgf fgfVar;
        Object s83Var;
        String name;
        Object value;
        ha3 ha3Var;
        y93 y93Var;
        ja4 c;
        ddd dddVar;
        Object u2gVar;
        MaterialButton buttonLarge;
        MaterialButton buttonLarge2;
        iy5 iy5Var;
        gv9 gv9Var2;
        gv9 gv9Var3;
        int i = this.r;
        ?? r7 = 0;
        String str = null;
        r7 = null;
        Boolean bool = null;
        int i2 = 0;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                mq2 mq2Var = (mq2) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                String str2 = mq2Var.a;
                Set set = mq2Var.b;
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) obj4;
                fhc F = abstractChatFragment.F();
                F.q = str2;
                F.r = set;
                F.notifyItemRangeChanged(0, F.getItemCount());
                krk krkVar = abstractChatFragment.l;
                krkVar.getClass();
                ((yn8) krkVar).f.r(str2);
                krk krkVar2 = abstractChatFragment.l;
                krkVar2.getClass();
                ChatMessageInputView chatMessageInputView = ((yn8) krkVar2).f;
                js2 js2Var = chatMessageInputView.d;
                ((ImageView) js2Var.g).setVisibility(0);
                chatMessageInputView.j((ImageView) js2Var.g);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                k6e k6eVar = (k6e) this.s;
                f5e f5eVar = k6eVar.i;
                f5e f5eVar2 = k6eVar.h;
                j25 j25Var = ((pk0) obj4).a;
                f5eVar.getClass();
                i25 v = j72.v(new whe(f5eVar, f5eVar2, j25Var, f5eVar.b, f5eVar2.b));
                Iterable j = llf.j(0, f5eVar.b);
                if (!(j instanceof Collection) || !((Collection) j).isEmpty()) {
                    v6a it = j.iterator();
                    while (it.c) {
                        if (v.a(it.nextInt()) != -1) {
                            return new vhe(v, r6);
                        }
                    }
                }
                r6 = false;
                return new vhe(v, r6);
            case 2:
                List list = (List) this.s;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ((w41) obj4).n(new zbc(), new r41(list, i2));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                BaseModalBottomSheetDialog baseModalBottomSheetDialog = (BaseModalBottomSheetDialog) this.s;
                baseModalBottomSheetDialog.p(((AppCompatActivity) obj4).k(), baseModalBottomSheetDialog.getTag());
                return Unit.a;
            case 4:
                mle mleVar = (mle) this.s;
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                String str3 = mleVar.b;
                String str4 = mleVar.c;
                String str5 = mleVar.d;
                qk1 qk1Var = (qk1) ((BaseballPlayerSeasonStatisticsFragment) obj4).s.getValue();
                str3.getClass();
                str4.getClass();
                fk1 fk1Var = (fk1) qk1Var.l().a();
                if (fk1Var == null || (gv9Var = fk1Var.a) == null) {
                    am1Var = null;
                } else {
                    Iterator it2 = gv9Var.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (Intrinsics.c(((am1) obj3).c, str3)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    am1Var = (am1) obj3;
                }
                if (am1Var != null) {
                    int i3 = am1Var.a;
                    Iterator it3 = Season.SubSeasonType.getEntries().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (Intrinsics.c(((Season.SubSeasonType) obj2).getLabel(), str4)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj2;
                    Iterator it4 = wj1.f.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (Intrinsics.c(((wj1) next).name(), str5)) {
                                r7 = next;
                            }
                        }
                    }
                    qk1Var.u(new ca1(i3, subSeasonType, (wj1) r7));
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                Toast.makeText((Context) this.s, (CharSequence) ((fsf) obj4).a, 0).show();
                return Unit.a;
            case 6:
                vnb vnbVar = (vnb) this.s;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                ChatActivity chatActivity = (ChatActivity) obj4;
                int i4 = ChatActivity.Z;
                LinearLayout linearLayout = chatActivity.R().g;
                if (vnbVar instanceof unb) {
                    xmd xmdVar = (xmd) ((unb) vnbVar).a;
                    ((FeaturedOddsView) chatActivity.V.getValue()).n(xmdVar);
                    gv9 gv9Var4 = xmdVar.a;
                    and andVar = (and) CollectionsKt.firstOrNull(gv9Var4);
                    if (andVar != null && (fgfVar = andVar.b) != null) {
                        bool = Boolean.valueOf(fgfVar.d);
                    }
                    chatActivity.T = Intrinsics.c(bool, Boolean.TRUE);
                    if (gv9Var4.size() != 1 || !chatActivity.Q()) {
                        chatActivity.Y(linearLayout);
                    } else if (chatActivity.S().k == mf.a) {
                        chatActivity.U(linearLayout);
                    }
                } else if ((vnbVar instanceof snb) && chatActivity.S().k != mf.a) {
                    chatActivity.Y(linearLayout);
                }
                return Unit.a;
            case 7:
                ChronologicalMatchesFragment chronologicalMatchesFragment = (ChronologicalMatchesFragment) obj4;
                du2 du2Var = (du2) this.s;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                boolean z = du2Var.a;
                Integer num = du2Var.b;
                List list2 = du2Var.c;
                if (!z) {
                    return Unit.a;
                }
                krk krkVar3 = chronologicalMatchesFragment.l;
                krkVar3.getClass();
                tgj.a0(((zn8) krkVar3).d);
                boolean isEmpty = list2.isEmpty();
                krk krkVar4 = chronologicalMatchesFragment.l;
                if (isEmpty) {
                    krkVar4.getClass();
                    tgj.a0(((zn8) krkVar4).d);
                    chronologicalMatchesFragment.C().F(km5.a);
                    krk krkVar5 = chronologicalMatchesFragment.l;
                    krkVar5.getClass();
                    tgj.Z(((zn8) krkVar5).c);
                } else {
                    krkVar4.getClass();
                    tgj.a0(((zn8) krkVar4).c);
                    if (!chronologicalMatchesFragment.v) {
                        Calendar calendar = ke0.a;
                        Context requireContext = chronologicalMatchesFragment.requireContext();
                        requireContext.getClass();
                        chronologicalMatchesFragment.C().K(chronologicalMatchesFragment, wv8.o(SearchResponseKt.SPORT_ENTITY, ke0.b(requireContext)), false);
                    }
                    chronologicalMatchesFragment.C().N((num != null ? num.intValue() : 0) + 13);
                    wt2 C = chronologicalMatchesFragment.C();
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        o13.v(((fu2) it5.next()).b, arrayList);
                    }
                    C.F(arrayList);
                    lu2 D = chronologicalMatchesFragment.D();
                    Integer num2 = du2Var.d;
                    Integer num3 = du2Var.e;
                    Integer num4 = D.d;
                    if (num4 != null) {
                        int intValue = num4.intValue();
                        if (num2 == null || num2.intValue() < intValue) {
                            D.d = num2;
                        }
                    }
                    Integer num5 = D.e;
                    if (num5 != null) {
                        int intValue2 = num5.intValue();
                        if (num3 == null || num3.intValue() > intValue2) {
                            D.e = num3;
                        }
                    }
                    D.c = D.d != null;
                    D.b = D.e != null;
                    if (chronologicalMatchesFragment.D().c) {
                        wt2 C2 = chronologicalMatchesFragment.C();
                        C2.i.add(0, q6e.a);
                        C2.notifyItemInserted(C2.g.size());
                    }
                    if (chronologicalMatchesFragment.D().b) {
                        wt2 C3 = chronologicalMatchesFragment.C();
                        int itemCount = chronologicalMatchesFragment.C().getItemCount();
                        C3.i.add(itemCount, q6e.b);
                        C3.notifyItemInserted(C3.g.size() + itemCount);
                    }
                    if (!chronologicalMatchesFragment.v) {
                        boolean z2 = chronologicalMatchesFragment.D().c;
                        krk krkVar6 = chronologicalMatchesFragment.l;
                        krkVar6.getClass();
                        RecyclerView recyclerView = ((zn8) krkVar6).b;
                        int intValue3 = num != null ? num.intValue() + (z2 ? 1 : 0) : 0;
                        n layoutManager = recyclerView.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null) {
                            linearLayoutManager.scrollToPositionWithOffset(intValue3, 0);
                        }
                    }
                    chronologicalMatchesFragment.v = true;
                }
                return Unit.a;
            case 8:
                String str6 = (String) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                CommentsChatFragment commentsChatFragment = (CommentsChatFragment) obj4;
                krk krkVar7 = commentsChatFragment.l;
                krkVar7.getClass();
                ((yn8) krkVar7).f.setChatFlag(str6);
                fhc F2 = commentsChatFragment.F();
                if (F2.t != null) {
                    F2.J().setChatFlag(str6);
                    F2.notifyDataSetChanged();
                }
                return Unit.a;
            case 9:
                p63 p63Var = (p63) obj4;
                Object obj5 = this.s;
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                if (obj5 instanceof IRecent) {
                    p63Var.h.put(new Integer(((IRecent) obj5).getId()), obj5);
                }
                Context context = p63Var.b;
                context.getClass();
                obj5.getClass();
                if (obj5.equals("recent")) {
                    String string = context.getString(R.string.recent);
                    string.getClass();
                    return new u83(string);
                }
                if (obj5.equals("suggestion")) {
                    String string2 = context.getString(R.string.suggested);
                    string2.getClass();
                    return new u83(string2);
                }
                if (obj5.equals(13)) {
                    return q83.a;
                }
                if (obj5 instanceof Player) {
                    Player player = (Player) obj5;
                    int id = player.getId();
                    String t = tba.t(player);
                    boolean isRecent = player.getIsRecent();
                    Team team = player.getTeam();
                    Integer valueOf = team != null ? Integer.valueOf(team.getId()) : null;
                    Team team2 = player.getTeam();
                    if (team2 != null) {
                        String p = tba.p(context, team2);
                        if (qea.y(team2) && team2.getSport() != null) {
                            Set set2 = wyh.a;
                            if (!wyh.e(team2.getSportSlug())) {
                                str = wv8.i(p, " ", context.getString(R.string.female_team));
                            }
                        }
                        str = p;
                    }
                    s83Var = new r83(id, valueOf, t, str, isRecent);
                } else {
                    if (!(obj5 instanceof Team)) {
                        return v83.a;
                    }
                    Team team3 = (Team) obj5;
                    Country country = team3.getCountry();
                    if (country == null || team3.getNational()) {
                        country = null;
                    }
                    int id2 = team3.getId();
                    String p2 = tba.p(context, team3);
                    if (qea.y(team3) && team3.getSport() != null) {
                        Set set3 = wyh.a;
                        if (!wyh.e(team3.getSportSlug())) {
                            p2 = wv8.i(p2, " ", context.getString(R.string.female_team));
                        }
                    }
                    s83Var = new s83(p2, (country == null || (name = country.getName()) == null) ? null : tv3.c(context, name), team3.getIsRecent(), id2, country != null ? country.getAlpha2() : null);
                }
                return s83Var;
            case 10:
                List list3 = (List) this.s;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                la3 la3Var = (la3) obj4;
                fdi fdiVar = la3Var.k;
                do {
                    value = fdiVar.getValue();
                    ha3Var = (ha3) value;
                    y93Var = ha3Var.b;
                } while (!fdiVar.k(value, ha3.a(ha3Var, y93Var != null ? new y93(y93Var.b, new ArrayList(list3), y93Var.d, y93Var.e) : new y93(new Category("Pinned", 0), new ArrayList(list3), qha.E(la3Var.i()), 0), null, 5)));
                return Unit.a;
            case 11:
                lj2 lj2Var = (lj2) obj4;
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                try {
                    Object call = ((Callable) this.s).call();
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(call);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    lj2Var.resumeWith(new u2g(th));
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.s;
                w84 w84Var = (w84) obj4;
                AtomicReference atomicReference = w84Var.b;
                g9i L = xw3.L(ku3Var, null, null, new hy1((yda) atomicReference.getAndSet(null), w84Var, r7, 28), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, L)) {
                        if (atomicReference.get() != null) {
                            r6 = false;
                        }
                    }
                }
                return Boolean.valueOf(r6);
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                fa4 fa4Var = (fa4) this.s;
                String str7 = (String) obj4;
                try {
                    try {
                        fa4Var.d();
                        if (str7 != null && (c = fa4Var.c(null)) != null) {
                            Uri parse = Uri.parse(str7);
                            parse.getClass();
                            ((bm9) c.b).S1(c.c, parse, c.a(null));
                        }
                    } catch (Throwable unused) {
                    }
                    return Unit.a;
                } catch (CancellationException e) {
                    throw e;
                }
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                adi adiVar = (adi) this.s;
                return Boolean.valueOf((adiVar instanceof od4) && ((od4) adiVar).a <= ((od4) ((adi) obj4)).a);
            case 15:
                DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) obj4;
                joa joaVar = dateMatchesFragment.x;
                hh4 hh4Var = (hh4) this.s;
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                boolean z3 = hh4Var.a;
                List list4 = hh4Var.d;
                List list5 = hh4Var.e;
                boolean z4 = hh4Var.b;
                if (!z3) {
                    return Unit.a;
                }
                String str8 = hh4Var.c;
                if (str8 != null && !z4) {
                    krk krkVar8 = dateMatchesFragment.l;
                    krkVar8.getClass();
                    tgj.a0(((do8) krkVar8).d);
                    krk krkVar9 = dateMatchesFragment.l;
                    krkVar9.getClass();
                    tgj.a0(((do8) krkVar9).b);
                    ddd dddVar2 = dateMatchesFragment.u;
                    if (dddVar2 == null) {
                        LayoutInflater layoutInflater = dateMatchesFragment.getLayoutInflater();
                        krk krkVar10 = dateMatchesFragment.l;
                        krkVar10.getClass();
                        View inflate = layoutInflater.inflate(R.layout.no_games_view, (ViewGroup) ((do8) krkVar10).c, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        GraphicLarge graphicLarge = (GraphicLarge) inflate;
                        ddd dddVar3 = new ddd(graphicLarge, i2);
                        r4.p(dateMatchesFragment.G().g.size(), graphicLarge);
                        dateMatchesFragment.u = dddVar3;
                        dddVar2 = dddVar3;
                    }
                    dddVar2.b.setVisibility(0);
                    if (dateMatchesFragment.v == null) {
                        int i5 = jx4.d;
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        if (rfo.L(requireContext2)) {
                            Context requireContext3 = dateMatchesFragment.requireContext();
                            requireContext3.getClass();
                            jx4 jx4Var = new jx4(requireContext3);
                            g7.o(dateMatchesFragment.E(), jx4Var, 6);
                            dateMatchesFragment.v = jx4Var;
                        }
                    }
                    if (zu3.V.hasMcc(Integer.valueOf(ke0.c)) && dateMatchesFragment.w == null) {
                        Context requireContext4 = dateMatchesFragment.requireContext();
                        requireContext4.getClass();
                        s9d s9dVar = new s9d(requireContext4);
                        g7.o(dateMatchesFragment.E(), s9dVar, 6);
                        dateMatchesFragment.w = s9dVar;
                    }
                    if (str8.length() == 0) {
                        ddd dddVar4 = dateMatchesFragment.u;
                        if (dddVar4 != null && (buttonLarge2 = dddVar4.b.getButtonLarge()) != null) {
                            buttonLarge2.setVisibility(8);
                        }
                    } else {
                        try {
                            p2g p2gVar3 = w2g.b;
                            u2gVar = dateMatchesFragment.H().i.parse(str8);
                        } catch (Throwable th2) {
                            p2g p2gVar4 = w2g.b;
                            u2gVar = new u2g(th2);
                        }
                        Date date = (Date) (u2gVar instanceof u2g ? null : u2gVar);
                        if (date != null) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(date);
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.setTimeInMillis(ke0.a.getTimeInMillis());
                            calendar3.set(1, calendar2.get(1));
                            calendar3.set(2, calendar2.get(2));
                            calendar3.set(5, calendar2.get(5));
                            ddd dddVar5 = dateMatchesFragment.u;
                            if (dddVar5 != null && (buttonLarge = dddVar5.b.getButtonLarge()) != null) {
                                buttonLarge.setVisibility(0);
                                buttonLarge.setOnClickListener(new cn(24, dateMatchesFragment, calendar3));
                            }
                        }
                    }
                } else if (list4.isEmpty() && list5.isEmpty() && z4) {
                    fdi fdiVar2 = dateMatchesFragment.F().s;
                    Boolean bool2 = Boolean.TRUE;
                    fdiVar2.getClass();
                    fdiVar2.m(null, bool2);
                    krk krkVar11 = dateMatchesFragment.l;
                    krkVar11.getClass();
                    tgj.a0(((do8) krkVar11).d);
                    ddd dddVar6 = dateMatchesFragment.u;
                    if (dddVar6 != null) {
                        dddVar6.b.setVisibility(8);
                    }
                    ehe G = dateMatchesFragment.G();
                    km5 km5Var = km5.a;
                    G.F(km5Var);
                    dateMatchesFragment.E().F(km5Var);
                    krk krkVar12 = dateMatchesFragment.l;
                    krkVar12.getClass();
                    GraphicLarge graphicLarge2 = ((do8) krkVar12).b;
                    String string3 = dateMatchesFragment.requireContext().getString(R.string.empty_no_events_header);
                    string3.getClass();
                    graphicLarge2.setTitleResource(string3);
                    String string4 = dateMatchesFragment.requireContext().getString(R.string.empty_no_events_filters_body_text);
                    string4.getClass();
                    graphicLarge2.setSubtitleResource(string4);
                    graphicLarge2.setLargeDrawableResource(Integer.valueOf(R.drawable.no_events_1));
                    tgj.Z(graphicLarge2);
                } else {
                    fdi fdiVar3 = dateMatchesFragment.F().s;
                    Boolean bool3 = Boolean.TRUE;
                    fdiVar3.getClass();
                    fdiVar3.m(null, bool3);
                    krk krkVar13 = dateMatchesFragment.l;
                    krkVar13.getClass();
                    tgj.a0(((do8) krkVar13).b);
                    krk krkVar14 = dateMatchesFragment.l;
                    krkVar14.getClass();
                    tgj.a0(((do8) krkVar14).d);
                    ia0 ia0Var = ia0.q;
                    if (mz1.C()) {
                        int size = list5.size();
                        if (size >= 0 && size < 2) {
                            gi6 E = dateMatchesFragment.E();
                            LinkedHashMap i6 = tub.i(new Pair(13, (AdBannerView) joaVar.getValue()));
                            E.getClass();
                            if (dateMatchesFragment.getActivity() != null) {
                                E.l = i6;
                            }
                        } else if (2 > size || size >= 14) {
                            ehe G2 = dateMatchesFragment.G();
                            LinkedHashMap i7 = tub.i(new Pair(13, (AdBannerView) joaVar.getValue()));
                            G2.getClass();
                            if (dateMatchesFragment.getActivity() != null) {
                                G2.l = i7;
                            }
                            gi6 E2 = dateMatchesFragment.E();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            E2.getClass();
                            if (dateMatchesFragment.getActivity() != null) {
                                E2.l = linkedHashMap;
                            }
                        } else {
                            gi6 E3 = dateMatchesFragment.E();
                            LinkedHashMap i8 = tub.i(new Pair(Integer.valueOf(13 - size), (AdBannerView) joaVar.getValue()));
                            E3.getClass();
                            if (dateMatchesFragment.getActivity() != null) {
                                E3.l = i8;
                            }
                        }
                    }
                    dateMatchesFragment.E().F(list4);
                    dateMatchesFragment.G().F(list5);
                    dateMatchesFragment.G().notifyItemChanged(dateMatchesFragment.G().getItemCount() - 1);
                    if (dateMatchesFragment.E().getItemCount() > 0 && (dddVar = dateMatchesFragment.u) != null) {
                        dateMatchesFragment.G().C(dddVar.b);
                    }
                    g6b lifecycle = dateMatchesFragment.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.b().compareTo(e6b.d) >= 0) {
                        krk krkVar15 = dateMatchesFragment.l;
                        krkVar15.getClass();
                        dateMatchesFragment.t(((do8) krkVar15).c, new oi(dateMatchesFragment, 4));
                    } else {
                        lifecycle.a(new dh4(lifecycle, dateMatchesFragment, i2));
                    }
                    if (z4 && dateMatchesFragment.G().getItemCount() == 0) {
                        ArrayList arrayList2 = dateMatchesFragment.E().i;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            if (next2 instanceof ci6) {
                                arrayList3.add(next2);
                            }
                        }
                        ci6 ci6Var = (ci6) CollectionsKt.firstOrNull(arrayList3);
                        if (ci6Var != null) {
                            ci6Var.d = true;
                            dateMatchesFragment.D(ci6Var, false);
                        }
                    }
                    if (dateMatchesFragment.H().s) {
                        dateMatchesFragment.H().s = false;
                        krk krkVar16 = dateMatchesFragment.l;
                        krkVar16.getClass();
                        wca.I(((do8) krkVar16).c, 0);
                    }
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) this.s;
                List<CategoryWrapper> categories = categoriesForDateResponse != null ? categoriesForDateResponse.getCategories() : null;
                if (categories == null) {
                    categories = km5.a;
                }
                String str9 = (String) obj4;
                ArrayList arrayList4 = new ArrayList();
                for (CategoryWrapper categoryWrapper : categories) {
                    DistinctEventSet y = i2a.y(categoryWrapper, str9);
                    Pair pair = y != null ? new Pair(y, categoryWrapper) : null;
                    if (pair != null) {
                        arrayList4.add(pair);
                    }
                }
                ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(j72.E((CategoryWrapper) ((Pair) it7.next()).b));
                }
                int c2 = sub.c(k13.r(arrayList4, 10));
                if (c2 < 16) {
                    c2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2);
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    Pair pair2 = (Pair) it8.next();
                    linkedHashMap2.put(new Integer(((CategoryWrapper) pair2.b).getCategory().getId()), CollectionsKt.W0(((DistinctEventSet) pair2.a).getEventIds()));
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    List<Integer> uniqueTournamentIds = ((Category) it9.next()).getUniqueTournamentIds();
                    if (uniqueTournamentIds == null) {
                        uniqueTournamentIds = km5.a;
                    }
                    o13.v(uniqueTournamentIds, arrayList6);
                }
                return new jh4(arrayList5, linkedHashMap2, CollectionsKt.W0(arrayList6));
            case 17:
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                List list6 = (List) this.s;
                ArrayList arrayList7 = new ArrayList(k13.r(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    arrayList7.add(j72.E((CategoryWrapper) it10.next()));
                }
                Map map = (Map) obj4;
                Iterator it11 = arrayList7.iterator();
                while (it11.hasNext()) {
                    Category category = (Category) it11.next();
                    Integer num6 = (Integer) map.get(String.valueOf(category.getId()));
                    category.setLiveEvents(num6 != null ? num6.intValue() : 0);
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                ArrayList arrayList8 = new ArrayList();
                Iterator it12 = arrayList7.iterator();
                while (it12.hasNext()) {
                    List<Integer> uniqueTournamentIds2 = ((Category) it12.next()).getUniqueTournamentIds();
                    if (uniqueTournamentIds2 == null) {
                        uniqueTournamentIds2 = km5.a;
                    }
                    o13.v(uniqueTournamentIds2, arrayList8);
                }
                return new jh4(arrayList7, lm5Var, CollectionsKt.W0(arrayList8));
            case 18:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                ArrayList y2 = ((ai4) this.s).y((List) obj4);
                ArrayList arrayList9 = new ArrayList(k13.r(y2, 10));
                Iterator it13 = y2.iterator();
                while (true) {
                    int i9 = i2;
                    if (!it13.hasNext()) {
                        return arrayList9;
                    }
                    Object next3 = it13.next();
                    i2 = i9 + 1;
                    if (i9 < 0) {
                        b.q();
                        throw null;
                    }
                    arrayList9.add(new ci6((Category) next3, new ArrayList(), false, i9, 0));
                }
            case 19:
                EventActivity eventActivity = (EventActivity) obj4;
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) this.s;
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                if (favoritesEventsData != null) {
                    FollowActionButton followActionButton = eventActivity.Y;
                    if (followActionButton != null) {
                        followActionButton.f(favoritesEventsData);
                    }
                    NotificationsActionButton notificationsActionButton = eventActivity.W;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.f(favoritesEventsData);
                    }
                    s21 s21Var = eventActivity.b0;
                    if (s21Var != null) {
                        FollowActionButton followButtonFirstTeam = s21Var.getFollowButtonFirstTeam();
                        if (followButtonFirstTeam != null) {
                            followButtonFirstTeam.f(favoritesEventsData);
                        }
                        FollowActionButton followButtonSecondTeam = s21Var.getFollowButtonSecondTeam();
                        if (followButtonSecondTeam != null) {
                            followButtonSecondTeam.f(favoritesEventsData);
                        }
                    }
                }
                return Unit.a;
            case 20:
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj4;
                vnb vnbVar2 = (vnb) this.s;
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                if (vnbVar2 instanceof unb) {
                    FeaturedOddsView featuredOddsView = (FeaturedOddsView) eventDetailsFragment.q0.getValue();
                    if (featuredOddsView != null) {
                        featuredOddsView.n((xmd) ((unb) vnbVar2).a);
                    }
                    GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) eventDetailsFragment.n0.getValue();
                    if (gambleRegulationFooterView != null) {
                        gambleRegulationFooterView.setVisibility(((xmd) ((unb) vnbVar2).a).a.isEmpty() ? 8 : 0);
                    }
                }
                if (!(vnbVar2 instanceof tnb) && (iy5Var = (iy5) eventDetailsFragment.E().x.d()) != null) {
                    eventDetailsFragment.U(iy5Var.t);
                }
                return Unit.a;
            case 21:
                List list7 = (List) this.s;
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                boolean isEmpty2 = list7.isEmpty();
                EventListBottomSheet eventListBottomSheet = (EventListBottomSheet) obj4;
                joa joaVar2 = eventListBottomSheet.G;
                if (isEmpty2) {
                    r14.p(((qzh) joaVar2.getValue()).g.size(), (GraphicLarge) eventListBottomSheet.H.getValue());
                } else {
                    ((qzh) joaVar2.getValue()).F(list7);
                }
                return Unit.a;
            case 22:
                EventMatchesFragment eventMatchesFragment = (EventMatchesFragment) obj4;
                vnb vnbVar3 = (vnb) this.s;
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                if (vnbVar3 instanceof unb) {
                    n2j n2jVar = (n2j) ((unb) vnbVar3).a;
                    xmd xmdVar2 = n2jVar.a;
                    xmd xmdVar3 = n2jVar.b;
                    if (xmdVar2 != null) {
                        ((hgi) eventMatchesFragment.F.getValue()).setOdds(xmdVar2);
                    }
                    if (xmdVar3 != null) {
                        ((hgi) eventMatchesFragment.G.getValue()).setOdds(xmdVar3);
                    }
                    xmd xmdVar4 = n2jVar.a;
                    if ((xmdVar4 != null && (gv9Var3 = xmdVar4.a) != null && (!gv9Var3.isEmpty())) || (xmdVar3 != null && (gv9Var2 = xmdVar3.a) != null && (!gv9Var2.isEmpty()))) {
                        EventMatchesFragment.G(eventMatchesFragment, n2jVar.c, 2);
                    }
                }
                return Unit.a;
            case 23:
                return e(obj);
            case 24:
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                Object obj6 = ((v2g) this.s).a;
                List<Point2D> playerPoints = ((EventTeamHeatmapResponse) obj6).getPlayerPoints();
                List<Point2D> goalkeeperPoints = ((EventTeamHeatmapResponse) obj6).getGoalkeeperPoints();
                Object obj7 = ((v2g) obj4).a;
                return new gc6(playerPoints, goalkeeperPoints, ((EventTeamHeatmapResponse) obj7).getPlayerPoints(), ((EventTeamHeatmapResponse) obj7).getGoalkeeperPoints());
            case 25:
                return f(obj);
            case 26:
                return g(obj);
            case 27:
                return h(obj);
            case 28:
                return j(obj);
            default:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                FantasyRemoteAnnouncement fantasyRemoteAnnouncement = ((pb7) this.s).w;
                if (fantasyRemoteAnnouncement != null) {
                    ((e1d) obj4).setValue(fantasyRemoteAnnouncement);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
