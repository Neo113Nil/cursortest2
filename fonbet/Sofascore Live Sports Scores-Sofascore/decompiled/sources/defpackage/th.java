package defpackage;

import com.sofascore.model.DateSection;
import com.sofascore.model.Section;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.MissingPlayersPair;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.bettingtips.BetBoost;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.ProviderOdds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class th extends f3 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2);
        this.o = 13;
        arrayList.getClass();
    }

    @Override // defpackage.f3, defpackage.o02
    public boolean H(int i, int i2) {
        ArrayList arrayList;
        ProviderOdds featuredOdds;
        List<OddsChoice> choicesReversible;
        ProviderOdds featuredOdds2;
        List<OddsChoice> choicesReversible2;
        int i3 = this.o;
        ArrayList arrayList2 = null;
        List list = this.n;
        List list2 = this.m;
        switch (i3) {
            case 0:
                return Intrinsics.c(list.get(i2), list2.get(i));
            case 1:
                iu1 iu1Var = (iu1) list2.get(i);
                iu1 iu1Var2 = (iu1) list.get(i2);
                if ((iu1Var instanceof fu1) && (iu1Var2 instanceof fu1)) {
                    EventBetBoost eventBetBoost = ((fu1) iu1Var).a;
                    List<BetBoost> betBoosts = eventBetBoost.getBetBoosts();
                    EventBetBoost eventBetBoost2 = ((fu1) iu1Var2).a;
                    if (!Intrinsics.c(betBoosts, eventBetBoost2.getBetBoosts()) || Event.getHomeTeam$default(eventBetBoost.getEvent(), null, 1, null).getId() != Event.getHomeTeam$default(eventBetBoost2.getEvent(), null, 1, null).getId() || Event.getAwayTeam$default(eventBetBoost.getEvent(), null, 1, null).getId() != Event.getAwayTeam$default(eventBetBoost2.getEvent(), null, 1, null).getId() || eventBetBoost.getEvent().getStartTimestamp() != eventBetBoost2.getEvent().getStartTimestamp()) {
                        return false;
                    }
                } else if ((!(iu1Var instanceof gu1) || !(iu1Var2 instanceof gu1)) && (!(iu1Var instanceof hu1) || !(iu1Var2 instanceof hu1))) {
                    return false;
                }
                return true;
            case 2:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 3:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 4:
            case 5:
            case 7:
            case 10:
            case 13:
            case 15:
            case 20:
            default:
                return super.H(i, i2);
            case 6:
                return Intrinsics.c(list2.get(i), list.get(i2)) && Intrinsics.c(CollectionsKt.a0(i + 1, list2), CollectionsKt.a0(i2 + 1, list));
            case 8:
                return Intrinsics.c(((td6) list2.get(i)).c, ((td6) list.get(i2)).c);
            case 9:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 11:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 12:
                Object obj = list2.get(i);
                Object obj2 = list.get(i2);
                if ((obj instanceof lrj) && (obj2 instanceof lrj)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof j04) && (obj2 instanceof j04)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof CustomizableDivider) && (obj2 instanceof CustomizableDivider)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof ei6) && (obj2 instanceof ei6)) {
                    return obj.equals(obj2);
                }
                if ((obj instanceof m32) && (obj2 instanceof m32)) {
                    return obj.equals(obj2);
                }
                return false;
            case 14:
                Object obj3 = list2.get(i);
                Object obj4 = list.get(i2);
                if ((obj3 instanceof String) && (obj4 instanceof String)) {
                    return obj3.equals(obj4);
                }
                if (!(obj3 instanceof iv7) || !(obj4 instanceof iv7)) {
                    return false;
                }
                iv7 iv7Var = (iv7) obj3;
                Event event = iv7Var.a;
                iv7 iv7Var2 = (iv7) obj4;
                Event event2 = iv7Var2.a;
                if (!Intrinsics.c(Event.getHomeTeam$default(event, null, 1, null).getName(), Event.getHomeTeam$default(event2, null, 1, null).getName()) || !Intrinsics.c(Event.getAwayTeam$default(event, null, 1, null).getName(), Event.getAwayTeam$default(event2, null, 1, null).getName()) || !Intrinsics.c(Event.getHomeScore$default(event, null, 1, null), Event.getHomeScore$default(event2, null, 1, null)) || !Intrinsics.c(Event.getAwayScore$default(event, null, 1, null), Event.getAwayScore$default(event2, null, 1, null)) || !Intrinsics.c(event.getTime(), event2.getTime()) || event.getStartTimestamp() != event2.getStartTimestamp() || !Intrinsics.c(event.getStatus(), event2.getStatus()) || !Intrinsics.c(event.getStatusDescription(), event2.getStatusDescription())) {
                    return false;
                }
                FeaturedOddsWithProvider featuredOddsWithProvider = iv7Var.b;
                if (featuredOddsWithProvider == null || (featuredOdds2 = featuredOddsWithProvider.getFeaturedOdds()) == null || (choicesReversible2 = featuredOdds2.getChoicesReversible()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(k13.r(choicesReversible2, 10));
                    Iterator<T> it = choicesReversible2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((OddsChoice) it.next()).getFractionalValue());
                    }
                }
                FeaturedOddsWithProvider featuredOddsWithProvider2 = iv7Var2.b;
                if (featuredOddsWithProvider2 != null && (featuredOdds = featuredOddsWithProvider2.getFeaturedOdds()) != null && (choicesReversible = featuredOdds.getChoicesReversible()) != null) {
                    arrayList2 = new ArrayList(k13.r(choicesReversible, 10));
                    Iterator<T> it2 = choicesReversible.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((OddsChoice) it2.next()).getFractionalValue());
                    }
                }
                return Intrinsics.c(arrayList, arrayList2);
            case 16:
                EventStreak eventStreak = (EventStreak) list2.get(i);
                EventStreak eventStreak2 = (EventStreak) list.get(i2);
                return Event.getHomeTeam$default(eventStreak.getEvent(), null, 1, null).getId() == Event.getHomeTeam$default(eventStreak2.getEvent(), null, 1, null).getId() && Event.getAwayTeam$default(eventStreak.getEvent(), null, 1, null).getId() == Event.getAwayTeam$default(eventStreak2.getEvent(), null, 1, null).getId() && eventStreak.getEvent().getStartTimestamp() == eventStreak2.getEvent().getStartTimestamp() && Intrinsics.c(eventStreak.getStreak().getValue(), eventStreak2.getStreak().getValue());
            case 17:
                return Intrinsics.c(CollectionsKt.a0(i, list2), CollectionsKt.a0(i2, list));
            case 18:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 19:
                iz9 iz9Var = (iz9) list2.get(i);
                iz9 iz9Var2 = (iz9) list.get(i2);
                return Intrinsics.c(iz9Var, iz9Var2) && iz9Var.a == iz9Var2.a && iz9Var.b == iz9Var2.b;
            case 21:
                return Intrinsics.c((t56) list.get(i2), (t56) list2.get(i));
            case 22:
                return ((r5c) list2.get(i)).c == ((r5c) list.get(i2)).c;
            case 23:
                return Intrinsics.c((qlc) list2.get(i), (qlc) list.get(i2));
            case 24:
                return Intrinsics.c(list.get(i2), list2.get(i));
            case 25:
                Object obj5 = list2.get(i);
                Object obj6 = list.get(i2);
                if (!(obj5 instanceof MmaEvent) || !(obj6 instanceof MmaEvent)) {
                    return false;
                }
                Event event3 = (Event) obj5;
                Event event4 = (Event) obj6;
                if (!Intrinsics.c(Event.getHomeTeam$default(event3, null, 1, null).getName(), Event.getHomeTeam$default(event4, null, 1, null).getName()) || !Intrinsics.c(Event.getAwayTeam$default(event3, null, 1, null).getName(), Event.getAwayTeam$default(event4, null, 1, null).getName())) {
                    return false;
                }
                MmaEvent mmaEvent = (MmaEvent) obj5;
                MmaEvent mmaEvent2 = (MmaEvent) obj6;
                return mmaEvent.getStartTimestamp() == mmaEvent2.getStartTimestamp() && Intrinsics.c(mmaEvent.getStatus(), mmaEvent2.getStatus()) && Intrinsics.c(mmaEvent.getTime(), mmaEvent2.getTime()) && Intrinsics.c(Event.getWinnerCode$default(event3, null, 1, null), Event.getWinnerCode$default(event4, null, 1, null)) && Intrinsics.c(mmaEvent.getWinType(), mmaEvent2.getWinType()) && Intrinsics.c(mmaEvent.getFightType(), mmaEvent2.getFightType());
            case 26:
                return Intrinsics.c(list.get(i2), list2.get(i));
            case 27:
                return Intrinsics.c(list2.get(i), list.get(i2));
            case 28:
                Object obj7 = list2.get(i);
                Object obj8 = list.get(i2);
                if ((obj8 instanceof cyd) && (obj7 instanceof cyd)) {
                    cyd cydVar = (cyd) obj8;
                    cyd cydVar2 = (cyd) obj7;
                    if (!Intrinsics.c(cydVar.e, cydVar2.e) || cydVar.d != cydVar2.d) {
                        return false;
                    }
                } else if ((obj8 instanceof dyd) && (obj7 instanceof dyd)) {
                    dyd dydVar = (dyd) obj8;
                    dyd dydVar2 = (dyd) obj7;
                    if (dydVar.b != dydVar2.b || dydVar.c != dydVar2.c || !dydVar.d.equals(dydVar2.d)) {
                        return false;
                    }
                } else {
                    if ((obj8 instanceof i04) && (obj7 instanceof i04)) {
                        return ((i04) obj8).c.equals(((i04) obj7).c);
                    }
                    if (!(obj8 instanceof c14) || !(obj7 instanceof c14)) {
                        return Intrinsics.c(obj7, obj8);
                    }
                }
                return true;
            case 29:
                Object obj9 = list2.get(i);
                Object obj10 = list.get(i2);
                if ((obj10 instanceof q04) && (obj9 instanceof q04)) {
                    return Intrinsics.c(((q04) obj10).c, ((q04) obj9).c);
                }
                if (!(obj10 instanceof f14) || !(obj9 instanceof f14)) {
                    return Intrinsics.c(obj9, obj10);
                }
                f14 f14Var = (f14) obj10;
                f14 f14Var2 = (f14) obj9;
                return f14Var.b == f14Var2.b && f14Var.c == f14Var2.c;
        }
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        Player player;
        Player player2;
        Player player3;
        Player player4;
        Player player5;
        Player player6;
        Player player7;
        Player player8;
        Player player9;
        Player player10;
        int i3 = this.o;
        List list = this.n;
        List list2 = this.m;
        switch (i3) {
            case 0:
                Object obj = list2.get(i);
                Object obj2 = list.get(i2);
                if (!(obj instanceof Integer) || !(obj2 instanceof Integer)) {
                    if ((obj instanceof PlayerData) && (obj2 instanceof PlayerData)) {
                        if (((PlayerData) obj).getPlayer().getId() == ((PlayerData) obj2).getPlayer().getId()) {
                        }
                    } else if (!(obj instanceof MissingPlayerData) || !(obj2 instanceof MissingPlayerData)) {
                        if (!(obj instanceof MissingPlayersPair) || !(obj2 instanceof MissingPlayersPair)) {
                            if (!(obj instanceof r9k) || !(obj2 instanceof r9k)) {
                                if ((obj instanceof CustomizableDivider) && (obj2 instanceof CustomizableDivider)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            MissingPlayerData first = ((MissingPlayersPair) obj).getFirst();
                            Integer valueOf = (first == null || (player2 = first.getPlayer()) == null) ? null : Integer.valueOf(player2.getId());
                            MissingPlayerData first2 = ((MissingPlayersPair) obj2).getFirst();
                            if (first2 != null && (player = first2.getPlayer()) != null) {
                                r1 = Integer.valueOf(player.getId());
                            }
                            break;
                        }
                    } else if (((MissingPlayerData) obj).getPlayer().getId() == ((MissingPlayerData) obj2).getPlayer().getId()) {
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                iu1 iu1Var = (iu1) list2.get(i);
                iu1 iu1Var2 = (iu1) list.get(i2);
                if ((iu1Var instanceof fu1) && (iu1Var2 instanceof fu1)) {
                    if (((fu1) iu1Var).a.getEvent().getId() == ((fu1) iu1Var2).a.getEvent().getId()) {
                    }
                } else if (!(iu1Var instanceof gu1) || !(iu1Var2 instanceof gu1)) {
                    if ((iu1Var instanceof hu1) && (iu1Var2 instanceof hu1)) {
                    }
                }
                break;
            case 2:
                Object obj3 = list2.get(i);
                Object obj4 = list.get(i2);
                if (!(obj3 instanceof CustomizableDivider) || !(obj4 instanceof CustomizableDivider)) {
                    if ((obj3 instanceof Team) && (obj4 instanceof Team)) {
                        if (((Team) obj3).getId() == ((Team) obj4).getId()) {
                        }
                    } else if ((obj3 instanceof m22) && (obj4 instanceof m22)) {
                        if (Intrinsics.c(((m22) obj3).a, ((m22) obj4).a) || i == i2) {
                        }
                    } else if ((obj3 instanceof i22) && (obj4 instanceof i22)) {
                        i22 i22Var = (i22) obj3;
                        i22 i22Var2 = (i22) obj4;
                        if (i22Var.n.getId() == i22Var2.n.getId() && Intrinsics.c(i22Var.B, i22Var2.B)) {
                        }
                    } else if (!(obj3 instanceof zm1) || !(obj4 instanceof zm1)) {
                        if (!(obj3 instanceof ds1) || !(obj4 instanceof ds1)) {
                            if ((obj3 instanceof j29) && (obj4 instanceof j29)) {
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                Object obj5 = list2.get(i);
                Object obj6 = list.get(i2);
                if ((obj5 instanceof APIBuzzerTile) && (obj6 instanceof APIBuzzerTile)) {
                    APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj5;
                    APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj6;
                    if (aPIBuzzerTile.getId() == aPIBuzzerTile2.getId() && aPIBuzzerTile.getType() == aPIBuzzerTile2.getType()) {
                    }
                } else if ((obj5 instanceof o82) && (obj6 instanceof o82)) {
                }
                break;
            case 4:
                TvChannel tvChannel = (TvChannel) list2.get(i);
                TvChannel tvChannel2 = (TvChannel) list.get(i2);
                if (tvChannel.getId() != tvChannel2.getId() || !Intrinsics.c(tvChannel.getCountryCode(), tvChannel2.getCountryCode())) {
                    break;
                }
                break;
            case 5:
                Object obj7 = list2.get(i);
                Object obj8 = list.get(i2);
                if (!(obj7 instanceof Message) || !(obj8 instanceof Message)) {
                    if ((obj7 instanceof Section) && (obj8 instanceof Section)) {
                        break;
                    }
                } else if (((Message) obj7).getId() == ((Message) obj8).getId()) {
                }
                break;
            case 6:
                Object obj9 = list2.get(i);
                Object obj10 = list.get(i2);
                if (!(obj9 instanceof Comment) || !(obj10 instanceof Comment) || ((Comment) obj9).getId() != ((Comment) obj10).getId()) {
                    if (!(obj9 instanceof z33) || !(obj10 instanceof z33) || ((z33) obj9).a.getId() != ((z33) obj10).a.getId()) {
                        if (!(obj9 instanceof h43) || !(obj10 instanceof h43)) {
                            break;
                        }
                    }
                }
                break;
            case 7:
                Object obj11 = list2.get(i);
                Object obj12 = list.get(i2);
                if (!(obj11 instanceof y93) || !(obj12 instanceof y93)) {
                    if ((obj11 instanceof w93) && (obj12 instanceof w93)) {
                        if (((w93) obj11).b.getId() == ((w93) obj12).b.getId()) {
                        }
                    } else if ((obj11 instanceof x93) && (obj12 instanceof x93)) {
                        x93 x93Var = (x93) obj11;
                        x93 x93Var2 = (x93) obj12;
                        if (x93Var.b.equals(x93Var2.b) && x93Var.f == x93Var2.f) {
                        }
                    } else if ((obj11 instanceof PinnedTournament) && (obj12 instanceof PinnedTournament)) {
                        if (((PinnedTournament) obj11).getId() == ((PinnedTournament) obj12).getId()) {
                        }
                    } else if (!(obj11 instanceof ba3) || !(obj12 instanceof ba3)) {
                        if ((obj11 instanceof Section) && (obj12 instanceof Section)) {
                            break;
                        }
                    } else {
                        ba3 ba3Var = (ba3) obj11;
                        ba3 ba3Var2 = (ba3) obj12;
                        if (ba3Var.a == ba3Var2.a && ba3Var.c == ba3Var2.c) {
                        }
                    }
                    break;
                }
                break;
            case 8:
                if (((td6) list2.get(i)).a.getId() != ((td6) list.get(i2)).a.getId()) {
                    break;
                }
                break;
            case 9:
                Object obj13 = list2.get(i);
                Object obj14 = list.get(i2);
                if ((obj13 instanceof ESportsGamePlayerStatisticsRowData) && (obj14 instanceof ESportsGamePlayerStatisticsRowData)) {
                    ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData = (ESportsGamePlayerStatisticsRowData) obj13;
                    ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData2 = (ESportsGamePlayerStatisticsRowData) obj14;
                    if (eSportsGamePlayerStatisticsRowData.getFirstTeamData().getPlayer().getId() != eSportsGamePlayerStatisticsRowData2.getFirstTeamData().getPlayer().getId() || eSportsGamePlayerStatisticsRowData.getSecondTeamData().getPlayer().getId() != eSportsGamePlayerStatisticsRowData2.getSecondTeamData().getPlayer().getId()) {
                        break;
                    }
                } else if (!(obj13 instanceof String) || !(obj14 instanceof String)) {
                }
                break;
            case 10:
                break;
            case 11:
                Object obj15 = list2.get(i);
                Object obj16 = list.get(i2);
                if ((obj15 instanceof Event) && (obj16 instanceof Event)) {
                    if (((Event) obj15).getId() == ((Event) obj16).getId()) {
                    }
                } else if ((obj15 instanceof rq5) && (obj16 instanceof rq5)) {
                    if (((rq5) obj15).b.getId() == ((rq5) obj16).b.getId()) {
                    }
                } else if ((obj15 instanceof lq5) && (obj16 instanceof lq5)) {
                    if (((lq5) obj15).b.getId() == ((lq5) obj16).b.getId()) {
                    }
                } else if ((obj15 instanceof kq5) && (obj16 instanceof kq5)) {
                    if (((kq5) obj15).a.getId() == ((kq5) obj16).a.getId()) {
                    }
                } else if (!(obj15 instanceof CustomizableDivider) || !(obj16 instanceof CustomizableDivider)) {
                    if (!(obj15 instanceof String) || !(obj16 instanceof String)) {
                        if ((obj15 instanceof qq5) && (obj16 instanceof qq5)) {
                            qq5 qq5Var = (qq5) obj15;
                            PlayerData playerData = qq5Var.a;
                            Integer valueOf2 = (playerData == null || (player6 = playerData.getPlayer()) == null) ? null : Integer.valueOf(player6.getId());
                            qq5 qq5Var2 = (qq5) obj16;
                            PlayerData playerData2 = qq5Var2.a;
                            if (Intrinsics.c(valueOf2, (playerData2 == null || (player5 = playerData2.getPlayer()) == null) ? null : Integer.valueOf(player5.getId()))) {
                                PlayerData playerData3 = qq5Var.b;
                                Integer valueOf3 = (playerData3 == null || (player4 = playerData3.getPlayer()) == null) ? null : Integer.valueOf(player4.getId());
                                PlayerData playerData4 = qq5Var2.b;
                                if (playerData4 != null && (player3 = playerData4.getPlayer()) != null) {
                                    r1 = Integer.valueOf(player3.getId());
                                }
                                if (Intrinsics.c(valueOf3, r1)) {
                                }
                            }
                        }
                    }
                }
                break;
            case 12:
                Object obj17 = list2.get(i);
                Object obj18 = list.get(i2);
                if (!(obj17 instanceof ci6) || !(obj18 instanceof ci6)) {
                    if ((obj17 instanceof lrj) && (obj18 instanceof lrj)) {
                        UniqueTournament uniqueTournament = ((lrj) obj17).a.getUniqueTournament();
                        Integer valueOf4 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                        UniqueTournament uniqueTournament2 = ((lrj) obj18).a.getUniqueTournament();
                        break;
                    } else if (!(obj17 instanceof y21) || !(obj18 instanceof y21)) {
                        if ((obj17 instanceof Integer) && (obj18 instanceof Integer)) {
                            break;
                        } else if ((obj17 instanceof CustomizableDivider) && (obj18 instanceof CustomizableDivider)) {
                            CustomizableDivider customizableDivider = (CustomizableDivider) obj17;
                            CustomizableDivider customizableDivider2 = (CustomizableDivider) obj18;
                            if (customizableDivider.getHeightDp() == customizableDivider2.getHeightDp() && customizableDivider.getDividerVisible() == customizableDivider2.getDividerVisible()) {
                            }
                        } else if ((obj17 instanceof m32) && (obj18 instanceof m32)) {
                            if (((m32) obj17).a.getId() == ((m32) obj18).a.getId()) {
                            }
                        } else if (!(obj17 instanceof ei6) || !(obj18 instanceof ei6)) {
                            if ((obj17 instanceof krj) && (obj18 instanceof krj)) {
                                break;
                            }
                        } else if (((ei6) obj17).ordinal() == ((ei6) obj18).ordinal()) {
                        }
                    } else if (((y21) obj17).d().getId() == ((y21) obj18).d().getId()) {
                    }
                } else {
                    ci6 ci6Var = (ci6) obj17;
                    ci6 ci6Var2 = (ci6) obj18;
                    if (ci6Var.b.getId() == ci6Var2.b.getId() && ci6Var.d == ci6Var2.d) {
                    }
                }
                break;
            case 13:
                Object obj19 = list2.get(i);
                Object obj20 = list.get(i2);
                if (!(obj19 instanceof Integer) || !(obj20 instanceof Integer)) {
                    if (!(obj19 instanceof String) || !(obj20 instanceof String)) {
                        if (!(obj19 instanceof ps7) || !(obj20 instanceof ps7)) {
                            if ((obj19 instanceof UniqueTournament) && (obj20 instanceof UniqueTournament)) {
                                if (((UniqueTournament) obj19).getId() == ((UniqueTournament) obj20).getId()) {
                                }
                            } else if (!(obj19 instanceof Team) || !(obj20 instanceof Team)) {
                                if ((obj19 instanceof os7) && (obj20 instanceof os7)) {
                                    break;
                                } else if ((obj19 instanceof Player) && (obj20 instanceof Player)) {
                                    if (((Player) obj19).getId() == ((Player) obj20).getId()) {
                                    }
                                } else if ((obj19 instanceof us7) && (obj20 instanceof us7)) {
                                }
                            } else if (((Team) obj19).getId() == ((Team) obj20).getId()) {
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 14:
                Object obj21 = list2.get(i);
                Object obj22 = list.get(i2);
                if (!(obj21 instanceof String) || !(obj22 instanceof String)) {
                    if (!(obj21 instanceof iv7) || !(obj22 instanceof iv7) || ((iv7) obj21).a.getId() != ((iv7) obj22).a.getId()) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 15:
                if (((xoe) list2.get(i)).a.getId() != ((xoe) list.get(i2)).a.getId()) {
                    break;
                }
                break;
            case 16:
                EventStreak eventStreak = (EventStreak) list2.get(i);
                EventStreak eventStreak2 = (EventStreak) list.get(i2);
                if (eventStreak.getEvent().getId() != eventStreak2.getEvent().getId() || !Intrinsics.c(eventStreak.getStreak().getTeam(), eventStreak2.getStreak().getTeam()) || !Intrinsics.c(eventStreak.getStreak().getName(), eventStreak2.getStreak().getName())) {
                    break;
                }
                break;
            case 17:
                ub9 ub9Var = (ub9) CollectionsKt.a0(i, list2);
                Integer valueOf5 = ub9Var != null ? Integer.valueOf(ub9Var.a()) : null;
                ub9 ub9Var2 = (ub9) CollectionsKt.a0(i2, list);
                break;
            case 18:
                Object obj23 = list2.get(i);
                Object obj24 = list.get(i2);
                if ((obj23 instanceof HockeyIncident) && (obj24 instanceof HockeyIncident)) {
                    if (((HockeyIncident) obj23).getId() == ((HockeyIncident) obj24).getId()) {
                    }
                } else if (!(obj23 instanceof j29) || !(obj24 instanceof j29)) {
                    if ((obj23 instanceof CustomizableDivider) && (obj24 instanceof CustomizableDivider)) {
                    }
                }
                break;
            case 19:
                iz9 iz9Var = (iz9) list2.get(i);
                iz9 iz9Var2 = (iz9) list.get(i2);
                if (!(iz9Var instanceof fz9) || !(iz9Var2 instanceof fz9)) {
                    if (!(iz9Var instanceof gz9) || !(iz9Var2 instanceof gz9)) {
                        if (!(iz9Var instanceof cz9) || !(iz9Var2 instanceof cz9)) {
                            if (!(iz9Var instanceof dz9) || !(iz9Var2 instanceof dz9)) {
                                if (!(iz9Var instanceof bz9) || !(iz9Var2 instanceof bz9)) {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 20:
                break;
            case 21:
                t56 t56Var = (t56) list2.get(i);
                t56 t56Var2 = (t56) list.get(i2);
                if (!(t56Var instanceof s56) || !(t56Var2 instanceof s56)) {
                    if (!(t56Var instanceof q56) || !(t56Var2 instanceof q56)) {
                        if ((t56Var instanceof r56) && (t56Var2 instanceof r56)) {
                            r56 r56Var = (r56) t56Var;
                            fmj fmjVar = r56Var.a;
                            Integer valueOf6 = (fmjVar == null || (player10 = fmjVar.a) == null) ? null : Integer.valueOf(player10.getId());
                            r56 r56Var2 = (r56) t56Var2;
                            fmj fmjVar2 = r56Var2.a;
                            if (Intrinsics.c(valueOf6, (fmjVar2 == null || (player9 = fmjVar2.a) == null) ? null : Integer.valueOf(player9.getId()))) {
                                fmj fmjVar3 = r56Var.b;
                                Integer valueOf7 = (fmjVar3 == null || (player8 = fmjVar3.a) == null) ? null : Integer.valueOf(player8.getId());
                                fmj fmjVar4 = r56Var2.b;
                                if (fmjVar4 != null && (player7 = fmjVar4.a) != null) {
                                    r1 = Integer.valueOf(player7.getId());
                                }
                                if (Intrinsics.c(valueOf7, r1)) {
                                }
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 22:
                if (((r5c) list2.get(i)).a.getId() != ((r5c) list.get(i2)).a.getId()) {
                    break;
                }
                break;
            case 23:
                if (((qlc) list2.get(i)).a.getId() != ((qlc) list.get(i2)).a.getId()) {
                    break;
                }
                break;
            case 24:
                Object obj25 = list2.get(i);
                Object obj26 = list.get(i2);
                if ((obj25 instanceof Event) && (obj26 instanceof Event)) {
                    if (((Event) obj25).getId() == ((Event) obj26).getId()) {
                    }
                } else if ((obj25 instanceof zlc) && (obj26 instanceof zlc)) {
                    if (((zlc) obj25).ordinal() == ((zlc) obj26).ordinal()) {
                    }
                } else if ((obj25 instanceof ylc) && (obj26 instanceof ylc) && Math.abs(list2.size() - list.size()) <= 1) {
                    if (((ylc) obj25).ordinal() == ((ylc) obj26).ordinal()) {
                    }
                } else if ((obj25 instanceof j29) && (obj26 instanceof j29)) {
                }
                break;
            case 25:
                Object obj27 = list2.get(i);
                Object obj28 = list.get(i2);
                if (!(obj27 instanceof DateSection) || !(obj28 instanceof DateSection)) {
                    if (!(obj27 instanceof j29) || !(obj28 instanceof j29)) {
                        if (!(obj27 instanceof Event) || !(obj28 instanceof Event)) {
                            break;
                        } else if (((Event) obj27).getId() != ((Event) obj28).getId()) {
                            break;
                        }
                    }
                }
                break;
            case 26:
                Object obj29 = list2.get(i);
                Object obj30 = list.get(i2);
                if ((obj29 instanceof Event) && (obj30 instanceof Event)) {
                    if (((Event) obj29).getId() == ((Event) obj30).getId()) {
                    }
                } else if ((obj29 instanceof UniqueTournament) && (obj30 instanceof UniqueTournament)) {
                    if (((UniqueTournament) obj29).getId() == ((UniqueTournament) obj30).getId()) {
                    }
                } else if (!(obj29 instanceof j29) || !(obj30 instanceof j29)) {
                    if ((obj29 instanceof ylc) && (obj30 instanceof ylc) && ((ylc) obj29).ordinal() == ((ylc) obj30).ordinal()) {
                    }
                }
                break;
            case 27:
                Object obj31 = list2.get(i);
                Object obj32 = list.get(i2);
                if ((obj31 instanceof RankingRow) && (obj32 instanceof RankingRow)) {
                    if (((RankingRow) obj31).getId() == ((RankingRow) obj32).getId()) {
                    }
                } else if ((obj31 instanceof CustomizableDivider) && (obj32 instanceof CustomizableDivider)) {
                }
                break;
            case 28:
                Object obj33 = list2.get(i);
                Object obj34 = list.get(i2);
                if ((obj34 instanceof cyd) && (obj33 instanceof cyd)) {
                    if (((cyd) obj34).a == ((cyd) obj33).a) {
                    }
                } else if ((obj34 instanceof dyd) && (obj33 instanceof dyd)) {
                    if (((dyd) obj34).e == ((dyd) obj33).e) {
                    }
                } else if ((obj34 instanceof CustomizableDivider) && (obj33 instanceof CustomizableDivider)) {
                    CustomizableDivider customizableDivider3 = (CustomizableDivider) obj34;
                    CustomizableDivider customizableDivider4 = (CustomizableDivider) obj33;
                    if (customizableDivider3.getHeightDp() == customizableDivider4.getHeightDp() && customizableDivider3.getDividerVisible() == customizableDivider4.getDividerVisible() && Intrinsics.c(customizableDivider3.getTint(), customizableDivider4.getTint())) {
                    }
                } else if ((obj34 instanceof c14) && (obj33 instanceof c14)) {
                    if (((c14) obj34).a == ((c14) obj33).a) {
                    }
                } else if ((obj34 instanceof i04) && (obj33 instanceof i04)) {
                    i04 i04Var = (i04) obj34;
                    i04 i04Var2 = (i04) obj33;
                    if (i04Var.a == i04Var2.a && i04Var.b == i04Var2.b) {
                    }
                } else if (!(obj34 instanceof Integer) || !(obj33 instanceof Integer)) {
                    if ((obj34 instanceof r9k) && (obj33 instanceof r9k)) {
                    }
                }
                break;
            default:
                Object obj35 = list2.get(i);
                Object obj36 = list.get(i2);
                if ((obj36 instanceof q04) && (obj35 instanceof q04)) {
                    q04 q04Var = (q04) obj36;
                    q04 q04Var2 = (q04) obj35;
                    if (q04Var.a == q04Var2.a && q04Var.b == q04Var2.b) {
                    }
                } else if ((obj36 instanceof f14) && (obj35 instanceof f14)) {
                    if (((f14) obj36).a.getId() == ((f14) obj35).a.getId()) {
                    }
                } else if (!(obj36 instanceof j29) || !(obj35 instanceof j29)) {
                    if ((obj36 instanceof CustomizableDivider) && (obj35 instanceof CustomizableDivider)) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.f3, defpackage.o02
    public Object R(int i, int i2) {
        int i3 = this.o;
        List list = this.n;
        switch (i3) {
            case 0:
                return list.get(i2);
            case 2:
                Object obj = list.get(i2);
                if (obj instanceof Team) {
                    Object obj2 = list.get(i2);
                    obj2.getClass();
                    return (Team) obj2;
                }
                if (obj instanceof m22) {
                    Object obj3 = list.get(i2);
                    obj3.getClass();
                    return (m22) obj3;
                }
                if (obj instanceof i22) {
                    Object obj4 = list.get(i2);
                    obj4.getClass();
                    return (i22) obj4;
                }
                if (!(obj instanceof zm1)) {
                    return 0;
                }
                Object obj5 = list.get(i2);
                obj5.getClass();
                return (zm1) obj5;
            case 21:
                return (t56) list.get(i2);
            default:
                return super.R(i, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th(List list, List list2, int i) {
        super(list, list2);
        this.o = i;
    }
}
