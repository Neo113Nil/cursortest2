package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.ESportRound;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatistics;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGameStatistics;
import com.sofascore.model.newNetwork.EsportsGameStatisticsResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.games.EventEsportsGamesFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hz5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventEsportsGamesFragment b;

    public /* synthetic */ hz5(EventEsportsGamesFragment eventEsportsGamesFragment, int i) {
        this.a = i;
        this.b = eventEsportsGamesFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v29 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        TeamSides teamSides;
        ?? r15;
        mqi mqiVar;
        List<ESportRound> overtimeRounds;
        List<String> j;
        mqi mqiVar2;
        Object obj2;
        Object obj3;
        int i = this.a;
        EventEsportsGamesFragment eventEsportsGamesFragment = this.b;
        switch (i) {
            case 0:
                EsportsGame esportsGame = (EsportsGame) obj;
                esportsGame.getClass();
                int id = esportsGame.getId();
                Integer num = ((mr5) eventEsportsGamesFragment.s.getValue()).L;
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                IntRange h = b.h(list);
                ArrayList arrayList = new ArrayList(k13.r(h, 10));
                v6a it = h.iterator();
                while (it.c) {
                    arrayList.add(String.valueOf(it.nextInt() + 1));
                }
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) eventEsportsGamesFragment.u.getValue();
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    switch (str2.hashCode()) {
                        case 49:
                            if (str2.equals("1")) {
                                str = eventEsportsGamesFragment.getString(R.string.set_1_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 50:
                            if (str2.equals("2")) {
                                str = eventEsportsGamesFragment.getString(R.string.set_2_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 51:
                            if (str2.equals("3")) {
                                str = eventEsportsGamesFragment.getString(R.string.set_3_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 52:
                            if (str2.equals("4")) {
                                str = eventEsportsGamesFragment.getString(R.string.set_4_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 53:
                            if (str2.equals(CampaignEx.CLICKMODE_ON)) {
                                str = eventEsportsGamesFragment.getString(R.string.set_5_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 54:
                            if (str2.equals("6")) {
                                str = eventEsportsGamesFragment.getString(R.string.set_6_short);
                                break;
                            }
                            str = str2;
                            break;
                        case 55:
                            if (str2.equals(Fc.e)) {
                                str = eventEsportsGamesFragment.getString(R.string.set_7_short);
                                break;
                            }
                            str = str2;
                            break;
                        default:
                            str = str2;
                            break;
                    }
                    str.getClass();
                    arrayList2.add(new s1h(str2, str, true));
                }
                segmentedButtonsView.s(arrayList2, (String) CollectionsKt.a0(eventEsportsGamesFragment.F(), arrayList), true);
                break;
            default:
                mqi mqiVar3 = eventEsportsGamesFragment.w;
                mqi mqiVar4 = eventEsportsGamesFragment.y;
                mqi mqiVar5 = eventEsportsGamesFragment.v;
                mqi mqiVar6 = eventEsportsGamesFragment.x;
                kz5 kz5Var = (kz5) obj;
                EsportsGameStatisticsResponse esportsGameStatisticsResponse = kz5Var.a;
                if (esportsGameStatisticsResponse != null) {
                    ((dg5) mqiVar6.getValue()).setVisibility(0);
                    dg5 dg5Var = (dg5) mqiVar6.getValue();
                    EsportsGame E = eventEsportsGamesFragment.E();
                    Event D = eventEsportsGamesFragment.D();
                    List list2 = dg5Var.h;
                    List list3 = dg5Var.g;
                    dd ddVar = dg5Var.d;
                    int id2 = D.getTournament().getCategory().getId();
                    if (b.j(1571, 1570).contains(Integer.valueOf(id2))) {
                        dg5Var.setVisibility(0);
                        Integer homeTeamStartingSide$default = E != null ? EsportsGame.getHomeTeamStartingSide$default(E, null, 1, null) : null;
                        EsportsGameStatistics home$default = EsportsGameStatisticsResponse.getHome$default(esportsGameStatisticsResponse, null, 1, null);
                        EsportsGameStatistics away$default = EsportsGameStatisticsResponse.getAway$default(esportsGameStatisticsResponse, null, 1, null);
                        kp5 kp5Var = bg5.d;
                        bg5 bg5Var = (bg5) CollectionsKt.a0(homeTeamStartingSide$default != null ? homeTeamStartingSide$default.intValue() : -1, kp5Var);
                        int color = bg5Var != null ? dg5Var.getContext().getColor(bg5Var.a) : dg5Var.getContext().getColor(R.color.sofaPrimaryIndicator);
                        bg5 bg5Var2 = (bg5) CollectionsKt.a0(homeTeamStartingSide$default != null ? homeTeamStartingSide$default.intValue() : -1, kp5Var);
                        int color2 = bg5Var2 != null ? dg5Var.getContext().getColor(bg5Var2.b) : dg5Var.getContext().getColor(R.color.sofaPrimaryIndicator);
                        if (id2 == 1570) {
                            LinearLayout linearLayout = (LinearLayout) ddVar.c;
                            int i2 = dg5Var.f;
                            linearLayout.setPaddingRelative(i2, 0, i2, 0);
                            ((LinearLayout) ddVar.d).setPaddingRelative(i2, 0, i2, 0);
                            Object obj4 = list3.get(0);
                            obj4.getClass();
                            dg5Var.j((nq5) obj4, home$default.getBarracksDestroyed(), R.drawable.ic_dota2_barrack, color);
                            Object obj5 = list3.get(1);
                            obj5.getClass();
                            dg5Var.j((nq5) obj5, home$default.getTowersDestroyed(), R.drawable.ic_dota2_tower, color);
                            Object obj6 = list3.get(2);
                            obj6.getClass();
                            dg5Var.j((nq5) obj6, home$default.getKills(), R.drawable.ic_dota2_kills, color);
                            ((nq5) list3.get(3)).a.setVisibility(8);
                            Object obj7 = list2.get(0);
                            obj7.getClass();
                            dg5Var.j((nq5) obj7, away$default.getKills(), R.drawable.ic_dota2_kills, color2);
                            Object obj8 = list2.get(1);
                            obj8.getClass();
                            dg5Var.j((nq5) obj8, away$default.getTowersDestroyed(), R.drawable.ic_dota2_tower, color2);
                            Object obj9 = list2.get(2);
                            obj9.getClass();
                            dg5Var.j((nq5) obj9, away$default.getBarracksDestroyed(), R.drawable.ic_dota2_barrack, color2);
                            ((nq5) list2.get(3)).a.setVisibility(8);
                        } else if (id2 == 1571) {
                            LinearLayout linearLayout2 = (LinearLayout) ddVar.c;
                            int i3 = dg5Var.e;
                            linearLayout2.setPaddingRelative(i3, 0, i3, 0);
                            ((LinearLayout) ddVar.d).setPaddingRelative(i3, 0, i3, 0);
                            Object obj10 = list3.get(0);
                            obj10.getClass();
                            dg5Var.j((nq5) obj10, home$default.getElderDrakeKills(), R.drawable.ic_elder_dragon, color);
                            Object obj11 = list3.get(1);
                            obj11.getClass();
                            dg5Var.j((nq5) obj11, home$default.getNashorKills(), R.drawable.ic_lol_baron, color);
                            Object obj12 = list3.get(2);
                            obj12.getClass();
                            dg5Var.j((nq5) obj12, home$default.getInhibitorKills(), R.drawable.ic_lol_inhibitor, color);
                            Object obj13 = list3.get(3);
                            obj13.getClass();
                            dg5Var.j((nq5) obj13, home$default.getTowerKills(), R.drawable.ic_lol_turret, color);
                            Object obj14 = list2.get(0);
                            obj14.getClass();
                            dg5Var.j((nq5) obj14, away$default.getTowerKills(), R.drawable.ic_lol_turret, color2);
                            Object obj15 = list2.get(1);
                            obj15.getClass();
                            dg5Var.j((nq5) obj15, away$default.getInhibitorKills(), R.drawable.ic_lol_inhibitor, color2);
                            Object obj16 = list2.get(2);
                            obj16.getClass();
                            dg5Var.j((nq5) obj16, away$default.getNashorKills(), R.drawable.ic_lol_baron, color2);
                            Object obj17 = list2.get(3);
                            obj17.getClass();
                            dg5Var.j((nq5) obj17, away$default.getElderDrakeKills(), R.drawable.ic_elder_dragon, color2);
                        }
                    }
                    teamSides = null;
                    r15 = 1;
                    ((fg5) mqiVar5.getValue()).s(EsportsGameStatisticsResponse.getHome$default(esportsGameStatisticsResponse, null, 1, null), EsportsGameStatisticsResponse.getAway$default(esportsGameStatisticsResponse, null, 1, null));
                } else {
                    teamSides = null;
                    r15 = 1;
                }
                ((fg5) mqiVar5.getValue()).s(esportsGameStatisticsResponse != null ? EsportsGameStatisticsResponse.getHome$default(esportsGameStatisticsResponse, teamSides, r15, teamSides) : teamSides, esportsGameStatisticsResponse != null ? EsportsGameStatisticsResponse.getAway$default(esportsGameStatisticsResponse, teamSides, r15, teamSides) : teamSides);
                ESportsBansResponse eSportsBansResponse = kz5Var.d;
                if (eSportsBansResponse != null) {
                    cg5 cg5Var = (cg5) mqiVar4.getValue();
                    ez0 ez0Var = cg5Var.d;
                    List homeTeamBans$default = ESportsBansResponse.getHomeTeamBans$default(eSportsBansResponse, teamSides, r15, teamSides);
                    List awayTeamBans$default = ESportsBansResponse.getAwayTeamBans$default(eSportsBansResponse, teamSides, r15, teamSides);
                    if (!homeTeamBans$default.isEmpty() && !awayTeamBans$default.isEmpty()) {
                        cg5Var.setVisibility(0);
                        cg5.j(cg5Var.e, homeTeamBans$default, r15);
                        cg5.j(cg5Var.f, awayTeamBans$default, false);
                        int max = Math.max(homeTeamBans$default.size(), awayTeamBans$default.size());
                        if (r15 <= max && max < 4) {
                            ((ConstraintLayout) ((v82) ez0Var.c).b).setVisibility(0);
                            ((ConstraintLayout) ((v82) ez0Var.d).b).setVisibility(8);
                            ((ConstraintLayout) ((v82) ez0Var.e).b).setVisibility(8);
                        } else if (4 <= max && max < 7) {
                            ((ConstraintLayout) ((v82) ez0Var.c).b).setVisibility(0);
                            ((ConstraintLayout) ((v82) ez0Var.d).b).setVisibility(0);
                            ((ConstraintLayout) ((v82) ez0Var.e).b).setVisibility(8);
                        } else if (7 <= max && max < 10) {
                            ((ConstraintLayout) ((v82) ez0Var.c).b).setVisibility(0);
                            ((ConstraintLayout) ((v82) ez0Var.d).b).setVisibility(0);
                            ((ConstraintLayout) ((v82) ez0Var.e).b).setVisibility(0);
                        }
                    }
                }
                ESportsGameLineupsResponse eSportsGameLineupsResponse = kz5Var.b;
                if (eSportsGameLineupsResponse != null) {
                    int id3 = eventEsportsGamesFragment.D().getTournament().getCategory().getId();
                    EsportsGame E2 = eventEsportsGamesFragment.E();
                    Context requireContext = eventEsportsGamesFragment.requireContext();
                    requireContext.getClass();
                    Integer F = wnn.F(E2, requireContext);
                    EsportsGame E3 = eventEsportsGamesFragment.E();
                    Context requireContext2 = eventEsportsGamesFragment.requireContext();
                    requireContext2.getClass();
                    Integer D2 = wnn.D(E3, requireContext2);
                    eventEsportsGamesFragment.G();
                    if (id3 == 1570) {
                        String str3 = gg5.a;
                        j = b.j(PlayerKt.E_SPORTS_HARD_CARRY, PlayerKt.E_SPORTS_MID, PlayerKt.E_SPORTS_OFFLANER, PlayerKt.E_SPORTS_SOFT_SUPPORT, PlayerKt.E_SPORTS_HARD_SUPPORT);
                    } else if (id3 != 1571) {
                        j = km5.a;
                    } else {
                        String str4 = gg5.a;
                        j = b.j(PlayerKt.E_SPORTS_TOP, PlayerKt.E_SPORTS_JUN, PlayerKt.E_SPORTS_MID, PlayerKt.E_SPORTS_ADC, PlayerKt.E_SPORTS_SUP);
                    }
                    h31 h31Var = new h31(j, 1);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList U0 = CollectionsKt.U0(CollectionsKt.H0(ESportsGameLineupsResponse.getHomePlayers$default(eSportsGameLineupsResponse, null, 1, null), h31Var));
                    ArrayList U02 = CollectionsKt.U0(CollectionsKt.H0(ESportsGameLineupsResponse.getAwayPlayers$default(eSportsGameLineupsResponse, null, 1, null), h31Var));
                    for (String str5 : j) {
                        Iterator it3 = U0.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                ESportsGamePlayerStatistics eSportsGamePlayerStatistics = (ESportsGamePlayerStatistics) obj2;
                                String role = eSportsGamePlayerStatistics.getRole();
                                if (role == null) {
                                    role = eSportsGamePlayerStatistics.getPlayer().getPosition();
                                }
                                mqiVar2 = mqiVar3;
                                if (!Intrinsics.c(role, str5)) {
                                    mqiVar3 = mqiVar2;
                                }
                            } else {
                                mqiVar2 = mqiVar3;
                                obj2 = null;
                            }
                        }
                        ESportsGamePlayerStatistics eSportsGamePlayerStatistics2 = (ESportsGamePlayerStatistics) obj2;
                        if (eSportsGamePlayerStatistics2 != null) {
                            Iterator it4 = U02.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj3 = it4.next();
                                    ESportsGamePlayerStatistics eSportsGamePlayerStatistics3 = (ESportsGamePlayerStatistics) obj3;
                                    String role2 = eSportsGamePlayerStatistics3.getRole();
                                    if (role2 == null) {
                                        role2 = eSportsGamePlayerStatistics3.getPlayer().getPosition();
                                    }
                                    Iterator it5 = it4;
                                    if (!Intrinsics.c(role2, str5)) {
                                        it4 = it5;
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            ESportsGamePlayerStatistics eSportsGamePlayerStatistics4 = (ESportsGamePlayerStatistics) obj3;
                            if (eSportsGamePlayerStatistics4 != null) {
                                ArrayList arrayList4 = arrayList3;
                                ArrayList arrayList5 = U0;
                                arrayList4.add(new ESportsGamePlayerStatisticsRowData(F, D2, id3, eSportsGamePlayerStatistics2, eSportsGamePlayerStatistics4, true));
                                arrayList5.remove(eSportsGamePlayerStatistics2);
                                U02.remove(eSportsGamePlayerStatistics4);
                                arrayList3 = arrayList4;
                                U0 = arrayList5;
                            }
                        }
                        mqiVar3 = mqiVar2;
                    }
                    mqiVar = mqiVar3;
                    ArrayList arrayList6 = arrayList3;
                    ArrayList arrayList7 = U0;
                    Iterator it6 = arrayList7.iterator();
                    Iterator it7 = U02.iterator();
                    ArrayList arrayList8 = new ArrayList(Math.min(k13.r(arrayList7, 10), k13.r(U02, 10)));
                    while (it6.hasNext() && it7.hasNext()) {
                        arrayList8.add(new ESportsGamePlayerStatisticsRowData(F, D2, id3, (ESportsGamePlayerStatistics) it6.next(), (ESportsGamePlayerStatistics) it7.next(), false, 32, null));
                    }
                    arrayList6.addAll(arrayList8);
                    ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData = (ESportsGamePlayerStatisticsRowData) CollectionsKt.j0(arrayList6);
                    if (eSportsGamePlayerStatisticsRowData != null) {
                        eSportsGamePlayerStatisticsRowData.setHideDivider(true);
                    }
                    eventEsportsGamesFragment.C().F(arrayList6);
                } else {
                    mqiVar = mqiVar3;
                }
                ESportsGameRoundsResponse eSportsGameRoundsResponse = kz5Var.c;
                if (eSportsGameRoundsResponse != null) {
                    nd2 nd2Var = (nd2) mqiVar.getValue();
                    Event D3 = eventEsportsGamesFragment.D();
                    ez0 ez0Var2 = nd2Var.d;
                    List<ESportRound> normaltimeRounds = eSportsGameRoundsResponse.getNormaltimeRounds();
                    if (normaltimeRounds == null || !normaltimeRounds.isEmpty()) {
                        Iterator<T> it8 = normaltimeRounds.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                ESportRound eSportRound = (ESportRound) it8.next();
                                if (ESportRound.getHomeTeamSide$default(eSportRound, null, 1, null) != null) {
                                    if (ESportRound.getWinnerCode$default(eSportRound, null, 1, null) != null && eSportRound.getOutcome() != null) {
                                        Integer roundsInAHalf = eSportsGameRoundsResponse.getRoundsInAHalf();
                                        if (roundsInAHalf != null) {
                                            nd2Var.t = roundsInAHalf.intValue();
                                        }
                                        int i4 = nd2Var.t;
                                        nd2Var.u = i4 % 3 == 0 ? 3 : i4 % 5 == 0 ? 5 : -1;
                                        nd2Var.q = Event.getHomeTeam$default(D3, null, 1, null).getId();
                                        nd2Var.r = Event.getAwayTeam$default(D3, null, 1, null).getId();
                                        D3.shouldReverseTeams();
                                        nd2Var.p = eSportsGameRoundsResponse;
                                        nd2Var.setVisibility(0);
                                        ArrayList z0 = CollectionsKt.z0(eSportsGameRoundsResponse.getNormaltimeRounds(), new ESportRound[nd2Var.t * 2]);
                                        v82 v82Var = (v82) ez0Var2.c;
                                        v82 v82Var2 = (v82) ez0Var2.e;
                                        nd2Var.j(v82Var, CollectionsKt.L0(z0, nd2Var.t), false);
                                        nd2Var.j(v82Var2, CollectionsKt.L0(CollectionsKt.S(z0, nd2Var.t), nd2Var.t), false);
                                        ((TextView) v82Var.e).setText(nd2Var.getContext().getString(R.string.status_half, yid.p(1)));
                                        ((TextView) v82Var2.e).setText(nd2Var.getContext().getString(R.string.status_half, yid.p(2)));
                                        ((LinearLayout) ez0Var2.d).removeAllViews();
                                        ESportsGameRoundsResponse eSportsGameRoundsResponse2 = nd2Var.p;
                                        if (eSportsGameRoundsResponse2 != null && (overtimeRounds = eSportsGameRoundsResponse2.getOvertimeRounds()) != null && !overtimeRounds.isEmpty() && eSportsGameRoundsResponse2.getOvertimeChunkSize() != null) {
                                            List<ESportRound> overtimeRounds2 = eSportsGameRoundsResponse2.getOvertimeRounds();
                                            overtimeRounds2.getClass();
                                            Integer overtimeChunkSize = eSportsGameRoundsResponse2.getOvertimeChunkSize();
                                            overtimeChunkSize.getClass();
                                            nd2Var.n(overtimeChunkSize.intValue(), overtimeRounds2);
                                        }
                                        as9.o((ImageView) v82Var.g, nd2Var.q);
                                        as9.o((ImageView) v82Var.d, nd2Var.r);
                                        as9.o((ImageView) v82Var2.g, nd2Var.q);
                                        as9.o((ImageView) v82Var2.d, nd2Var.r);
                                    }
                                }
                            }
                        }
                    }
                }
                List j2 = b.j((dg5) mqiVar6.getValue(), (cg5) mqiVar4.getValue(), (nd2) mqiVar.getValue());
                if (j2 == null || !j2.isEmpty()) {
                    Iterator it9 = j2.iterator();
                    while (it9.hasNext()) {
                        if (((o8) it9.next()).getVisibility() == 0) {
                            ((fg5) mqiVar5.getValue()).setVisibility(0);
                            break;
                        }
                    }
                }
                if (eventEsportsGamesFragment.C().i.isEmpty()) {
                    ((GraphicLarge) eventEsportsGamesFragment.z.getValue()).setVisibility(0);
                }
                ((fg5) mqiVar5.getValue()).setVisibility(0);
                break;
        }
        return Unit.a;
    }
}
