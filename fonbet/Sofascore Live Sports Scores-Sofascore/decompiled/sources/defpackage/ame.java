package defpackage;

import com.sofascore.model.Country;
import com.sofascore.model.DateSection;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Partnership;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatisticSection;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.sofascore.model.newNetwork.TvEvent;
import com.sofascore.model.newNetwork.TvStageEvent;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ame extends f3 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ame(ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2);
        this.o = 10;
        arrayList.getClass();
    }

    @Override // defpackage.f3, defpackage.o02
    public boolean H(int i, int i2) {
        int i3 = this.o;
        ArrayList<Pair> arrayList = null;
        List list = this.n;
        List list2 = this.m;
        switch (i3) {
            case 0:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 1:
            case 3:
            case 17:
            default:
                return super.H(i, i2);
            case 2:
                Object obj = list2.get(i);
                Object obj2 = list.get(i2);
                if ((obj instanceof jei) && (obj2 instanceof jei)) {
                    return Intrinsics.c(((jei) obj).b, ((jei) obj2).b);
                }
                if ((obj instanceof CustomizableDivider) && (obj2 instanceof CustomizableDivider)) {
                    return true;
                }
                if ((obj instanceof EventStatisticsItem) && (obj2 instanceof EventStatisticsItem)) {
                    EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
                    EventStatisticsItem eventStatisticsItem2 = (EventStatisticsItem) obj2;
                    if (Intrinsics.c(EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getHome$default(eventStatisticsItem2, null, 1, null)) && Intrinsics.c(EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem2, null, 1, null)) && eventStatisticsItem.getOtherPlayerSelected() == eventStatisticsItem2.getOtherPlayerSelected()) {
                        return true;
                    }
                } else if ((obj instanceof String) && (obj2 instanceof String)) {
                    return obj.equals(obj2);
                }
                return false;
            case 4:
                Object obj3 = list2.get(i);
                Object obj4 = list.get(i2);
                if ((obj3 instanceof iei) && (obj4 instanceof iei)) {
                    List list3 = ((iei) obj3).b;
                    int size = list3.size();
                    List list4 = ((iei) obj4).b;
                    if (size == list4.size()) {
                        ArrayList Y0 = CollectionsKt.Y0(list3, list4);
                        if (list3.size() == list4.size() && Y0.size() == list3.size()) {
                            arrayList = Y0;
                        }
                        if (arrayList != null) {
                            if (arrayList.isEmpty()) {
                                return true;
                            }
                            for (Pair pair : arrayList) {
                                jei jeiVar = (jei) pair.a;
                                jei jeiVar2 = (jei) pair.b;
                                if (Intrinsics.c(jeiVar.a, jeiVar2.a) && Intrinsics.c(jeiVar.b, jeiVar2.a)) {
                                }
                            }
                            return true;
                        }
                    }
                } else if ((obj3 instanceof jei) && (obj4 instanceof jei)) {
                    jei jeiVar3 = (jei) obj3;
                    jei jeiVar4 = (jei) obj4;
                    if (Intrinsics.c(jeiVar3.b, jeiVar4.b) && jeiVar3.d == jeiVar4.d) {
                        return true;
                    }
                } else if ((obj3 instanceof CustomizableDivider) && (obj4 instanceof CustomizableDivider)) {
                    return true;
                }
                return false;
            case 5:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 6:
                w3f w3fVar = (w3f) list2.get(i);
                w3f w3fVar2 = (w3f) list.get(i2);
                return Intrinsics.c(w3fVar.g, w3fVar2.g) && w3fVar.m == w3fVar2.m && Intrinsics.c(w3fVar.d, w3fVar2.d) && Intrinsics.c(w3fVar.k, w3fVar2.k) && Intrinsics.c(w3fVar.f, w3fVar2.f) && Intrinsics.c(w3fVar.e, w3fVar2.e) && w3fVar.j == w3fVar2.j && w3fVar == w3fVar2;
            case 7:
                Object obj5 = list2.get(i);
                Object obj6 = list.get(i2);
                if ((obj5 instanceof PlayerSubscription) && (obj6 instanceof PlayerSubscription)) {
                    if (Intrinsics.c(((PlayerSubscription) obj5).getName(), ((PlayerSubscription) obj6).getName()) && uxf.E(r6.getUserCount(), 58, false).equals(uxf.E(r7.getUserCount(), 58, false))) {
                        return true;
                    }
                } else if ((obj5 instanceof TeamSubscription) && (obj6 instanceof TeamSubscription)) {
                    if (Intrinsics.c(((TeamSubscription) obj5).getName(), ((TeamSubscription) obj6).getName()) && uxf.E(r6.getUserCount(), 58, false).equals(uxf.E(r7.getUserCount(), 58, false))) {
                        return true;
                    }
                } else if ((obj5 instanceof UniqueTournamentSubscription) && (obj6 instanceof UniqueTournamentSubscription)) {
                    if (Intrinsics.c(((UniqueTournamentSubscription) obj5).getName(), ((UniqueTournamentSubscription) obj6).getName()) && uxf.E(r6.getUserCount(), 58, false).equals(uxf.E(r7.getUserCount(), 58, false))) {
                        return true;
                    }
                }
                return false;
            case 8:
                Object obj7 = list2.get(i);
                Object obj8 = list.get(i2);
                return (obj7 instanceof RefereeStatisticsItem) && (obj8 instanceof RefereeStatisticsItem) && ((RefereeStatisticsItem) obj7).getSelectedOrd() == ((RefereeStatisticsItem) obj8).getSelectedOrd();
            case 9:
                return Intrinsics.c(list.get(i2), list2.get(i));
            case 10:
                Object obj9 = list2.get(i);
                Object obj10 = list.get(i2);
                if (i == 0 || i >= list2.size() - 2) {
                    return false;
                }
                if (!(obj9 instanceof y21) || !(obj10 instanceof y21)) {
                    return (obj9 instanceof Transfer) && (obj10 instanceof Transfer);
                }
                y21 y21Var = (y21) obj10;
                y21 y21Var2 = (y21) obj9;
                y21Var.E = y21Var2.E;
                y21Var.F = y21Var2.F;
                return obj9.equals(obj10);
            case 11:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 12:
                Object obj11 = list2.get(i);
                Object obj12 = list.get(i2);
                if ((obj11 instanceof Stage) && (obj12 instanceof Stage)) {
                    return false;
                }
                if ((obj11 instanceof String) && (obj12 instanceof String)) {
                    return obj11.equals(obj12);
                }
                if ((obj11 instanceof r7i) && (obj12 instanceof r7i)) {
                    return Intrinsics.c(((r7i) obj11).a.getStatus(), ((r7i) obj12).a.getStatus());
                }
                if ((obj11 instanceof q7i) && (obj12 instanceof q7i)) {
                    return obj11.equals(obj12);
                }
                return false;
            case 13:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 14:
                return Intrinsics.c(((i8i) list2.get(i)).b, ((i8i) list.get(i2)).b);
            case 15:
                Object obj13 = list2.get(i);
                Object obj14 = list.get(i2);
                if (!(obj13 instanceof x9i) || !(obj14 instanceof x9i)) {
                    return Intrinsics.c(obj13, obj14);
                }
                x9i x9iVar = (x9i) obj13;
                x9i x9iVar2 = (x9i) obj14;
                return Intrinsics.c(x9iVar.c, x9iVar2.c) && x9iVar.h == x9iVar2.h;
            case 16:
                Object obj15 = list2.get(i);
                Object obj16 = list.get(i2);
                if ((obj15 instanceof EventStatisticsItem) && (obj16 instanceof EventStatisticsItem)) {
                    EventStatisticsItem eventStatisticsItem3 = (EventStatisticsItem) obj15;
                    EventStatisticsItem eventStatisticsItem4 = (EventStatisticsItem) obj16;
                    if (Intrinsics.c(eventStatisticsItem3.getName(), eventStatisticsItem4.getName()) && Intrinsics.c(EventStatisticsItem.getHome$default(eventStatisticsItem3, null, 1, null), EventStatisticsItem.getHome$default(eventStatisticsItem4, null, 1, null)) && Intrinsics.c(EventStatisticsItem.getAway$default(eventStatisticsItem3, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem4, null, 1, null)) && eventStatisticsItem3.getHideDivider() == eventStatisticsItem4.getHideDivider()) {
                        return true;
                    }
                } else if ((obj15 instanceof StatisticSection) && (obj16 instanceof StatisticSection)) {
                    StatisticSection statisticSection = (StatisticSection) obj15;
                    StatisticSection statisticSection2 = (StatisticSection) obj16;
                    if (Intrinsics.c(statisticSection.getName(), statisticSection2.getName()) && statisticSection.getIsCardStart() == statisticSection2.getIsCardStart()) {
                        return true;
                    }
                } else {
                    if ((obj15 instanceof db6) && (obj16 instanceof db6)) {
                        return Intrinsics.c(((db6) obj15).a, ((db6) obj16).a);
                    }
                    if (!(obj15 instanceof CustomizableDivider) || !(obj16 instanceof CustomizableDivider)) {
                        if ((obj15 instanceof ml8) && (obj16 instanceof ml8)) {
                            return true;
                        }
                        if ((obj15 instanceof b56) && (obj16 instanceof b56)) {
                            return true;
                        }
                        if ((obj15 instanceof ie9) && (obj16 instanceof ie9) && ((ie9) obj15).a == ((ie9) obj16).a) {
                            return true;
                        }
                    } else if (((CustomizableDivider) obj15).getDividerVisible() == ((CustomizableDivider) obj16).getDividerVisible()) {
                        return true;
                    }
                }
                return false;
            case 18:
                o2j o2jVar = (o2j) list2.get(i);
                o2j o2jVar2 = (o2j) list.get(i2);
                return o2jVar.b == o2jVar2.b && Intrinsics.c(o2jVar.a.getValue(), o2jVar2.a.getValue());
            case 19:
                ud6 ud6Var = (ud6) list2.get(i);
                ud6 ud6Var2 = (ud6) list.get(i2);
                return ud6Var.a == ud6Var2.a && Intrinsics.c(ud6Var.c, ud6Var2.c);
            case 20:
                Object obj17 = list2.get(i);
                Object obj18 = list.get(i2);
                if (((obj17 instanceof fmj) && (obj18 instanceof fmj)) || (((obj17 instanceof noj) && (obj18 instanceof noj)) || ((obj17 instanceof loj) && (obj18 instanceof loj)))) {
                    return Intrinsics.c(obj17, obj18);
                }
                return false;
            case 21:
                vd6 vd6Var = (vd6) list2.get(i);
                vd6 vd6Var2 = (vd6) list.get(i2);
                return Intrinsics.c(vd6Var.c, vd6Var2.c) && Intrinsics.c(vd6Var.d, vd6Var2.d);
            case 22:
                Object obj19 = list2.get(i);
                Object obj20 = list.get(i2);
                if ((obj19 instanceof Country) && (obj20 instanceof Country)) {
                    return true;
                }
                if ((obj19 instanceof CustomizableDivider) && (obj20 instanceof CustomizableDivider)) {
                    return obj19.equals(obj20);
                }
                return false;
        }
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        pzh pzhVar;
        int i3 = this.o;
        List list = this.n;
        List list2 = this.m;
        switch (i3) {
            case 0:
                zle zleVar = (zle) list2.get(i);
                zle zleVar2 = (zle) list.get(i2);
                if (!(zleVar instanceof xle) || !(zleVar2 instanceof xle)) {
                    if (!(zleVar instanceof yle) || !(zleVar2 instanceof yle)) {
                        if ((zleVar instanceof ule) && (zleVar2 instanceof ule)) {
                            if (((ule) zleVar).b.getId() != ((ule) zleVar2).b.getId()) {
                            }
                        } else if (zleVar.getClass() != zleVar2.getClass()) {
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                Object obj = list2.get(i);
                Object obj2 = list.get(i2);
                if (!(obj instanceof nvj) || !(obj2 instanceof nvj)) {
                    if (!(obj instanceof Transfer) || !(obj2 instanceof Transfer)) {
                        if ((obj instanceof String) && (obj2 instanceof String)) {
                            break;
                        } else if ((obj instanceof NationalTeamStatisticsData) && (obj2 instanceof NationalTeamStatisticsData)) {
                            if (((NationalTeamStatisticsData) obj).getTeam().getId() != ((NationalTeamStatisticsData) obj2).getTeam().getId()) {
                            }
                        } else if (!(obj instanceof CustomizableDivider) || !(obj2 instanceof CustomizableDivider)) {
                        }
                    } else if (((Transfer) obj).getId() != ((Transfer) obj2).getId()) {
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                Object obj3 = list2.get(i);
                Object obj4 = list.get(i2);
                if (!(obj3 instanceof jei) || !(obj4 instanceof jei)) {
                    if (!(obj3 instanceof EventStatisticsItem) || !(obj4 instanceof EventStatisticsItem)) {
                        if (!(obj3 instanceof CustomizableDivider) || !(obj4 instanceof CustomizableDivider)) {
                            if ((obj3 instanceof String) && (obj4 instanceof String)) {
                                break;
                            }
                        } else if (i == i2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                Object obj5 = list2.get(i);
                Object obj6 = list.get(i2);
                if (!(obj5 instanceof j2f) || !(obj6 instanceof j2f)) {
                    if ((obj5 instanceof CustomizableDivider) && (obj6 instanceof CustomizableDivider)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 4:
                Object obj7 = list2.get(i);
                Object obj8 = list.get(i2);
                if (!(obj7 instanceof iei) || !(obj8 instanceof iei)) {
                    if (!(obj7 instanceof jei) || !(obj8 instanceof jei)) {
                        if (((obj7 instanceof CustomizableDivider) && (obj8 instanceof CustomizableDivider)) || ((obj7 instanceof j29) && (obj8 instanceof j29))) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 5:
                cze czeVar = (cze) list2.get(i);
                cze czeVar2 = (cze) list.get(i2);
                if ((czeVar instanceof aze) && (czeVar2 instanceof aze)) {
                    if (((aze) czeVar).a != ((aze) czeVar2).a) {
                    }
                } else if ((czeVar instanceof zye) && (czeVar2 instanceof zye)) {
                    zye zyeVar = (zye) czeVar;
                    zye zyeVar2 = (zye) czeVar2;
                    if (!zyeVar.a.equals(zyeVar2.a) || !zyeVar.b.equals(zyeVar2.b)) {
                    }
                } else if ((czeVar instanceof bze) && (czeVar2 instanceof bze)) {
                    bze bzeVar = (bze) czeVar;
                    bze bzeVar2 = (bze) czeVar2;
                    if (!bzeVar.b.equals(bzeVar2.b) || !bzeVar.c.equals(bzeVar2.c)) {
                    }
                }
                break;
            case 6:
                if (((w3f) list2.get(i)).b == ((w3f) list.get(i2)).b) {
                    break;
                }
                break;
            case 7:
                Object obj9 = list2.get(i);
                Object obj10 = list.get(i2);
                if ((obj9 instanceof PlayerSubscription) && (obj10 instanceof PlayerSubscription)) {
                    if (((PlayerSubscription) obj9).getId() != ((PlayerSubscription) obj10).getId()) {
                    }
                } else if ((obj9 instanceof TeamSubscription) && (obj10 instanceof TeamSubscription)) {
                    if (((TeamSubscription) obj9).getId() != ((TeamSubscription) obj10).getId()) {
                    }
                } else if ((obj9 instanceof UniqueTournamentSubscription) && (obj10 instanceof UniqueTournamentSubscription)) {
                    if (((UniqueTournamentSubscription) obj9).getId() != ((UniqueTournamentSubscription) obj10).getId()) {
                    }
                } else if (!(obj9 instanceof wm5) || !(obj10 instanceof wm5)) {
                }
                break;
            case 8:
                Object obj11 = list2.get(i);
                Object obj12 = list.get(i2);
                if ((obj11 instanceof RefereeStatisticsItem) && (obj12 instanceof RefereeStatisticsItem)) {
                    if (((RefereeStatisticsItem) obj11).getUniqueTournament().getId() != ((RefereeStatisticsItem) obj12).getUniqueTournament().getId()) {
                    }
                } else if (!(obj11 instanceof atf) || !(obj12 instanceof atf)) {
                }
                break;
            case 9:
                Object obj13 = list2.get(i);
                Object obj14 = list.get(i2);
                if ((obj13 instanceof lt1) && (obj14 instanceof lt1)) {
                    lt1 lt1Var = (lt1) obj13;
                    lt1 lt1Var2 = (lt1) obj14;
                    if (lt1Var.c.getPlayer().getId() != lt1Var2.c.getPlayer().getId() || lt1Var.a != lt1Var2.a) {
                    }
                } else if ((obj13 instanceof y02) && (obj14 instanceof y02)) {
                    y02 y02Var = (y02) obj13;
                    y02 y02Var2 = (y02) obj14;
                    if (y02Var.c.getPlayer().getId() != y02Var2.c.getPlayer().getId() || y02Var.a != y02Var2.a) {
                    }
                } else if ((obj13 instanceof c6l) && (obj14 instanceof c6l)) {
                    if (((c6l) obj13).b.getPlayer().getId() != ((c6l) obj14).b.getPlayer().getId()) {
                    }
                } else if (!(obj13 instanceof fae) || !(obj14 instanceof fae)) {
                    if ((obj13 instanceof vej) && (obj14 instanceof vej)) {
                        break;
                    } else if ((!(obj13 instanceof pt1) || !(obj14 instanceof pt1)) && ((!(obj13 instanceof it1) || !(obj14 instanceof it1)) && ((!(obj13 instanceof x04) || !(obj14 instanceof x04)) && ((!(obj13 instanceof y04) || !(obj14 instanceof y04)) && ((!(obj13 instanceof z04) || !(obj14 instanceof z04)) && (!(obj13 instanceof b14) || !(obj14 instanceof b14))))))) {
                    }
                } else {
                    Partnership partnership = ((fae) obj13).b;
                    int id = partnership.getPlayer1().getId();
                    Partnership partnership2 = ((fae) obj14).b;
                    if (id != partnership2.getPlayer1().getId() || partnership.getPlayer2().getId() != partnership2.getPlayer2().getId()) {
                    }
                }
                break;
            case 10:
                Object obj15 = list2.get(i);
                Object obj16 = list.get(i2);
                if ((obj15 instanceof Event) && (obj16 instanceof Event)) {
                    if (((Event) obj15).getId() != ((Event) obj16).getId()) {
                    }
                } else if ((obj15 instanceof y21) && (obj16 instanceof y21)) {
                    if (((y21) obj15).d().getId() != ((y21) obj16).d().getId()) {
                    }
                } else if ((obj15 instanceof Tournament) && (obj16 instanceof Tournament)) {
                    if (((Tournament) obj15).getId() != ((Tournament) obj16).getId()) {
                    }
                } else if ((obj15 instanceof lrj) && (obj16 instanceof lrj)) {
                    Tournament tournament = ((lrj) obj15).a;
                    UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                    Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                    Tournament tournament2 = ((lrj) obj16).a;
                    UniqueTournament uniqueTournament2 = tournament2.getUniqueTournament();
                    if (!Intrinsics.c(valueOf, uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null) || tournament.getId() != tournament2.getId() || !z0(i, i2)) {
                    }
                } else if (!(obj15 instanceof Round) || !(obj16 instanceof Round)) {
                    if (!(obj15 instanceof zeb) || !(obj16 instanceof zeb)) {
                        if ((obj15 instanceof DateSection) && (obj16 instanceof DateSection)) {
                            DateSection dateSection = (DateSection) obj15;
                            DateSection dateSection2 = (DateSection) obj16;
                            if (dateSection.getTimestamp() == dateSection2.getTimestamp()) {
                                if (dateSection.getText() != null || dateSection2.getText() != null) {
                                    if (dateSection.getText() != null && dateSection2.getText() != null) {
                                        break;
                                    }
                                }
                            }
                        } else if (!(obj15 instanceof xs2) || !(obj16 instanceof xs2)) {
                            if ((obj15 instanceof nak) && (obj16 instanceof nak)) {
                                if (((nak) obj15).a.getId() != ((nak) obj16).a.getId()) {
                                }
                            } else if ((obj15 instanceof m5i) && (obj16 instanceof m5i)) {
                                if (((m5i) obj15).a.getId() != ((m5i) obj16).a.getId()) {
                                }
                            } else if (!(obj15 instanceof String) || !(obj16 instanceof String)) {
                                if (!(obj15 instanceof Transfer) || !(obj16 instanceof Transfer)) {
                                    if ((obj15 instanceof CustomizableDivider) && (obj16 instanceof CustomizableDivider)) {
                                        break;
                                    } else if ((!(obj15 instanceof j29) || !(obj16 instanceof j29)) && (obj15 != (pzhVar = pzh.d) || obj16 != pzhVar)) {
                                        if (!(obj15 instanceof m32) || !(obj16 instanceof m32)) {
                                            if (!(obj15 instanceof dhe) || !(obj16 instanceof dhe)) {
                                                if (!(obj15 instanceof krj) || !(obj16 instanceof krj)) {
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else if (((m32) obj15).a.getId() != ((m32) obj16).a.getId()) {
                                        }
                                    }
                                } else if (((Transfer) obj15).getId() != ((Transfer) obj16).getId()) {
                                }
                            }
                        }
                    }
                } else {
                    Round round = (Round) obj15;
                    Round round2 = (Round) obj16;
                    if (round.getName() == null && round2.getName() == null) {
                        if (!Intrinsics.c(round.getRound(), round2.getRound()) || !z0(i, i2)) {
                        }
                    } else if (round.getName() == null || round2.getName() == null || !Intrinsics.c(round.getName(), round2.getName()) || !z0(i, i2)) {
                    }
                }
                break;
            case 11:
                Object obj17 = list2.get(i);
                Object obj18 = list.get(i2);
                if ((obj17 instanceof d7i) && (obj18 instanceof d7i)) {
                    if (((d7i) obj17).a.getId() != ((d7i) obj18).a.getId()) {
                    }
                } else if (!(obj17 instanceof c7i) || !(obj18 instanceof c7i) || ((c7i) obj17).a.getId() != ((c7i) obj18).a.getId()) {
                }
                break;
            case 12:
                Object obj19 = list2.get(i);
                Object obj20 = list.get(i2);
                if (!(obj19 instanceof Stage) || !(obj20 instanceof Stage)) {
                    if ((obj19 instanceof String) && (obj20 instanceof String)) {
                        break;
                    } else if ((obj19 instanceof r7i) && (obj20 instanceof r7i)) {
                        if (((r7i) obj19).a.getId() != ((r7i) obj20).a.getId()) {
                        }
                    } else if (!(obj19 instanceof q7i) || !(obj20 instanceof q7i) || ((q7i) obj19).a.getId() != ((q7i) obj20).a.getId()) {
                    }
                } else if (((Stage) obj19).getId() != ((Stage) obj20).getId()) {
                }
                break;
            case 13:
                z7i z7iVar = (z7i) list2.get(i);
                z7i z7iVar2 = (z7i) list.get(i2);
                if (!(z7iVar instanceof y7i) || !(z7iVar2 instanceof y7i)) {
                    if (!(z7iVar instanceof w7i) || !(z7iVar2 instanceof w7i)) {
                        break;
                    } else {
                        break;
                    }
                } else if (((y7i) z7iVar).a.a.getTeam().getId() == ((y7i) z7iVar2).a.a.getTeam().getId()) {
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                Object obj21 = list2.get(i);
                Object obj22 = list.get(i2);
                if ((obj21 instanceof ebi) && (obj22 instanceof ebi)) {
                    if (((ebi) obj21).a != ((ebi) obj22).a) {
                    }
                } else if ((obj21 instanceof wai) && (obj22 instanceof wai)) {
                    if (((wai) obj21).a != ((wai) obj22).a) {
                    }
                } else if ((obj21 instanceof x9i) && (obj22 instanceof x9i)) {
                    if (((x9i) obj21).a != ((x9i) obj22).a) {
                    }
                } else if ((obj21 instanceof bbi) && (obj22 instanceof bbi)) {
                    bbi bbiVar = (bbi) obj21;
                    bbi bbiVar2 = (bbi) obj22;
                    if (bbiVar.a != bbiVar2.a || bbiVar.c.getId() != bbiVar2.c.getId()) {
                    }
                } else if ((obj21 instanceof tai) && (obj22 instanceof tai)) {
                    if (((tai) obj21).f != ((tai) obj22).f) {
                    }
                } else if (!(obj21 instanceof bai) || !(obj22 instanceof bai)) {
                }
                break;
            case 16:
                Object obj23 = list2.get(i);
                Object obj24 = list.get(i2);
                if (!(obj23 instanceof EventStatisticsItem) || !(obj24 instanceof EventStatisticsItem)) {
                    if (!(obj23 instanceof StatisticSection) || !(obj24 instanceof StatisticSection)) {
                        if (((obj23 instanceof db6) && (obj24 instanceof db6)) || (((obj23 instanceof CustomizableDivider) && (obj24 instanceof CustomizableDivider)) || (((obj23 instanceof gc6) && (obj24 instanceof gc6)) || (((obj23 instanceof ml8) && (obj24 instanceof ml8)) || (((obj23 instanceof b56) && (obj24 instanceof b56)) || ((obj23 instanceof ie9) && (obj24 instanceof ie9))))))) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 17:
                Object obj25 = list2.get(i);
                Object obj26 = list.get(i2);
                if ((obj25 instanceof TvEvent) && (obj26 instanceof TvEvent)) {
                    if (((TvEvent) obj25).getEvent().getId() != ((TvEvent) obj26).getEvent().getId()) {
                    }
                } else if (!(obj25 instanceof TvStageEvent) || !(obj26 instanceof TvStageEvent) || ((TvStageEvent) obj25).getStage().getId() != ((TvStageEvent) obj26).getStage().getId()) {
                }
                break;
            case 18:
                o2j o2jVar = (o2j) list2.get(i);
                o2j o2jVar2 = (o2j) list.get(i2);
                if (Intrinsics.c(o2jVar.a.getStreakName(), o2jVar2.a.getStreakName()) && o2jVar.a.getTeam().getId() == o2jVar2.a.getTeam().getId()) {
                    break;
                }
                break;
            case 19:
                if (((ud6) list2.get(i)).b.getId() == ((ud6) list.get(i2)).b.getId()) {
                    break;
                }
                break;
            case 20:
                Object obj27 = list2.get(i);
                Object obj28 = list.get(i2);
                if ((obj27 instanceof fmj) && (obj28 instanceof fmj)) {
                    fmj fmjVar = (fmj) obj27;
                    fmj fmjVar2 = (fmj) obj28;
                    if (fmjVar.a.getId() != fmjVar2.a.getId() || !Intrinsics.c(fmjVar.d.a, fmjVar2.d.a)) {
                    }
                } else if ((obj27 instanceof noj) && (obj28 instanceof noj)) {
                    noj nojVar = (noj) obj27;
                    noj nojVar2 = (noj) obj28;
                    if (nojVar.a.getId() != nojVar2.a.getId() || !Intrinsics.c(nojVar.b.a, nojVar2.b.a)) {
                    }
                } else if (!(obj27 instanceof loj) || !(obj28 instanceof loj)) {
                    if ((obj27 instanceof rlj) && (obj28 instanceof rlj)) {
                        break;
                    } else if (!(obj27 instanceof CustomizableDivider) || !(obj28 instanceof CustomizableDivider)) {
                    }
                } else {
                    loj lojVar = (loj) obj27;
                    loj lojVar2 = (loj) obj28;
                    if (lojVar.a.getId() != lojVar2.a.getId() || lojVar.b.getId() != lojVar2.b.getId()) {
                    }
                }
                break;
            case 21:
                if (((vd6) list2.get(i)).a.getId() == ((vd6) list.get(i2)).a.getId()) {
                    break;
                }
                break;
            default:
                Object obj29 = list2.get(i);
                Object obj30 = list.get(i2);
                if (!(obj29 instanceof Country) || !(obj30 instanceof Country)) {
                    if ((obj29 instanceof CustomizableDivider) && (obj30 instanceof CustomizableDivider)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.f3, defpackage.o02
    public Object R(int i, int i2) {
        switch (this.o) {
            case 9:
                return this.n.get(i2);
            case 15:
                return this.n.get(i2);
            case 16:
                return this.n.get(i2);
            default:
                return super.R(i, i2);
        }
    }

    public boolean z0(int i, int i2) {
        int i3;
        int i4 = i + 1;
        List list = this.m;
        int size = list.size();
        List list2 = this.n;
        return (i4 >= size || (i3 = i2 + 1) >= list2.size()) ? i4 == list.size() && i2 + 1 == list2.size() : I(i4, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ame(List list, List list2, int i) {
        super(list, list2);
        this.o = i;
    }
}
