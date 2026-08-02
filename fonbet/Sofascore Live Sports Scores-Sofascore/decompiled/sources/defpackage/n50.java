package defpackage;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import com.sofascore.model.DateSection;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.ManagerEventsResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballRankedStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FutsalTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.RankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.team.RugbyTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.results.R;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n50 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n50(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context requireContext = ((ManagerEventsFragment) this.s).requireContext();
        requireContext.getClass();
        vsb vsbVar = (vsb) this.t;
        ManagerEventsResponse managerEventsResponse = (ManagerEventsResponse) yaa.x(vsbVar.b);
        if (managerEventsResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(managerEventsResponse.getManagedTeamMap());
        List list = vsbVar.a;
        if (list == null || list.isEmpty()) {
            ArrayList u = mx9.u(requireContext, CollectionsKt.B0(managerEventsResponse.getEvents()), null, null, true, false, false, false, null, 7660);
            ArrayList arrayList = new ArrayList(k13.r(u, 10));
            Iterator it = u.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof y21) {
                    y21 y21Var = (y21) next;
                    int id = y21Var.d().getId();
                    PlayerEventIncidents playerEventIncidents = managerEventsResponse.getIncidentsMap().get(Integer.valueOf(id));
                    Integer num = (Integer) hashMap.get(Integer.valueOf(id));
                    y21Var.G = playerEventIncidents;
                    y21Var.L = num;
                }
                arrayList.add(next);
            }
            return arrayList;
        }
        ArrayList u2 = mx9.u(requireContext, CollectionsKt.B0(managerEventsResponse.getEvents()), vsbVar.a, null, true, true, false, false, null, 7624);
        ArrayList arrayList2 = new ArrayList(k13.r(u2, 10));
        Iterator it2 = u2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof y21) {
                y21 y21Var2 = (y21) next2;
                int id2 = y21Var2.d().getId();
                PlayerEventIncidents playerEventIncidents2 = managerEventsResponse.getIncidentsMap().get(Integer.valueOf(id2));
                Integer num2 = (Integer) hashMap.get(Integer.valueOf(id2));
                y21Var2.G = playerEventIncidents2;
                y21Var2.L = num2;
            }
            arrayList2.add(next2);
        }
        return arrayList2;
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) this.s;
        Context requireContext = playerEventsFragment.requireContext();
        requireContext.getClass();
        zse zseVar = (zse) this.t;
        zseVar.getClass();
        boolean z = playerEventsFragment.u;
        v8a v8aVar = playerEventsFragment.v;
        List list = zseVar.b;
        HashMap hashMap = zseVar.f;
        HashMap hashMap2 = zseVar.e;
        HashMap hashMap3 = zseVar.d;
        HashMap hashMap4 = zseVar.c;
        list.getClass();
        Collections.reverse(list);
        List list2 = zseVar.a;
        if (list2 == null || list2.isEmpty()) {
            ArrayList u = mx9.u(requireContext, list, null, new y16(hashMap4, hashMap3, hashMap2, hashMap), true, false, z, false, null, 3492);
            ArrayList arrayList = new ArrayList(k13.r(u, 10));
            Iterator it = u.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof y21) {
                    ((y21) next).I = v8aVar;
                }
                arrayList.add(next);
            }
            return arrayList;
        }
        ArrayList u2 = mx9.u(requireContext, list, zseVar.a, new y16(hashMap4, hashMap3, hashMap2, hashMap), true, z, z, false, null, 3456);
        ArrayList arrayList2 = new ArrayList(k13.r(u2, 10));
        Iterator it2 = u2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof y21) {
                ((y21) next2).I = v8aVar;
            }
            arrayList2.add(next2);
        }
        return arrayList2;
    }

    private final Object g(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) this.s;
        Context requireContext = playerEventsFragment.requireContext();
        requireContext.getClass();
        use useVar = (use) this.t;
        v8a v8aVar = playerEventsFragment.v;
        List list = useVar.a;
        x2g x2gVar = useVar.b;
        if (!(x2gVar instanceof v2g)) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            PlayerEventsListResponse playerEventsListResponse = (PlayerEventsListResponse) ((v2g) x2gVar).a;
            ArrayList u = mx9.u(requireContext, CollectionsKt.B0(playerEventsListResponse.getEvents()), null, new y16(playerEventsListResponse.getPlayedForTeamMap(), playerEventsListResponse.getIncidentsMap(), playerEventsListResponse.getStatisticsMap(), playerEventsListResponse.getOnBenchMap()), true, false, false, false, null, 3556);
            ArrayList arrayList = new ArrayList(k13.r(u, 10));
            Iterator it = u.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof y21) {
                    ((y21) next).I = v8aVar;
                }
                arrayList.add(next);
            }
            return arrayList;
        }
        PlayerEventsListResponse playerEventsListResponse2 = (PlayerEventsListResponse) ((v2g) x2gVar).a;
        ArrayList u2 = mx9.u(requireContext, CollectionsKt.B0(playerEventsListResponse2.getEvents()), list, new y16(playerEventsListResponse2.getPlayedForTeamMap(), playerEventsListResponse2.getIncidentsMap(), playerEventsListResponse2.getStatisticsMap(), playerEventsListResponse2.getOnBenchMap()), true, true, false, false, null, 3520);
        ArrayList arrayList2 = new ArrayList(k13.r(u2, 10));
        Iterator it2 = u2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof y21) {
                ((y21) next2).I = v8aVar;
            }
            arrayList2.add(next2);
        }
        return arrayList2;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ((zij) this.s).b(((SessionWorker) this.t).c.c);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                return new n50((q50) obj2, obj, rq3Var, 0);
            case 1:
                return new n50((List) obj2, (CupTreeDialog) obj, rq3Var, 1);
            case 2:
                return new n50((EventDetailsFragment) obj2, (iy5) obj, rq3Var, 2);
            case 3:
                return new n50((EventMatchesFragment) obj2, (u26) obj, rq3Var, 3);
            case 4:
                return new n50((EventMatchesFragment) obj2, (d36) obj, rq3Var, 4);
            case 5:
                return new n50((List) obj2, (FantasyCompetitionFixturesFragment) obj, rq3Var, 5);
            case 6:
                return new n50((FavoriteEventsFragment) obj2, (xs7) obj, rq3Var, 6);
            case 7:
                return new n50((LiveMatchesFragment) obj2, (veb) obj, rq3Var, 7);
            case 8:
                return new n50((ManagerEventsFragment) obj2, (wsb) obj, rq3Var, 8);
            case 9:
                return new n50((ManagerEventsFragment) obj2, (vsb) obj, rq3Var, 9);
            case 10:
                return new n50((PlayerEventStatisticsModal) obj2, (PlayerEventsListResponse) obj, rq3Var, 10);
            case 11:
                return new n50((PlayerEventsFragment) obj2, (zse) obj, rq3Var, 11);
            case 12:
                return new n50((PlayerEventsFragment) obj2, (use) obj, rq3Var, 12);
            case 13:
                return new n50((zij) obj2, (SessionWorker) obj, rq3Var, 13);
            default:
                return new n50((TeamSeasonStatisticsFragment) obj2, (TeamSeasonStatisticsResponse) obj, rq3Var, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((n50) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r4v4, types: [fy6] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ey6] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [m5i] */
    /* JADX WARN: Type inference failed for: r8v16, types: [nak] */
    /* JADX WARN: Type inference failed for: r8v17, types: [lrj] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [y21] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ?? fy6Var;
        n0j n0jVar;
        Integer num;
        Integer num2;
        n0j n0jVar2;
        xbb H;
        UniqueTournamentSpinnerData uniqueTournament;
        int i = this.r;
        Integer num3 = null;
        Object obj2 = this.s;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                q50 q50Var = (q50) obj2;
                q50Var.c();
                Object b = q50Var.b(obj3);
                ((eoh) q50Var.c.b).setValue(b);
                ((eoh) q50Var.e).setValue(b);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                List<Event> list = (List) obj2;
                list.getClass();
                CupTreeDialog cupTreeDialog = (CupTreeDialog) obj3;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (Event event : list) {
                    Context requireContext = cupTreeDialog.requireContext();
                    requireContext.getClass();
                    arrayList.add(s9a.J(event, requireContext, false, false, null, 30));
                }
                return arrayList;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj2;
                Context requireContext2 = eventDetailsFragment.requireContext();
                requireContext2.getClass();
                ArrayList u = mx9.u(requireContext2, ((iy5) obj3).c, null, null, false, false, false, false, null, 8172);
                List c = u.isEmpty() ? null : a.c(eventDetailsFragment.requireContext().getString(R.string.events));
                return c != null ? CollectionsKt.w0(u, c) : u;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                Context requireContext3 = ((EventMatchesFragment) obj2).requireContext();
                requireContext3.getClass();
                u26 u26Var = (u26) obj3;
                ArrayList u2 = mx9.u(requireContext3, u26Var.b, null, null, false, false, false, false, null, 8188);
                ArrayList arrayList2 = new ArrayList();
                xs2 xs2Var = u26Var.a;
                if (xs2Var != null) {
                    arrayList2.add(xs2Var);
                }
                arrayList2.add(new CustomizableDivider(false, 0, false, null, 14, null));
                arrayList2.addAll(u2);
                return arrayList2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                EventMatchesFragment eventMatchesFragment = (EventMatchesFragment) obj2;
                Context requireContext4 = eventMatchesFragment.requireContext();
                requireContext4.getClass();
                d36 d36Var = (d36) obj3;
                eventMatchesFragment.A = mx9.u(requireContext4, d36Var.g, null, null, false, false, false, false, null, 8188);
                Context requireContext5 = eventMatchesFragment.requireContext();
                requireContext5.getClass();
                eventMatchesFragment.B = mx9.u(requireContext5, d36Var.h, null, null, false, false, false, false, null, 8188);
                Context requireContext6 = eventMatchesFragment.requireContext();
                requireContext6.getClass();
                eventMatchesFragment.C = mx9.u(requireContext6, d36Var.i, null, null, false, false, false, false, null, 8188);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                List<dy6> list2 = (List) obj2;
                list2.getClass();
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) obj3;
                ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                for (dy6 dy6Var : list2) {
                    Context requireContext7 = fantasyCompetitionFixturesFragment.requireContext();
                    requireContext7.getClass();
                    boolean z = fantasyCompetitionFixturesFragment.D().h.c.A;
                    dy6Var.getClass();
                    if (dy6Var instanceof by6) {
                        fy6Var = new ey6(s9a.J(((by6) dy6Var).a, requireContext7, false, !z, null, 22));
                    } else {
                        if (!(dy6Var instanceof cy6)) {
                            zzl.b();
                            return null;
                        }
                        cy6 cy6Var = (cy6) dy6Var;
                        fy6Var = new fy6(s9a.J(cy6Var.a, requireContext7, false, !z, null, 22), cy6Var.b);
                    }
                    arrayList3.add(fy6Var);
                }
                return arrayList3;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                FavoriteEventsFragment favoriteEventsFragment = (FavoriteEventsFragment) obj2;
                Context requireContext8 = favoriteEventsFragment.requireContext();
                requireContext8.getClass();
                xbb w = dy0.w(requireContext8, ((xs7) obj3).a, true);
                ArrayList arrayList4 = new ArrayList(k13.r(w, 10));
                ListIterator listIterator = w.listIterator(0);
                int i2 = 0;
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        return arrayList4;
                    }
                    ?? next = hc9Var.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    boolean z2 = i2 > 0 && (w.get(i2 + (-1)) instanceof DateSection);
                    boolean z3 = (i2 < w.size() - 1 && ((w.get(i3) instanceof DateSection) || w.get(i3) == pzh.d)) || i2 == w.size() - 1;
                    if (next instanceof Event) {
                        Context requireContext9 = favoriteEventsFragment.requireContext();
                        requireContext9.getClass();
                        next = s9a.J((Event) next, requireContext9, false, false, null, 28);
                        next.M = z2;
                        next.n = z3;
                    } else if (next instanceof Tournament) {
                        Context requireContext10 = favoriteEventsFragment.requireContext();
                        requireContext10.getClass();
                        next = w3a.R((Tournament) next, requireContext10, false, false, true, false, false, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        next.k = z2;
                        next.l = z3;
                    } else if (next instanceof UniqueStage) {
                        Context requireContext11 = favoriteEventsFragment.requireContext();
                        requireContext11.getClass();
                        next = g7a.E(requireContext11, (UniqueStage) next);
                        next.e = z2;
                        next.f = z3;
                    } else if (next instanceof Stage) {
                        Context requireContext12 = favoriteEventsFragment.requireContext();
                        requireContext12.getClass();
                        next = i2a.J(requireContext12, (Stage) next);
                        next.g = z2;
                        next.h = z3;
                    }
                    arrayList4.add(next);
                    i2 = i3;
                }
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                LiveMatchesFragment liveMatchesFragment = (LiveMatchesFragment) obj2;
                veb vebVar = (veb) obj3;
                vebVar.getClass();
                if (!vebVar.a.isEmpty()) {
                    Context requireContext13 = liveMatchesFragment.requireContext();
                    requireContext13.getClass();
                    ArrayList u3 = mx9.u(requireContext13, vebVar.a, null, null, false, false, false, false, null, 7676);
                    return u3.isEmpty() ? a.c(new zeb(false)) : u3;
                }
                qqb qqbVar = liveMatchesFragment.D().j;
                if (Intrinsics.c(qqbVar != null ? Boolean.valueOf(qqbVar.a) : null, Boolean.TRUE)) {
                    qqb qqbVar2 = liveMatchesFragment.D().j;
                    if ((qqbVar2 != null ? i2a.x(qqbVar2.b, yaa.w(), true) : 0) > 0) {
                        r3 = true;
                    }
                }
                return a.c(new zeb(r3));
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                ManagerEventsFragment managerEventsFragment = (ManagerEventsFragment) obj2;
                Context requireContext14 = managerEventsFragment.requireContext();
                requireContext14.getClass();
                wsb wsbVar = (wsb) obj3;
                wsbVar.getClass();
                boolean z4 = managerEventsFragment.t;
                ArrayList arrayList5 = wsbVar.b;
                Collections.reverse(arrayList5);
                List list3 = wsbVar.a;
                ArrayList u4 = (list3 == null || list3.isEmpty()) ? mx9.u(requireContext14, arrayList5, null, null, true, false, z4, false, null, 7596) : mx9.u(requireContext14, arrayList5, wsbVar.a, null, true, z4, z4, false, null, 7560);
                ArrayList arrayList6 = new ArrayList(k13.r(u4, 10));
                for (Object obj4 : u4) {
                    if (obj4 instanceof y21) {
                        y21 y21Var = (y21) obj4;
                        int id = y21Var.d().getId();
                        PlayerEventIncidents playerEventIncidents = (PlayerEventIncidents) wsbVar.c.get(Integer.valueOf(id));
                        Integer num4 = (Integer) wsbVar.d.get(Integer.valueOf(id));
                        y21Var.G = playerEventIncidents;
                        y21Var.L = num4;
                    }
                    arrayList6.add(obj4);
                }
                return arrayList6;
            case 9:
                return e(obj);
            case 10:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                PlayerEventStatisticsModal playerEventStatisticsModal = (PlayerEventStatisticsModal) obj2;
                PlayerEventsListResponse playerEventsListResponse = (PlayerEventsListResponse) obj3;
                List B0 = CollectionsKt.B0(playerEventsListResponse.getEvents());
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : B0) {
                    if (!ok3.E((Event) obj5)) {
                        arrayList7.add(obj5);
                    }
                }
                List L0 = CollectionsKt.L0(arrayList7, 5);
                Context requireContext15 = playerEventStatisticsModal.requireContext();
                requireContext15.getClass();
                ArrayList u5 = mx9.u(requireContext15, L0, null, null, false, false, false, false, null, 8044);
                Iterator it = u5.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 instanceof y21) {
                        y21 y21Var2 = (y21) next2;
                        int id2 = y21Var2.d().getId();
                        Integer num5 = playerEventsListResponse.getPlayedForTeamMap().get(Integer.valueOf(id2));
                        Integer valueOf = Integer.valueOf(num5 != null ? num5.intValue() : 0);
                        PlayerEventIncidents playerEventIncidents2 = playerEventsListResponse.getIncidentsMap().get(Integer.valueOf(id2));
                        PlayerMatchesEventStatistics playerMatchesEventStatistics = playerEventsListResponse.getStatisticsMap().get(Integer.valueOf(id2));
                        Boolean bool = playerEventsListResponse.getOnBenchMap().get(Integer.valueOf(id2));
                        if (y21Var2 instanceof j04) {
                            ((j04) y21Var2).l = valueOf;
                        } else {
                            y21Var2.l = valueOf;
                            y21Var2.G = playerEventIncidents2;
                            y21Var2.H = playerMatchesEventStatistics;
                            y21Var2.J = bool;
                        }
                    }
                }
                return u5;
            case 11:
                return f(obj);
            case 12:
                return g(obj);
            case 13:
                return h(obj);
            default:
                TeamSeasonStatisticsResponse teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) obj3;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = (TeamSeasonStatisticsFragment) obj2;
                UniqueTournamentSeasonsSpinnerData G = teamSeasonStatisticsFragment.G();
                ?? r0 = (G == null || (uniqueTournament = G.getUniqueTournament()) == null || uniqueTournament.getId() != -1000) ? false : true;
                if (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.TENNIS) && r0 == true) {
                    Context requireContext16 = teamSeasonStatisticsFragment.requireContext();
                    requireContext16.getClass();
                    TeamSeasonStatistics teamSeasonStatistics = (TeamSeasonStatistics) teamSeasonStatisticsResponse.getStatistics();
                    teamSeasonStatistics.getClass();
                    TennisTeamSeasonStatistics tennisTeamSeasonStatistics = teamSeasonStatistics instanceof TennisTeamSeasonStatistics ? (TennisTeamSeasonStatistics) teamSeasonStatistics : null;
                    if (tennisTeamSeasonStatistics != null) {
                        return new n0j(u6j.j(tennisTeamSeasonStatistics, requireContext16), null, null, null, 14);
                    }
                    return null;
                }
                Set set = u0j.a;
                Context requireContext17 = teamSeasonStatisticsFragment.requireContext();
                requireContext17.getClass();
                String H2 = teamSeasonStatisticsFragment.H();
                oei oeiVar = (oei) ((eoh) teamSeasonStatisticsFragment.B).getValue();
                teamSeasonStatisticsResponse.getClass();
                H2.getClass();
                TeamSeasonStatistics teamSeasonStatistics2 = (TeamSeasonStatistics) teamSeasonStatisticsResponse.getStatistics();
                if (teamSeasonStatistics2 instanceof FootballTeamSeasonStatistics) {
                    FootballTeamSeasonStatistics footballTeamSeasonStatistics = (FootballTeamSeasonStatistics) teamSeasonStatistics2;
                    Pair a = ul8.a(footballTeamSeasonStatistics, requireContext17);
                    return new n0j((List) a.b, (Double) a.a, null, footballTeamSeasonStatistics.getAvgRatingVersion(), 4);
                }
                if (teamSeasonStatistics2 instanceof BasketballRankedStatistics) {
                    BasketballRankedStatistics basketballRankedStatistics = (BasketballRankedStatistics) teamSeasonStatistics2;
                    Integer matches = teamSeasonStatisticsResponse.getMatches();
                    int intValue = matches != null ? matches.intValue() : 1;
                    Integer awardedMatches = teamSeasonStatisticsResponse.getAwardedMatches();
                    int intValue2 = awardedMatches != null ? awardedMatches.intValue() : 1;
                    if (oeiVar == null) {
                        oeiVar = oei.c;
                    }
                    if (cs1.a[oeiVar.ordinal()] == 1) {
                        xbb b2 = a.b();
                        String string = requireContext17.getString(R.string.summary);
                        string.getClass();
                        xbb b3 = a.b();
                        for (Pair pair : b.j(new Pair(basketballRankedStatistics.getPoints(), Integer.valueOf(R.string.points)), new Pair(basketballRankedStatistics.getPointsAgainst(), Integer.valueOf(R.string.points_allowed)), new Pair(basketballRankedStatistics.getAssists(), Integer.valueOf(R.string.basketball_assists)))) {
                            RankedStatistic rankedStatistic = (RankedStatistic) pair.a;
                            int intValue3 = ((Number) pair.b).intValue();
                            if (rankedStatistic != null) {
                                String string2 = requireContext17.getString(intValue3);
                                string2.getClass();
                                Float value = rankedStatistic.getValue();
                                String valueOf2 = String.valueOf(value != null ? Integer.valueOf(wzb.b(value.floatValue())) : null);
                                Integer rankTotal = rankedStatistic.getRankTotal();
                                b3.add(new bs1(string2, valueOf2, rankTotal != null ? rankTotal.intValue() : 0, null));
                            }
                        }
                        ezg.g(b2, string, a.a(b3), km5.a);
                        String string3 = requireContext17.getString(R.string.amf_offense);
                        string3.getClass();
                        xbb b4 = a.b();
                        RankedStatistic fieldGoalsMade = basketballRankedStatistics.getFieldGoalsMade();
                        if (fieldGoalsMade != null) {
                            String string4 = requireContext17.getString(R.string.basketball_field_goals_made);
                            string4.getClass();
                            Float value2 = fieldGoalsMade.getValue();
                            String valueOf3 = String.valueOf(value2 != null ? Integer.valueOf(wzb.b(value2.floatValue())) : null);
                            Integer rankPerGame = fieldGoalsMade.getRankPerGame();
                            b4.add(new bs1(string4, valueOf3, rankPerGame != null ? rankPerGame.intValue() : 0, null));
                        }
                        RankedStatistic fieldGoalsPercentage = basketballRankedStatistics.getFieldGoalsPercentage();
                        if (fieldGoalsPercentage != null) {
                            double floatValue = fieldGoalsPercentage.getValue() != null ? r12.floatValue() : 0.0d;
                            String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue)}, 1));
                            int a2 = wzb.a(floatValue);
                            if (a2 == Double.parseDouble(format)) {
                                format = String.valueOf(a2);
                            }
                            String y = dmi.y(format, "%");
                            String string5 = requireContext17.getString(R.string.field_goals_percentage_made);
                            string5.getClass();
                            Integer rankPerGame2 = fieldGoalsPercentage.getRankPerGame();
                            b4.add(new bs1(string5, y, rankPerGame2 != null ? rankPerGame2.intValue() : 0, null));
                        }
                        for (Pair pair2 : b.j(new Pair(basketballRankedStatistics.getThreePointsMade(), Integer.valueOf(R.string.basketball_three_points_made)), new Pair(basketballRankedStatistics.getFreeThrowsMade(), Integer.valueOf(R.string.basketball_free_throws_made)), new Pair(basketballRankedStatistics.getPointsInPaint(), Integer.valueOf(R.string.basketball_points_in_paint)), new Pair(basketballRankedStatistics.getBenchPoints(), Integer.valueOf(R.string.basketball_points_off_the_bench)), new Pair(basketballRankedStatistics.getFastbreakPoints(), Integer.valueOf(R.string.basketball_fast_break_points)))) {
                            RankedStatistic rankedStatistic2 = (RankedStatistic) pair2.a;
                            int intValue4 = ((Number) pair2.b).intValue();
                            if (rankedStatistic2 != null) {
                                String string6 = requireContext17.getString(intValue4);
                                string6.getClass();
                                Float value3 = rankedStatistic2.getValue();
                                String valueOf4 = String.valueOf(value3 != null ? Integer.valueOf(wzb.b(value3.floatValue())) : null);
                                Integer rankTotal2 = rankedStatistic2.getRankTotal();
                                b4.add(new bs1(string6, valueOf4, rankTotal2 != null ? rankTotal2.intValue() : 0, null));
                            }
                        }
                        ezg.g(b2, string3, a.a(b4), km5.a);
                        String string7 = requireContext17.getString(R.string.rebounds);
                        string7.getClass();
                        xbb b5 = a.b();
                        for (Pair pair3 : b.j(new Pair(basketballRankedStatistics.getOffensiveRebounds(), Integer.valueOf(R.string.offensive)), new Pair(basketballRankedStatistics.getDefensiveRebounds(), Integer.valueOf(R.string.basketball_stat_rebounds_defensive)), new Pair(basketballRankedStatistics.getRebounds(), Integer.valueOf(R.string.total)))) {
                            RankedStatistic rankedStatistic3 = (RankedStatistic) pair3.a;
                            int intValue5 = ((Number) pair3.b).intValue();
                            if (rankedStatistic3 != null) {
                                String string8 = requireContext17.getString(intValue5);
                                string8.getClass();
                                Float value4 = rankedStatistic3.getValue();
                                String valueOf5 = String.valueOf(value4 != null ? Integer.valueOf(wzb.b(value4.floatValue())) : null);
                                Integer rankTotal3 = rankedStatistic3.getRankTotal();
                                b5.add(new bs1(string8, valueOf5, rankTotal3 != null ? rankTotal3.intValue() : 0, null));
                            }
                        }
                        ezg.g(b2, string7, a.a(b5), km5.a);
                        String string9 = requireContext17.getString(R.string.amf_defense);
                        string9.getClass();
                        xbb b6 = a.b();
                        for (Pair pair4 : b.j(new Pair(basketballRankedStatistics.getBlocks(), Integer.valueOf(R.string.blocks)), new Pair(basketballRankedStatistics.getSteals(), Integer.valueOf(R.string.steals)), new Pair(basketballRankedStatistics.getOffensiveFoulsAgainst(), Integer.valueOf(R.string.basketball_charges_drawn)))) {
                            RankedStatistic rankedStatistic4 = (RankedStatistic) pair4.a;
                            int intValue6 = ((Number) pair4.b).intValue();
                            if (rankedStatistic4 != null) {
                                String string10 = requireContext17.getString(intValue6);
                                string10.getClass();
                                Float value5 = rankedStatistic4.getValue();
                                String valueOf6 = String.valueOf(value5 != null ? Integer.valueOf(wzb.b(value5.floatValue())) : null);
                                Integer rankTotal4 = rankedStatistic4.getRankTotal();
                                b6.add(new bs1(string10, valueOf6, rankTotal4 != null ? rankTotal4.intValue() : 0, null));
                            }
                        }
                        ezg.g(b2, string9, a.a(b6), km5.a);
                        String string11 = requireContext17.getString(R.string.other);
                        string11.getClass();
                        xbb b7 = a.b();
                        for (Pair pair5 : b.j(new Pair(basketballRankedStatistics.getTurnovers(), Integer.valueOf(R.string.turnovers)), new Pair(basketballRankedStatistics.getPersonalFouls(), Integer.valueOf(R.string.personal_fouls)), new Pair(basketballRankedStatistics.getPersonalFoulsAgainst(), Integer.valueOf(R.string.basketball_fouls_drawn)), new Pair(basketballRankedStatistics.getTechnicalFouls(), Integer.valueOf(R.string.basketball_technical_fouls)), new Pair(basketballRankedStatistics.getFlagrantFouls(), Integer.valueOf(R.string.basketball_flagrant_fouls)))) {
                            RankedStatistic rankedStatistic5 = (RankedStatistic) pair5.a;
                            int intValue7 = ((Number) pair5.b).intValue();
                            if (rankedStatistic5 != null) {
                                String string12 = requireContext17.getString(intValue7);
                                string12.getClass();
                                Float value6 = rankedStatistic5.getValue();
                                String valueOf7 = String.valueOf(value6 != null ? Integer.valueOf(wzb.b(value6.floatValue())) : null);
                                Integer rankTotal5 = rankedStatistic5.getRankTotal();
                                b7.add(new bs1(string12, valueOf7, rankTotal5 != null ? rankTotal5.intValue() : 0, null));
                            }
                        }
                        ezg.g(b2, string11, a.a(b7), km5.a);
                        H = a.a(b2);
                    } else {
                        H = gvd.H(basketballRankedStatistics, requireContext17, intValue, intValue2);
                    }
                    n0jVar2 = new n0j(H, null, teamSeasonStatisticsResponse.getTeamCount(), null, 10);
                } else {
                    if (!(teamSeasonStatistics2 instanceof FutsalTeamSeasonStatistics)) {
                        if (teamSeasonStatistics2 instanceof TennisTeamSeasonStatistics) {
                            n0jVar = new n0j(u6j.j((TennisTeamSeasonStatistics) teamSeasonStatistics2, requireContext17), null, null, null, 14);
                        } else {
                            if (!(teamSeasonStatistics2 instanceof RugbyTeamSeasonStatistics)) {
                                return null;
                            }
                            RugbyTeamSeasonStatistics rugbyTeamSeasonStatistics = (RugbyTeamSeasonStatistics) teamSeasonStatistics2;
                            ArrayList arrayList8 = new ArrayList();
                            String string13 = requireContext17.getString(R.string.rugby_points);
                            string13.getClass();
                            oei oeiVar2 = oei.c;
                            boolean z5 = oeiVar == oeiVar2;
                            xbb b8 = a.b();
                            String string14 = requireContext17.getString(R.string.total);
                            string14.getClass();
                            ezg.e(b8, string14, rugbyTeamSeasonStatistics.getPoints(), rugbyTeamSeasonStatistics.getMatches(), z5);
                            String string15 = requireContext17.getString(R.string.rugby_tries);
                            string15.getClass();
                            ezg.e(b8, string15, rugbyTeamSeasonStatistics.getTries(), rugbyTeamSeasonStatistics.getMatches(), z5);
                            String string16 = requireContext17.getString(R.string.rugby_penalty_tries);
                            string16.getClass();
                            ezg.e(b8, string16, rugbyTeamSeasonStatistics.getPenaltyTries(), rugbyTeamSeasonStatistics.getMatches(), z5);
                            String string17 = requireContext17.getString(R.string.rugby_penalty_goals);
                            string17.getClass();
                            Integer penaltyGoals = rugbyTeamSeasonStatistics.getPenaltyGoals();
                            Integer penaltyGoalsMissed = rugbyTeamSeasonStatistics.getPenaltyGoalsMissed();
                            if (penaltyGoalsMissed != null) {
                                int intValue8 = penaltyGoalsMissed.intValue();
                                Integer penaltyGoals2 = rugbyTeamSeasonStatistics.getPenaltyGoals();
                                num = Integer.valueOf(intValue8 + (penaltyGoals2 != null ? penaltyGoals2.intValue() : 0));
                            } else {
                                num = null;
                            }
                            ezg.d(b8, string17, penaltyGoals, num, rugbyTeamSeasonStatistics.getMatches(), z5);
                            String string18 = requireContext17.getString(R.string.rugby_conversions);
                            string18.getClass();
                            Integer conversions = rugbyTeamSeasonStatistics.getConversions();
                            Integer conversionsMissed = rugbyTeamSeasonStatistics.getConversionsMissed();
                            if (conversionsMissed != null) {
                                int intValue9 = conversionsMissed.intValue();
                                Integer conversions2 = rugbyTeamSeasonStatistics.getConversions();
                                num2 = Integer.valueOf(intValue9 + (conversions2 != null ? conversions2.intValue() : 0));
                            } else {
                                num2 = null;
                            }
                            ezg.d(b8, string18, conversions, num2, rugbyTeamSeasonStatistics.getMatches(), z5);
                            String string19 = requireContext17.getString(R.string.rugby_drop_goals);
                            string19.getClass();
                            ezg.e(b8, string19, rugbyTeamSeasonStatistics.getDropGoals(), rugbyTeamSeasonStatistics.getMatches(), z5);
                            xbb a3 = a.a(b8);
                            km5 km5Var = km5.a;
                            ezg.g(arrayList8, string13, a3, km5Var);
                            String string20 = requireContext17.getString(R.string.attack_statistics);
                            string20.getClass();
                            boolean z6 = oeiVar == oeiVar2;
                            xbb b9 = a.b();
                            String string21 = requireContext17.getString(R.string.rugby_passes_made);
                            string21.getClass();
                            ezg.d(b9, string21, rugbyTeamSeasonStatistics.getPassesSuccessful(), rugbyTeamSeasonStatistics.getPassesTotal(), rugbyTeamSeasonStatistics.getMatches(), z6);
                            boolean z7 = z6;
                            String string22 = requireContext17.getString(R.string.rugby_offloads);
                            string22.getClass();
                            ezg.e(b9, string22, rugbyTeamSeasonStatistics.getOffloads(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string23 = requireContext17.getString(R.string.rugby_carries);
                            string23.getClass();
                            ezg.e(b9, string23, rugbyTeamSeasonStatistics.getCarries(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string24 = requireContext17.getString(R.string.rugby_clean_breaks);
                            string24.getClass();
                            ezg.e(b9, string24, rugbyTeamSeasonStatistics.getCleanBreaks(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string25 = requireContext17.getString(R.string.rugby_defenders_beaten);
                            string25.getClass();
                            ezg.e(b9, string25, rugbyTeamSeasonStatistics.getDefendersBeaten(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string26 = requireContext17.getString(R.string.rugby_metres_gained);
                            string26.getClass();
                            ezg.e(b9, string26, rugbyTeamSeasonStatistics.getMetresMade(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string27 = requireContext17.getString(R.string.rugby_handling_errors);
                            string27.getClass();
                            ezg.e(b9, string27, rugbyTeamSeasonStatistics.getHandlingError(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string28 = requireContext17.getString(R.string.rugby_carries_crossed_gained_line);
                            string28.getClass();
                            ezg.e(b9, string28, rugbyTeamSeasonStatistics.getCarriesCrossedGainLine(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string29 = requireContext17.getString(R.string.rugby_carries_not_made_gain_line);
                            string29.getClass();
                            ezg.e(b9, string29, rugbyTeamSeasonStatistics.getCarriesNotMadeGainLine(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            String string30 = requireContext17.getString(R.string.rugby_post_contact_metres);
                            string30.getClass();
                            ezg.e(b9, string30, rugbyTeamSeasonStatistics.getPostContactMetres(), rugbyTeamSeasonStatistics.getMatches(), z7);
                            ezg.g(arrayList8, string20, a.a(b9), km5Var);
                            String string31 = requireContext17.getString(R.string.any_sport_defence_stats_category);
                            string31.getClass();
                            boolean z8 = oeiVar == oeiVar2;
                            xbb b10 = a.b();
                            String string32 = requireContext17.getString(R.string.rugby_tackles_made);
                            string32.getClass();
                            ezg.d(b10, string32, rugbyTeamSeasonStatistics.getTackles(), rugbyTeamSeasonStatistics.getTacklesTotal(), rugbyTeamSeasonStatistics.getMatches(), z8);
                            boolean z9 = z8;
                            String string33 = requireContext17.getString(R.string.rugby_dominant_tackles);
                            string33.getClass();
                            ezg.e(b10, string33, rugbyTeamSeasonStatistics.getDominantTackles(), rugbyTeamSeasonStatistics.getMatches(), z9);
                            String string34 = requireContext17.getString(R.string.rugby_offensive_penalties_conceded);
                            string34.getClass();
                            ezg.e(b10, string34, rugbyTeamSeasonStatistics.getPenOffs(), rugbyTeamSeasonStatistics.getMatches(), z9);
                            String string35 = requireContext17.getString(R.string.rugby_defensive_penalties_conceded);
                            string35.getClass();
                            ezg.e(b10, string35, rugbyTeamSeasonStatistics.getPenDefs(), rugbyTeamSeasonStatistics.getMatches(), z9);
                            ezg.g(arrayList8, string31, a.a(b10), km5Var);
                            String string36 = requireContext17.getString(R.string.any_sport_set_pieces_stats_category);
                            string36.getClass();
                            boolean z10 = oeiVar == oeiVar2;
                            xbb b11 = a.b();
                            String string37 = requireContext17.getString(R.string.rugby_scrums_won);
                            string37.getClass();
                            ezg.d(b11, string37, rugbyTeamSeasonStatistics.getScrumsWon(), rugbyTeamSeasonStatistics.getScrumsTotal(), rugbyTeamSeasonStatistics.getMatches(), z10);
                            String string38 = requireContext17.getString(R.string.rugby_lineouts_won);
                            string38.getClass();
                            Integer lineoutsWon = rugbyTeamSeasonStatistics.getLineoutsWon();
                            Integer lineoutsLost = rugbyTeamSeasonStatistics.getLineoutsLost();
                            if (lineoutsLost != null) {
                                int intValue10 = lineoutsLost.intValue();
                                Integer lineoutsWon2 = rugbyTeamSeasonStatistics.getLineoutsWon();
                                num3 = Integer.valueOf(intValue10 + (lineoutsWon2 != null ? lineoutsWon2.intValue() : 0));
                            }
                            ezg.d(b11, string38, lineoutsWon, num3, rugbyTeamSeasonStatistics.getMatches(), z10);
                            ezg.g(arrayList8, string36, a.a(b11), km5Var);
                            String string39 = requireContext17.getString(R.string.rugby_kicking_stats_category);
                            string39.getClass();
                            boolean z11 = oeiVar == oeiVar2;
                            xbb b12 = a.b();
                            String string40 = requireContext17.getString(R.string.rugby_kick_metres);
                            string40.getClass();
                            ezg.e(b12, string40, rugbyTeamSeasonStatistics.getKickMetres(), rugbyTeamSeasonStatistics.getMatches(), z11);
                            String string41 = requireContext17.getString(R.string.rugby_kicks_from_hand);
                            string41.getClass();
                            ezg.e(b12, string41, rugbyTeamSeasonStatistics.getKickFromHand(), rugbyTeamSeasonStatistics.getMatches(), z11);
                            ezg.g(arrayList8, string39, a.a(b12), km5Var);
                            String string42 = requireContext17.getString(R.string.rugby_rucks_stats_category);
                            string42.getClass();
                            boolean z12 = oeiVar == oeiVar2;
                            xbb b13 = a.b();
                            String string43 = requireContext17.getString(R.string.rugby_rucks_won);
                            string43.getClass();
                            ezg.d(b13, string43, rugbyTeamSeasonStatistics.getRucksWon(), rugbyTeamSeasonStatistics.getRucksTotal(), rugbyTeamSeasonStatistics.getMatches(), z12);
                            boolean z13 = z12;
                            String string44 = requireContext17.getString(R.string.rugby_ruck_arrivals);
                            string44.getClass();
                            ezg.e(b13, string44, rugbyTeamSeasonStatistics.getRuckArrival(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            String string45 = requireContext17.getString(R.string.rugby_attacking_ruck_arrivals);
                            string45.getClass();
                            ezg.e(b13, string45, rugbyTeamSeasonStatistics.getRuckArrivalAttack(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            String string46 = requireContext17.getString(R.string.rugby_defensive_ruck_arrivals);
                            string46.getClass();
                            ezg.e(b13, string46, rugbyTeamSeasonStatistics.getRuckArrivalDefence(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            String string47 = requireContext17.getString(R.string.rugby_rucks_0_3_sec);
                            string47.getClass();
                            ezg.e(b13, string47, rugbyTeamSeasonStatistics.getRuckSpeed03(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            String string48 = requireContext17.getString(R.string.rugby_rucks_3_6_sec);
                            string48.getClass();
                            ezg.e(b13, string48, rugbyTeamSeasonStatistics.getRuckSpeed36(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            String string49 = requireContext17.getString(R.string.rugby_rucks_over_6_sec);
                            string49.getClass();
                            ezg.e(b13, string49, rugbyTeamSeasonStatistics.getRuckSpeed6Plus(), rugbyTeamSeasonStatistics.getMatches(), z13);
                            ezg.g(arrayList8, string42, a.a(b13), km5Var);
                            String string50 = requireContext17.getString(R.string.rugby_discipline_stats_category);
                            string50.getClass();
                            r3 = oeiVar == oeiVar2;
                            xbb b14 = a.b();
                            String string51 = requireContext17.getString(R.string.rugby_yellow_cards);
                            string51.getClass();
                            ezg.e(b14, string51, rugbyTeamSeasonStatistics.getYellowCards(), rugbyTeamSeasonStatistics.getMatches(), r3);
                            String string52 = requireContext17.getString(R.string.rugby_red_cards);
                            string52.getClass();
                            ezg.e(b14, string52, rugbyTeamSeasonStatistics.getRedCards(), rugbyTeamSeasonStatistics.getMatches(), r3);
                            String string53 = requireContext17.getString(R.string.rugby_penalty_conceded);
                            string53.getClass();
                            ezg.e(b14, string53, rugbyTeamSeasonStatistics.getPenaltyGoalsConceded(), rugbyTeamSeasonStatistics.getMatches(), r3);
                            ezg.g(arrayList8, string50, a.a(b14), km5Var);
                            n0jVar = new n0j(arrayList8, null, null, null, 14);
                        }
                        return n0jVar;
                    }
                    FutsalTeamSeasonStatistics futsalTeamSeasonStatistics = (FutsalTeamSeasonStatistics) teamSeasonStatistics2;
                    ArrayList arrayList9 = new ArrayList();
                    String string54 = requireContext17.getString(R.string.summary);
                    string54.getClass();
                    xbb b15 = a.b();
                    Integer matches2 = futsalTeamSeasonStatistics.getMatches();
                    if (matches2 != null) {
                        int intValue11 = matches2.intValue();
                        mqi mqiVar = bii.a;
                        String string55 = requireContext17.getString(bii.b(Sports.FUTSAL, false));
                        string55.getClass();
                        b15.add(new jei(string55, String.valueOf(intValue11), null));
                    }
                    Integer goalsScored = futsalTeamSeasonStatistics.getGoalsScored();
                    if (goalsScored != null) {
                        int intValue12 = goalsScored.intValue();
                        String string56 = requireContext17.getString(R.string.futsal_goals_scored);
                        string56.getClass();
                        b15.add(new jei(string56, String.valueOf(intValue12), null));
                    }
                    Integer goalsConceded = futsalTeamSeasonStatistics.getGoalsConceded();
                    if (goalsConceded != null) {
                        int intValue13 = goalsConceded.intValue();
                        String string57 = requireContext17.getString(R.string.futsal_goals_conceded);
                        string57.getClass();
                        b15.add(new jei(string57, String.valueOf(intValue13), null));
                    }
                    Integer cleanSheets = futsalTeamSeasonStatistics.getCleanSheets();
                    if (cleanSheets != null) {
                        int intValue14 = cleanSheets.intValue();
                        String string58 = requireContext17.getString(R.string.football_clean_sheets);
                        string58.getClass();
                        b15.add(new jei(string58, String.valueOf(intValue14), null));
                    }
                    Integer yellowCards = futsalTeamSeasonStatistics.getYellowCards();
                    if (yellowCards != null) {
                        int intValue15 = yellowCards.intValue();
                        String string59 = requireContext17.getString(R.string.football_yellow_cards);
                        string59.getClass();
                        b15.add(new jei(string59, String.valueOf(intValue15), null));
                    }
                    Integer redCards = futsalTeamSeasonStatistics.getRedCards();
                    if (redCards != null) {
                        int intValue16 = redCards.intValue();
                        String string60 = requireContext17.getString(R.string.futsal_red_cards);
                        string60.getClass();
                        b15.add(new jei(string60, String.valueOf(intValue16), null));
                    }
                    Integer penaltyGoals3 = futsalTeamSeasonStatistics.getPenaltyGoals();
                    if (penaltyGoals3 != null) {
                        int intValue17 = penaltyGoals3.intValue();
                        String string61 = requireContext17.getString(R.string.football_penalty_goals);
                        string61.getClass();
                        Integer penaltyMisses = futsalTeamSeasonStatistics.getPenaltyMisses();
                        Integer valueOf8 = penaltyMisses != null ? Integer.valueOf(penaltyMisses.intValue() + intValue17) : null;
                        b15.add(new jei(string61, valueOf8 != null ? fc6.g(intValue17, valueOf8.intValue(), "/") : String.valueOf(intValue17), null));
                    }
                    Integer accumulatedPenaltyGoals = futsalTeamSeasonStatistics.getAccumulatedPenaltyGoals();
                    if (accumulatedPenaltyGoals != null) {
                        if (accumulatedPenaltyGoals.intValue() <= 0) {
                            accumulatedPenaltyGoals = null;
                        }
                        if (accumulatedPenaltyGoals != null) {
                            int intValue18 = accumulatedPenaltyGoals.intValue();
                            String string62 = requireContext17.getString(R.string.futsal_accumulated_penalty_goals);
                            string62.getClass();
                            Integer accumulatedPenaltyMisses = futsalTeamSeasonStatistics.getAccumulatedPenaltyMisses();
                            Integer valueOf9 = accumulatedPenaltyMisses != null ? Integer.valueOf(accumulatedPenaltyMisses.intValue() + intValue18) : null;
                            b15.add(new jei(string62, valueOf9 != null ? fc6.g(intValue18, valueOf9.intValue(), "/") : String.valueOf(intValue18), null));
                        }
                    }
                    Integer ownGoals = futsalTeamSeasonStatistics.getOwnGoals();
                    if (ownGoals != null) {
                        int intValue19 = ownGoals.intValue();
                        String string63 = requireContext17.getString(R.string.own_goals);
                        string63.getClass();
                        b15.add(new jei(string63, String.valueOf(intValue19), null));
                    }
                    Integer accumulatedFouls = futsalTeamSeasonStatistics.getAccumulatedFouls();
                    if (accumulatedFouls != null) {
                        int intValue20 = accumulatedFouls.intValue();
                        String string64 = requireContext17.getString(R.string.futsal_accumulated_fouls);
                        string64.getClass();
                        b15.add(new jei(string64, String.valueOf(intValue20), null));
                    }
                    ezg.g(arrayList9, string54, a.a(b15), km5.a);
                    n0jVar2 = new n0j(arrayList9, null, null, null, 14);
                }
                return n0jVar2;
        }
    }
}
