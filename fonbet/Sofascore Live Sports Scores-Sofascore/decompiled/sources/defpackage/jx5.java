package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.PlayerView;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDetails;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jx5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ jx5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0567  */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.sofascore.model.mvvm.model.TeamSides, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        c4f c4fVar;
        int i;
        Throwable th;
        int i2;
        List list;
        List list2;
        Lineups awayLineups$default;
        List<PlayerData> players;
        ?? r3;
        Lineups homeLineups$default;
        List<PlayerData> players2;
        boolean z;
        Integer bestOf;
        boolean isEmpty;
        ?? r10;
        Long lastPeriodEndTimestamp;
        Boolean bool;
        List<Incident> incidents;
        boolean z2;
        boolean z3;
        Map map;
        rm1 rm1Var;
        LineupsResponse lineupsResponse;
        Object obj2;
        int i3 = this.a;
        int i4 = 10;
        EventDetailsFragment eventDetailsFragment = this.b;
        switch (i3) {
            case 0:
                List list3 = (List) obj;
                joa joaVar = eventDetailsFragment.P;
                c4f c4fVar2 = (c4f) joaVar.getValue();
                if (c4fVar2 != null) {
                    list3.getClass();
                    c4fVar2.n(list3, eventDetailsFragment.I().o);
                }
                if (eventDetailsFragment.r && (c4fVar = (c4f) joaVar.getValue()) != null) {
                    c4fVar.setVisibility(c4fVar.h ? 0 : 8);
                }
                return Unit.a;
            case 1:
                fqc fqcVar = (fqc) obj;
                eqc eqcVar = (eqc) eventDetailsFragment.I0.getValue();
                if (eqcVar != null) {
                    fqcVar.getClass();
                    Event F = eventDetailsFragment.F();
                    jx5 jx5Var = new jx5(eventDetailsFragment, i4);
                    hx5 hx5Var = new hx5(eventDetailsFragment, 20);
                    MmaPostMatchVotingOptions mmaPostMatchVotingOptions = fqcVar.b;
                    o8.d(eqcVar, 0, 7);
                    eqcVar.f = F.getId();
                    eqcVar.g = mmaPostMatchVotingOptions;
                    ez0 ez0Var = eqcVar.d;
                    MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails = (MmaPostMatchVotingMotionViewDetails) ez0Var.c;
                    MmaPostMatchVote mmaPostMatchVote = fqcVar.a;
                    mmaPostMatchVotingMotionViewDetails.o = mmaPostMatchVote;
                    r6 = tnf.r(F) && mmaPostMatchVotingOptions == null;
                    if (!r6) {
                        mmaPostMatchVotingMotionViewDetails.getBinding().f.setVisibility(8);
                        mmaPostMatchVotingMotionViewDetails.s(mmaPostMatchVote, mmaPostMatchVotingOptions, false);
                    }
                    mmaPostMatchVotingMotionViewDetails.o(F, jx5Var, r6);
                    ((ConstraintLayout) ez0Var.b).post(new yp8(eqcVar, 17));
                    ((TextView) ez0Var.d).setOnClickListener(new cd5(hx5Var, 20));
                    if (!tnf.r(F)) {
                        ((TextView) ez0Var.e).setVisibility(0);
                    }
                }
                return Unit.a;
            case 2:
                if (eventDetailsFragment.r) {
                    eventDetailsFragment.W();
                }
                return Unit.a;
            case 3:
                iy5 iy5Var = (iy5) obj;
                g7 g7Var = eventDetailsFragment.D;
                if (g7Var == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                if (g7Var instanceof ii6) {
                    ii6 ii6Var = (ii6) g7Var;
                    EventIncidentsResponse eventIncidentsResponse = iy5Var.a;
                    List<Incident> incidents2 = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : null;
                    if (incidents2 == null) {
                        incidents2 = km5.a;
                    }
                    Event F2 = eventDetailsFragment.F();
                    ArrayList k = me4.k(incidents2);
                    for (Object obj3 : incidents2) {
                        Incident incident = (Incident) obj3;
                        if ((incident instanceof Incident.PeriodIncident) || (incident instanceof Incident.GoalIncident) || (incident instanceof Incident.OvertimeBreakIncident)) {
                            k.add(obj3);
                        }
                    }
                    LinkedHashMap L = ii6Var.L(k, F2);
                    ii6Var.p = L;
                    ii6Var.F(ii6.K(L));
                } else {
                    if (!(g7Var instanceof yy9)) {
                        if (g7Var instanceof mq5) {
                            mq5 mq5Var = (mq5) g7Var;
                            Event F3 = eventDetailsFragment.F();
                            EsportsGamesResponse esportsGamesResponse = iy5Var.n;
                            List<EsportsGame> games = esportsGamesResponse != null ? esportsGamesResponse.getGames() : null;
                            if (games == null) {
                                games = km5.a;
                            }
                            LineupsResponse lineupsResponse2 = iy5Var.o;
                            Context context = mq5Var.b;
                            games.getClass();
                            if ((F3 instanceof ESportsEvent ? (ESportsEvent) F3 : null) != null) {
                                ArrayList arrayList = new ArrayList();
                                i = 0;
                                ESportsEvent eSportsEvent = (ESportsEvent) F3;
                                Integer bestOf2 = eSportsEvent.getBestOf();
                                if (bestOf2 != null) {
                                    int intValue = bestOf2.intValue();
                                    th = null;
                                    i2 = intValue;
                                } else {
                                    th = null;
                                    i2 = 0;
                                }
                                if (i2 <= 5) {
                                    if (eSportsEvent.getTournament().getCategory().getId() == 1572) {
                                        Integer gameAdvantageTeamId = eSportsEvent.getGameAdvantageTeamId();
                                        if ((gameAdvantageTeamId != null ? gameAdvantageTeamId.intValue() : 0) > 0) {
                                            z = true;
                                            bestOf = eSportsEvent.getBestOf();
                                            if ((bestOf == null ? bestOf.intValue() : 0) > 0) {
                                                arrayList.add(F3);
                                            }
                                            ArrayList arrayList2 = new ArrayList(k13.r(games, 10));
                                            int i5 = 0;
                                            for (Object obj4 : games) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw th;
                                                }
                                                EsportsGame esportsGame = (EsportsGame) obj4;
                                                arrayList2.add(eSportsEvent.getTournament().getCategory().getId() == 1572 ? new lq5(i6, esportsGame, eSportsEvent, i5 == 0 && !z) : new rq5(i6, esportsGame, eSportsEvent, i5 == 0 && !z));
                                                i5 = i6;
                                            }
                                            isEmpty = arrayList2.isEmpty();
                                            r10 = arrayList2;
                                            if (isEmpty) {
                                                r10 = th;
                                            }
                                            if (r10 != 0) {
                                                arrayList.add(context.getString(R.string.e_sport_games));
                                                arrayList.addAll(CollectionsKt.B0(r10));
                                            }
                                            if (z) {
                                                arrayList.add(new kq5(eSportsEvent));
                                            }
                                        }
                                    }
                                    z = false;
                                    bestOf = eSportsEvent.getBestOf();
                                    if ((bestOf == null ? bestOf.intValue() : 0) > 0) {
                                    }
                                    ArrayList arrayList22 = new ArrayList(k13.r(games, 10));
                                    int i52 = 0;
                                    while (r3.hasNext()) {
                                    }
                                    isEmpty = arrayList22.isEmpty();
                                    r10 = arrayList22;
                                    if (isEmpty) {
                                    }
                                    if (r10 != 0) {
                                    }
                                    if (z) {
                                    }
                                }
                                int id = eSportsEvent.getTournament().getCategory().getId();
                                Comparator y73Var = id != 1570 ? id != 1571 ? new y73(17) : o93.a(new qz4(22), new qz4(23)) : o93.a(new qz4(24), new qz4(25));
                                if (lineupsResponse2 == null || (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse2, (r3 = th), 1, r3)) == null || (players2 = homeLineups$default.getPlayers()) == null || (list = CollectionsKt.H0(players2, y73Var)) == null) {
                                    list = km5.a;
                                }
                                if (lineupsResponse2 == null || (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse2, null, 1, null)) == null || (players = awayLineups$default.getPlayers()) == null || (list2 = CollectionsKt.H0(players, y73Var)) == null) {
                                    list2 = km5.a;
                                }
                                if (!list.isEmpty() || !list2.isEmpty()) {
                                    arrayList.add(context.getString(R.string.players));
                                    int max = Math.max(list.size(), list2.size());
                                    Iterator it = CollectionsKt.Y0(CollectionsKt.y0(list, i5h.p(e5h.d(new ag5(22)), max - list.size())), CollectionsKt.y0(list2, i5h.p(e5h.d(new ag5(22)), max - list2.size()))).iterator();
                                    while (it.hasNext()) {
                                        Pair pair = (Pair) it.next();
                                        Object obj5 = pair.a;
                                        PlayerData playerData = obj5 instanceof PlayerData ? (PlayerData) obj5 : null;
                                        Object obj6 = pair.b;
                                        arrayList.add(new qq5(playerData, obj6 instanceof PlayerData ? (PlayerData) obj6 : null, eSportsEvent.getTournament().getCategory().getId()));
                                    }
                                }
                                mq5Var.F(arrayList);
                            }
                        } else {
                            i = 0;
                            if (g7Var instanceof wye) {
                                ((wye) g7Var).G(eventDetailsFragment.F(), iy5Var.b);
                            } else if (g7Var instanceof qzh) {
                                kda.p(wca.x(eventDetailsFragment.getLifecycle()), new n50(eventDetailsFragment, iy5Var, null, 2), new kz3(g7Var, 23));
                            }
                        }
                        if (!eventDetailsFragment.r) {
                            MenuItem menuItem = eventDetailsFragment.u;
                            if (menuItem != null) {
                                menuItem.setEnabled(true);
                            }
                            eventDetailsFragment.W();
                            PromotionBannerView promotionBannerView = (PromotionBannerView) eventDetailsFragment.a0.getValue();
                            int i7 = i;
                            if (promotionBannerView != null) {
                                promotionBannerView.setVisibility(i7);
                            }
                            PromotionBannerView promotionBannerView2 = (PromotionBannerView) eventDetailsFragment.b0.getValue();
                            if (promotionBannerView2 != null) {
                                promotionBannerView2.setVisibility(i7);
                            }
                            FeaturedOddsView featuredOddsView = (FeaturedOddsView) eventDetailsFragment.q0.getValue();
                            if (featuredOddsView != null) {
                                featuredOddsView.setVisibility(i7);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) eventDetailsFragment.n0.getValue();
                            if (gambleRegulationFooterView != null) {
                                OddsCountryProvider oddsCountryProvider = iy5Var.d;
                                Boolean valueOf = Boolean.valueOf(Intrinsics.c(oddsCountryProvider != null ? oddsCountryProvider.getOddsMayDiffer() : null, Boolean.TRUE));
                                int i8 = GambleRegulationFooterView.e;
                                gambleRegulationFooterView.j(valueOf, false);
                                g7 g7Var2 = eventDetailsFragment.D;
                                if (g7Var2 == null) {
                                    Intrinsics.i(L6.G1);
                                    throw null;
                                }
                                g7.o(g7Var2, gambleRegulationFooterView, 6);
                            }
                            if (eventDetailsFragment.D().N) {
                                eventDetailsFragment.D().N = false;
                                eventDetailsFragment.M().f(rd6.e);
                            }
                            c4f c4fVar3 = (c4f) eventDetailsFragment.P.getValue();
                            if (c4fVar3 != null) {
                                c4fVar3.setVisibility(c4fVar3.h ? 0 : 8);
                            }
                            iuh iuhVar = (iuh) eventDetailsFragment.O.getValue();
                            if (iuhVar != null) {
                                iuhVar.m(fv.EVENT_SCREEN);
                            }
                            k3k k3kVar = (k3k) eventDetailsFragment.S.getValue();
                            if (k3kVar != null) {
                                k3kVar.setOnSelectCountryClick(new lx5(eventDetailsFragment, k3kVar));
                                k3kVar.setOnFullTvChannelClick(new mx5(k3kVar, 0));
                                k3kVar.setOnVoteClick(new nx5(eventDetailsFragment, 0));
                                z3 = true;
                                k3kVar.setOnContributeClick(new kx5(eventDetailsFragment, true ? 1 : 0));
                                iy5Var.getClass();
                                eventDetailsFragment.R(iy5Var);
                                eventDetailsFragment.r = z3;
                                return Unit.a;
                            }
                        }
                        z3 = true;
                        iy5Var.getClass();
                        eventDetailsFragment.R(iy5Var);
                        eventDetailsFragment.r = z3;
                        return Unit.a;
                    }
                    if (Intrinsics.c(eventDetailsFragment.L(), Sports.ICE_HOCKEY)) {
                        iy5Var.getClass();
                        EventIncidentsResponse eventIncidentsResponse2 = iy5Var.a;
                        yy9 yy9Var = (yy9) g7Var;
                        TypeHeaderView typeHeaderView = (TypeHeaderView) eventDetailsFragment.u0.getValue();
                        if (typeHeaderView != null) {
                            if (typeHeaderView.getSelectedItem() != null) {
                                eventDetailsFragment.V(typeHeaderView.getSelectedItem());
                            } else {
                                if (eventIncidentsResponse2 == null || (incidents = eventIncidentsResponse2.getIncidents()) == null) {
                                    bool = null;
                                } else {
                                    if (!incidents.isEmpty()) {
                                        for (Incident incident2 : incidents) {
                                            if ((incident2 instanceof Incident.SuspensionIncident) && ((Incident.SuspensionIncident) incident2).getIceHockeyPenaltyType() != null) {
                                                z2 = true;
                                                bool = Boolean.valueOf(z2);
                                            }
                                        }
                                    }
                                    z2 = false;
                                    bool = Boolean.valueOf(z2);
                                }
                                if (Intrinsics.c(bool, Boolean.TRUE)) {
                                    yy9Var.n = true;
                                    kp5 kp5Var = pz9.b;
                                    ArrayList arrayList3 = new ArrayList(k13.r(kp5Var, 10));
                                    Iterator it2 = kp5Var.iterator();
                                    while (it2.hasNext()) {
                                        arrayList3.add(((pz9) it2.next()).name());
                                    }
                                    TypeHeaderView.z(typeHeaderView, arrayList3, null, 2);
                                } else {
                                    List<Incident> incidents3 = eventIncidentsResponse2 != null ? eventIncidentsResponse2.getIncidents() : null;
                                    if (incidents3 == null) {
                                        incidents3 = km5.a;
                                    }
                                    yy9Var.G(incidents3, null, null, false, null);
                                }
                            }
                        }
                    } else if (!Intrinsics.c(eventDetailsFragment.L(), Sports.CRICKET)) {
                        yy9 yy9Var2 = (yy9) g7Var;
                        EventIncidentsResponse eventIncidentsResponse3 = iy5Var.a;
                        List<Incident> incidents4 = eventIncidentsResponse3 != null ? eventIncidentsResponse3.getIncidents() : null;
                        if (incidents4 == null) {
                            incidents4 = km5.a;
                        }
                        List<Incident> list4 = incidents4;
                        TeamShirtColors homeShirtColors = eventIncidentsResponse3 != null ? eventIncidentsResponse3.getHomeShirtColors() : null;
                        TeamShirtColors awayShirtColors = eventIncidentsResponse3 != null ? eventIncidentsResponse3.getAwayShirtColors() : null;
                        gwf gwfVar = (homeShirtColors == null || awayShirtColors == null) ? null : new gwf(eventDetailsFragment.F(), homeShirtColors, awayShirtColors);
                        gy5 gy5Var = iy5Var.E;
                        boolean z4 = eventDetailsFragment.F().getCrowdsourcingEnabled() && (eventDetailsFragment.F().getCrowdsourcingDataDisplayEnabled() || eventDetailsFragment.F().getCrowdsourcingDataDisplayPermanent());
                        Event F4 = eventDetailsFragment.F();
                        Time time = F4.getTime();
                        yy9Var2.G(list4, gy5Var, gwfVar, z4, (time != null && (lastPeriodEndTimestamp = time.getLastPeriodEndTimestamp()) != null && Intrinsics.c(F4.getSportSlug(), Sports.FOOTBALL) && F4.getStatus().getCode() == 31 && me4.t(StatusKt.STATUS_IN_PROGRESS, F4)) ? lastPeriodEndTimestamp : null);
                    }
                }
                i = 0;
                if (!eventDetailsFragment.r) {
                }
                z3 = true;
                iy5Var.getClass();
                eventDetailsFragment.R(iy5Var);
                eventDetailsFragment.r = z3;
                return Unit.a;
            case 4:
                joa joaVar2 = eventDetailsFragment.L;
                String str = (String) obj;
                if (!eventDetailsFragment.G || eventDetailsFragment.H) {
                    eventDetailsFragment.G = true;
                    eventDetailsFragment.H = false;
                    bhi bhiVar = (bhi) joaVar2.getValue();
                    if (bhiVar != null) {
                        bhiVar.r(str, eventDetailsFragment.F());
                    }
                } else {
                    bhi bhiVar2 = (bhi) joaVar2.getValue();
                    if (bhiVar2 != null) {
                        str.getClass();
                        ale player = ((PlayerView) bhiVar2.f.l).getPlayer();
                        if (player != null) {
                            player.d();
                            b78 b78Var = new b78();
                            p5c p5cVar = new p5c(0);
                            List list5 = Collections.EMPTY_LIST;
                            av9 av9Var = hv9.b;
                            vvf vvfVar = vvf.e;
                            s5c s5cVar = new s5c();
                            z5c z5cVar = z5c.a;
                            Uri parse = Uri.parse(str);
                            parse.getClass();
                            if (((Uri) p5cVar.c) != null && ((UUID) p5cVar.b) == null) {
                                r6 = false;
                            }
                            z1a.E(r6);
                            player.l(new h6c("", new m5c(b78Var), new v5c(parse, null, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list5, null, vvfVar, C.TIME_UNSET), new u5c(s5cVar), q6c.D, z5cVar));
                            player.a();
                        }
                    }
                }
                return Unit.a;
            case 5:
                x2g x2gVar = (x2g) obj;
                if (x2gVar != null) {
                    boolean z5 = x2gVar instanceof v2g;
                    EventDetailsFragment eventDetailsFragment2 = this.b;
                    if (z5) {
                        xw3.L(wca.x(eventDetailsFragment2.getLifecycle()), null, null, new vx5(eventDetailsFragment2, x2gVar, new WeakReference(eventDetailsFragment2.requireActivity()), new WeakReference(eventDetailsFragment2), new WeakReference(eventDetailsFragment2.E), new WeakReference(eventDetailsFragment2.E()), null), 3);
                    } else {
                        w3f w3fVar = eventDetailsFragment2.E;
                        if (w3fVar != null) {
                            eventDetailsFragment2.E().k(w3fVar);
                        }
                    }
                }
                return Unit.a;
            case 6:
                joa joaVar3 = eventDetailsFragment.i0;
                Event event = (Event) eventDetailsFragment.D().v.d();
                if (event != null) {
                    if (ok3.D(event)) {
                        Time time2 = event.getTime();
                        if ((time2 != null ? time2.getStatusTime() : null) != null) {
                            d66 d66Var = (d66) eventDetailsFragment.h0.getValue();
                            if (d66Var != null) {
                                d66Var.setTime(event);
                            }
                            h4 h4Var = (h4) joaVar3.getValue();
                            if (h4Var != null) {
                                h4 h4Var2 = h4Var.getVisibility() == 0 ? h4Var : null;
                                if (h4Var2 != null) {
                                    h4Var2.setTimeSpecial(event);
                                }
                            }
                        }
                    }
                    h4 h4Var3 = (h4) joaVar3.getValue();
                    if (h4Var3 != null) {
                        h4 h4Var4 = h4Var3.getVisibility() == 0 ? h4Var3 : null;
                        if (h4Var4 != null) {
                            h4Var4.setTimeSpecial(event);
                        }
                    }
                }
                return Unit.a;
            case 7:
                zkd zkdVar = (zkd) obj;
                zkdVar.getClass();
                eventDetailsFragment.G().l(zkdVar);
                return Unit.a;
            case 8:
                Integer num = (Integer) obj;
                int intValue2 = num.intValue();
                iy5 iy5Var2 = (iy5) eventDetailsFragment.E().x.d();
                if (iy5Var2 != null && (map = iy5Var2.P) != null && (rm1Var = (rm1) map.get(num)) != null) {
                    Player player2 = rm1Var.a;
                    xoe xoeVar = new xoe(player2, null, null, player2.getPosition(), rm1Var.b, ok3.u(rm1Var.b.getId(), eventDetailsFragment.F()), null);
                    FragmentActivity activity = eventDetailsFragment.getActivity();
                    if (activity != null) {
                        PlayerEventStatisticsModal c = jpe.c(f8h.j(eventDetailsFragment.F(), a.c(xoeVar), intValue2, false, null, null, 56), null);
                        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                        if (appCompatActivity != null) {
                            me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                        }
                    }
                }
                return Unit.a;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals("SCORING")) {
                    String string = eventDetailsFragment.getString(R.string.ice_hockey_scoring);
                    string.getClass();
                    return string;
                }
                if (!str2.equals("PENALTIES")) {
                    return str2;
                }
                String string2 = eventDetailsFragment.getString(R.string.hockey_penalties_tab);
                string2.getClass();
                return string2;
            case 10:
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions2 = (MmaPostMatchVotingOptions) obj;
                mmaPostMatchVotingOptions2.getClass();
                ((jqc) eventDetailsFragment.C.getValue()).g(eventDetailsFragment.F(), mmaPostMatchVotingOptions2, "event_details", 1);
                return Unit.a;
            case 11:
                w3f w3fVar2 = (w3f) obj;
                w3fVar2.getClass();
                eventDetailsFragment.F = true;
                eventDetailsFragment.E = w3fVar2;
                Context requireContext = eventDetailsFragment.requireContext();
                requireContext.getClass();
                int id2 = eventDetailsFragment.F().getId();
                lv lvVar = lv.EVENT_DETAILS;
                y3f y3fVar = w3fVar2.b;
                List list6 = (List) eventDetailsFragment.E().g.d();
                nv.z(requireContext, id2, lvVar, y3fVar, (list6 != null ? list6.indexOf(w3fVar2) : 0) + 1);
                ia0 ia0Var = ia0.q;
                if (!mz1.C() || eventDetailsFragment.s) {
                    w3f w3fVar3 = eventDetailsFragment.E;
                    if (w3fVar3 != null) {
                        eventDetailsFragment.E().k(w3fVar3);
                    }
                } else {
                    Context requireContext2 = eventDetailsFragment.requireContext();
                    requireContext2.getClass();
                    zic.X(requireContext2, new ox5(eventDetailsFragment, 4));
                }
                return Unit.a;
            case 12:
                int intValue3 = ((Integer) obj).intValue();
                iy5 iy5Var3 = (iy5) eventDetailsFragment.E().x.d();
                if (iy5Var3 != null && (lineupsResponse = iy5Var3.o) != null) {
                    Iterator it3 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((PlayerData) obj2).getPlayer().getId() == intValue3) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    PlayerData playerData2 = (PlayerData) obj2;
                    if (playerData2 != null) {
                        Team H = eventDetailsFragment.H(intValue3, lineupsResponse);
                        FragmentActivity activity2 = eventDetailsFragment.getActivity();
                        if (activity2 != null) {
                            Event F5 = eventDetailsFragment.F();
                            Player player3 = playerData2.getPlayer();
                            int u = ok3.u(H.getId(), eventDetailsFragment.F());
                            PlayerEventStatistics statistics = playerData2.getStatistics();
                            PlayerEventStatisticsModal c2 = jpe.c(f8h.i(F5, player3, H, u, statistics != null ? statistics.getRating() : null, 96), null);
                            AppCompatActivity appCompatActivity2 = activity2 instanceof AppCompatActivity ? (AppCompatActivity) activity2 : null;
                            if (appCompatActivity2 != null) {
                                me4.n(c2, appCompatActivity2, null, wca.x(appCompatActivity2.getLifecycle()));
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                jwf jwfVar = (jwf) obj;
                jwfVar.getClass();
                int i9 = jwfVar.b;
                Player player4 = jwfVar.a;
                eventDetailsFragment.N(i9, Integer.valueOf(player4.getId()), player4);
                return Unit.a;
        }
    }
}
