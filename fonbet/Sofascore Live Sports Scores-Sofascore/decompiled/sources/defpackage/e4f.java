package defpackage;

import android.app.Application;
import com.sofascore.model.Sports;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.newNetwork.VoteChoices;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class e4f extends q8 {
    public final fyk e;
    public final yzc f;
    public final yzc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4f(Application application, fyk fykVar) {
        super(application);
        fykVar.getClass();
        this.e = fykVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
    }

    public final void k(w3f w3fVar) {
        w3fVar.getClass();
        yzc yzcVar = this.f;
        List list = (List) yzcVar.d();
        Integer valueOf = list != null ? Integer.valueOf(list.indexOf(w3fVar)) : null;
        int intValue = (valueOf == null || valueOf.intValue() == -1) ? w3fVar.b.c - 1 : valueOf.intValue();
        List list2 = (List) yzcVar.d();
        yzcVar.j(list2 != null ? yso.t(list2, intValue, w3f.a(w3fVar, null, null, null, null, false, null, true, 258047)) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0443 A[EDGE_INSN: B:170:0x0443->B:48:0x0443 BREAK  A[LOOP:1: B:139:0x03fd->B:161:0x03fd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Event event, boolean z, VoteType voteType, VotesResponse votesResponse, sq3 sq3Var) {
        d4f d4fVar;
        int i;
        boolean z2;
        VotesResponse votesResponse2;
        VoteType voteType2;
        List<w3f> list;
        Vote vote;
        int vote1;
        int vote2;
        Integer voteX;
        Integer num;
        ArrayList arrayList;
        ListIterator listIterator;
        hc9 hc9Var;
        WillBothTeamsScoreVote bothTeamsToScoreVote;
        FirstTeamToScoreVote firstTeamToScoreVote;
        Integer num2;
        w3f a;
        Event event2 = event;
        if (sq3Var instanceof d4f) {
            d4fVar = (d4f) sq3Var;
            int i2 = d4fVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4fVar.x = i2 - Integer.MIN_VALUE;
                Object obj = d4fVar.v;
                Object obj2 = lu3.a;
                i = d4fVar.x;
                yzc yzcVar = this.f;
                if (i != 0) {
                    y6a.M(obj);
                    if (Event.getHomeTeam$default(event2, null, 1, null).getDisabled() || Event.getAwayTeam$default(event2, null, 1, null).getDisabled() || votesResponse == null) {
                        yzcVar.k(km5.a);
                        return Unit.a;
                    }
                    int id = event2.getId();
                    d4fVar.r = event2;
                    d4fVar.s = voteType;
                    d4fVar.t = votesResponse;
                    z2 = z;
                    d4fVar.u = z2;
                    d4fVar.x = 1;
                    obj = this.e.e(id, d4fVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    votesResponse2 = votesResponse;
                    voteType2 = voteType;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = d4fVar.u;
                    VotesResponse votesResponse3 = d4fVar.t;
                    voteType2 = d4fVar.s;
                    Event event3 = d4fVar.r;
                    y6a.M(obj);
                    z2 = z3;
                    votesResponse2 = votesResponse3;
                    event2 = event3;
                }
                Map map = (Map) obj;
                WhoWillWinOptions.Companion companion = WhoWillWinOptions.INSTANCE;
                VoteType voteType3 = VoteType.WHO_WILL_WIN;
                WhoWillWinOptions fromChoice = companion.getFromChoice((String) map.get(voteType3));
                FirstTeamToScoreOptions.Companion companion2 = FirstTeamToScoreOptions.INSTANCE;
                VoteType voteType4 = VoteType.FIRST_TEAM_TO_SCORE;
                FirstTeamToScoreOptions fromChoice2 = companion2.getFromChoice((String) map.get(voteType4));
                WillBothTeamsScoreOptions.Companion companion3 = WillBothTeamsScoreOptions.INSTANCE;
                VoteType voteType5 = VoteType.WILL_BOTH_TEAMS_SCORE;
                WillBothTeamsScoreOptions fromChoice3 = companion3.getFromChoice((String) map.get(voteType5));
                list = (List) yzcVar.d();
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        arrayList = new ArrayList(k13.r(list, 10));
                        for (w3f w3fVar : list) {
                            int ordinal = w3fVar.b.ordinal();
                            if (ordinal == 0) {
                                a = w3f.a(w3fVar, VotesResponseKt.correctVotesFromRemote(votesResponse2.getVote(), w3fVar.d), null, null, null, xe6.c().b().longValue() > event2.getStartTimestamp(), event2.getStatusType(), false, 260599);
                            } else if (ordinal == 1) {
                                a = w3f.a(w3fVar, null, null, VotesResponseKt.correctVotesFromRemote(votesResponse2.getBothTeamsToScoreVote(), w3fVar.f), null, xe6.c().b().longValue() > event2.getStartTimestamp(), event2.getStatusType(), false, 260575);
                            } else {
                                if (ordinal != 2) {
                                    zzl.b();
                                    return null;
                                }
                                a = w3f.a(w3fVar, null, VotesResponseKt.correctVotesFromRemote(votesResponse2.getFirstTeamToScoreVote(), w3fVar.e), null, null, xe6.c().b().longValue() > event2.getStartTimestamp(), event2.getStatusType(), false, 260591);
                            }
                            arrayList.add(a);
                        }
                        yzcVar.k(arrayList);
                        return Unit.a;
                    }
                }
                xbb b = a.b();
                y3f y3fVar = y3f.e;
                boolean shouldReverseTeams = event2.shouldReverseTeams();
                if (VotesResponseKt.getTotalVotes(votesResponse2.getVote()) == 0 || fromChoice == null) {
                    vote = votesResponse2.getVote();
                    vote1 = vote.getVote1();
                    if (vote1 < 0) {
                        vote1 = 0;
                    }
                    vote.setVote1(vote1);
                    vote2 = vote.getVote2();
                    if (vote2 < 0) {
                        vote2 = 0;
                    }
                    vote.setVote2(vote2);
                    voteX = vote.getVoteX();
                    if (voteX == null) {
                        int intValue = voteX.intValue();
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        num = new Integer(intValue);
                    } else {
                        num = null;
                    }
                    vote.setVoteX(num);
                    Unit unit = Unit.a;
                } else {
                    vote = votesResponse2.getVote();
                    int vote12 = vote.getVote1();
                    vote.setVote1(vote12 < 0 ? 0 : vote12);
                    int vote22 = vote.getVote2();
                    if (vote22 < 0) {
                        vote22 = 0;
                    }
                    vote.setVote2(vote22);
                    Integer voteX2 = vote.getVoteX();
                    if (voteX2 != null) {
                        int intValue2 = voteX2.intValue();
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        num2 = new Integer(intValue2);
                    } else {
                        num2 = null;
                    }
                    vote.setVoteX(num2);
                    VotesResponseKt.addVote(vote, fromChoice);
                    Unit unit2 = Unit.a;
                }
                b.add(new w3f(R.string.who_will_win, y3fVar, shouldReverseTeams, vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, (String) map.get(voteType3), Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), xe6.c().b().longValue() <= event2.getStartTimestamp(), event2.getStatusType(), voteType2 != voteType3 ? z2 : false, WhoWillWinOptions.HOME_TEAM_WIN, WhoWillWinOptions.DRAW, WhoWillWinOptions.AWAY_TEAM_WIN, event2.getId(), votesResponse2.getVote().getVoteX() == null, 2096));
                if (Intrinsics.c(ok3.s(event2), Sports.FOOTBALL)) {
                    y3f y3fVar2 = y3f.f;
                    boolean shouldReverseTeams2 = event2.shouldReverseTeams();
                    if (VotesResponseKt.getTotalVotes(votesResponse2.getBothTeamsToScoreVote()) != 0 || fromChoice3 == null) {
                        bothTeamsToScoreVote = votesResponse2.getBothTeamsToScoreVote();
                        int voteNo = bothTeamsToScoreVote.getVoteNo();
                        if (voteNo < 0) {
                            voteNo = 0;
                        }
                        bothTeamsToScoreVote.setVoteNo(voteNo);
                        int voteYes = bothTeamsToScoreVote.getVoteYes();
                        if (voteYes < 0) {
                            voteYes = 0;
                        }
                        bothTeamsToScoreVote.setVoteYes(voteYes);
                    } else {
                        bothTeamsToScoreVote = votesResponse2.getBothTeamsToScoreVote();
                        int voteNo2 = bothTeamsToScoreVote.getVoteNo();
                        if (voteNo2 < 0) {
                            voteNo2 = 0;
                        }
                        bothTeamsToScoreVote.setVoteNo(voteNo2);
                        int voteYes2 = bothTeamsToScoreVote.getVoteYes();
                        if (voteYes2 < 0) {
                            voteYes2 = 0;
                        }
                        bothTeamsToScoreVote.setVoteYes(voteYes2);
                        VotesResponseKt.addVote(bothTeamsToScoreVote, fromChoice3);
                    }
                    b.add(new w3f(R.string.will_both_teams_score_title, y3fVar2, shouldReverseTeams2, (Vote) null, (FirstTeamToScoreVote) null, bothTeamsToScoreVote, (String) map.get(voteType5), Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), xe6.c().b().longValue() > event2.getStartTimestamp(), event2.getStatusType(), voteType2 == voteType5 ? z2 : false, (VoteChoices) WillBothTeamsScoreOptions.YES, (VoteChoices) null, (VoteChoices) WillBothTeamsScoreOptions.NO, event2.getId(), true, 18456));
                    y3f y3fVar3 = y3f.g;
                    boolean shouldReverseTeams3 = event2.shouldReverseTeams();
                    if (VotesResponseKt.getTotalVotes(votesResponse2.getFirstTeamToScoreVote()) != 0 || fromChoice2 == null) {
                        firstTeamToScoreVote = votesResponse2.getFirstTeamToScoreVote();
                        int voteHome = firstTeamToScoreVote.getVoteHome();
                        if (voteHome < 0) {
                            voteHome = 0;
                        }
                        firstTeamToScoreVote.setVoteHome(voteHome);
                        int voteNoGoal = firstTeamToScoreVote.getVoteNoGoal();
                        if (voteNoGoal < 0) {
                            voteNoGoal = 0;
                        }
                        firstTeamToScoreVote.setVoteNoGoal(voteNoGoal);
                        int voteAway = firstTeamToScoreVote.getVoteAway();
                        if (voteAway < 0) {
                            voteAway = 0;
                        }
                        firstTeamToScoreVote.setVoteAway(voteAway);
                        Unit unit3 = Unit.a;
                    } else {
                        firstTeamToScoreVote = votesResponse2.getFirstTeamToScoreVote();
                        int voteHome2 = firstTeamToScoreVote.getVoteHome();
                        if (voteHome2 < 0) {
                            voteHome2 = 0;
                        }
                        firstTeamToScoreVote.setVoteHome(voteHome2);
                        int voteNoGoal2 = firstTeamToScoreVote.getVoteNoGoal();
                        if (voteNoGoal2 < 0) {
                            voteNoGoal2 = 0;
                        }
                        firstTeamToScoreVote.setVoteNoGoal(voteNoGoal2);
                        int voteAway2 = firstTeamToScoreVote.getVoteAway();
                        if (voteAway2 < 0) {
                            voteAway2 = 0;
                        }
                        firstTeamToScoreVote.setVoteAway(voteAway2);
                        VotesResponseKt.addVote(firstTeamToScoreVote, fromChoice2);
                        Unit unit4 = Unit.a;
                    }
                    b.add(new w3f(R.string.who_will_score_first_title, y3fVar3, shouldReverseTeams3, (Vote) null, firstTeamToScoreVote, (WillBothTeamsScoreVote) null, (String) map.get(voteType4), Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), xe6.c().b().longValue() > event2.getStartTimestamp(), event2.getStatusType(), voteType2 == voteType4 ? z2 : false, (VoteChoices) FirstTeamToScoreOptions.HOME_TEAM_SCORE_FIRST, (VoteChoices) FirstTeamToScoreOptions.NO_GOAL, (VoteChoices) FirstTeamToScoreOptions.AWAY_TEAM_SCORE_FIRST, event2.getId(), true, 2088));
                }
                xbb a2 = a.a(b);
                arrayList = new ArrayList();
                listIterator = a2.listIterator(0);
                while (true) {
                    hc9Var = (hc9) listIterator;
                    if (hc9Var.hasNext()) {
                        break;
                    }
                    Object next = hc9Var.next();
                    w3f w3fVar2 = (w3f) next;
                    if (!me4.t(StatusKt.STATUS_NOT_STARTED, event2)) {
                        if (!me4.t(StatusKt.STATUS_NOT_STARTED, event2)) {
                            Vote vote3 = w3fVar2.d;
                            if ((vote3 != null ? VotesResponseKt.getTotalVotes(vote3) : 0) <= 0) {
                                FirstTeamToScoreVote firstTeamToScoreVote2 = w3fVar2.e;
                                if ((firstTeamToScoreVote2 != null ? VotesResponseKt.getTotalVotes(firstTeamToScoreVote2) : 0) <= 0) {
                                    WillBothTeamsScoreVote willBothTeamsScoreVote = w3fVar2.f;
                                    if ((willBothTeamsScoreVote != null ? VotesResponseKt.getTotalVotes(willBothTeamsScoreVote) : 0) > 0) {
                                    }
                                }
                            }
                        }
                    }
                    arrayList.add(next);
                }
                yzcVar.k(arrayList);
                return Unit.a;
            }
        }
        d4fVar = new d4f(this, sq3Var);
        Object obj3 = d4fVar.v;
        Object obj22 = lu3.a;
        i = d4fVar.x;
        yzc yzcVar2 = this.f;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        WhoWillWinOptions.Companion companion4 = WhoWillWinOptions.INSTANCE;
        VoteType voteType32 = VoteType.WHO_WILL_WIN;
        WhoWillWinOptions fromChoice4 = companion4.getFromChoice((String) map2.get(voteType32));
        FirstTeamToScoreOptions.Companion companion22 = FirstTeamToScoreOptions.INSTANCE;
        VoteType voteType42 = VoteType.FIRST_TEAM_TO_SCORE;
        FirstTeamToScoreOptions fromChoice22 = companion22.getFromChoice((String) map2.get(voteType42));
        WillBothTeamsScoreOptions.Companion companion32 = WillBothTeamsScoreOptions.INSTANCE;
        VoteType voteType52 = VoteType.WILL_BOTH_TEAMS_SCORE;
        WillBothTeamsScoreOptions fromChoice32 = companion32.getFromChoice((String) map2.get(voteType52));
        list = (List) yzcVar2.d();
        if (list != null) {
        }
        xbb b2 = a.b();
        y3f y3fVar4 = y3f.e;
        boolean shouldReverseTeams4 = event2.shouldReverseTeams();
        if (VotesResponseKt.getTotalVotes(votesResponse2.getVote()) == 0) {
        }
        vote = votesResponse2.getVote();
        vote1 = vote.getVote1();
        if (vote1 < 0) {
        }
        vote.setVote1(vote1);
        vote2 = vote.getVote2();
        if (vote2 < 0) {
        }
        vote.setVote2(vote2);
        voteX = vote.getVoteX();
        if (voteX == null) {
        }
        vote.setVoteX(num);
        Unit unit5 = Unit.a;
        b2.add(new w3f(R.string.who_will_win, y3fVar4, shouldReverseTeams4, vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, (String) map2.get(voteType32), Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), xe6.c().b().longValue() <= event2.getStartTimestamp(), event2.getStatusType(), voteType2 != voteType32 ? z2 : false, WhoWillWinOptions.HOME_TEAM_WIN, WhoWillWinOptions.DRAW, WhoWillWinOptions.AWAY_TEAM_WIN, event2.getId(), votesResponse2.getVote().getVoteX() == null, 2096));
        if (Intrinsics.c(ok3.s(event2), Sports.FOOTBALL)) {
        }
        xbb a22 = a.a(b2);
        arrayList = new ArrayList();
        listIterator = a22.listIterator(0);
        while (true) {
            hc9Var = (hc9) listIterator;
            if (hc9Var.hasNext()) {
            }
        }
        yzcVar2.k(arrayList);
        return Unit.a;
    }
}
