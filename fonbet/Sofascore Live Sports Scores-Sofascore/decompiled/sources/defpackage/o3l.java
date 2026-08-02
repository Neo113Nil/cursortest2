package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.VoteChoices;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o3l extends hoi implements Function2 {
    public OddsCountryProvider r;
    public zu4 s;
    public p3l t;
    public VotesResponse u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ p3l x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3l(p3l p3lVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = p3lVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        o3l o3lVar = new o3l(this.x, rq3Var);
        o3lVar.w = obj;
        return o3lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0074, code lost:
    
        if (r5 == r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ab, code lost:
    
        if (r0 == r4) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0127  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OddsCountryProvider oddsCountryProvider;
        zu4 t;
        Object w;
        Object e;
        OddsCountryProvider oddsCountryProvider2;
        zu4 zu4Var;
        VotesResponse votesResponse;
        p3l p3lVar;
        List list;
        Object T;
        Vote vote;
        int vote1;
        int vote2;
        Integer voteX;
        Integer num;
        Integer num2;
        Object obj2;
        Object obj3;
        p3l p3lVar2 = this.x;
        Event event = p3lVar2.j;
        ku3 ku3Var = (ku3) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            if (event == null) {
                return Unit.a;
            }
            av4 t2 = xw3.t(ku3Var, null, new luj(p3lVar2, rq3Var, 8), 3);
            oddsCountryProvider = p3lVar2.q;
            t = oddsCountryProvider != null ? xw3.t(ku3Var, null, new i3l(p3lVar2, oddsCountryProvider, null, 1), 3) : null;
            this.w = null;
            this.r = oddsCountryProvider;
            this.s = t;
            this.v = 1;
            w = t2.w(this);
        } else if (i == 1) {
            t = this.s;
            OddsCountryProvider oddsCountryProvider3 = this.r;
            y6a.M(obj);
            oddsCountryProvider = oddsCountryProvider3;
            w = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                OddsCountryProvider oddsCountryProvider4 = this.r;
                y6a.M(obj);
                oddsCountryProvider = oddsCountryProvider4;
                T = obj;
                list = (List) T;
                OddsCountryProvider oddsCountryProvider5 = oddsCountryProvider;
                if (list != null) {
                    Iterator it = rld.o(list).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        List list2 = (List) obj2;
                        if (((ProviderOdds) list2.get(0)).getType() == ProviderOdds.Type.STANDARD && ((ProviderOdds) list2.get(0)).getMarketId() == 1) {
                            break;
                        }
                    }
                    List list3 = (List) obj2;
                    if (list3 != null) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (!((ProviderOdds) obj3).isLive()) {
                                break;
                            }
                        }
                        ProviderOdds providerOdds = (ProviderOdds) obj3;
                        if (providerOdds != null) {
                            fdi fdiVar = p3lVar2.k;
                            b7 K = l6g.K(r4a.B(p3lVar2.i(), oddsCountryProvider5, providerOdds));
                            event.getClass();
                            xmd xmdVar = new xmd(K, oddsCountryProvider5, new OddsEventUIModel(event.getId(), o3a.F(event.getTournament()), event.getStatusType(), ok3.s(event), event.shouldReverseTeams()), (tld) null, 24);
                            fdiVar.getClass();
                            fdiVar.m(null, xmdVar);
                        }
                    }
                    return Unit.a;
                }
                return Unit.a;
            }
            votesResponse = this.u;
            p3lVar = this.t;
            zu4 zu4Var2 = this.s;
            OddsCountryProvider oddsCountryProvider6 = this.r;
            y6a.M(obj);
            oddsCountryProvider2 = oddsCountryProvider6;
            zu4Var = zu4Var2;
            e = obj;
            Map map = (Map) e;
            WhoWillWinOptions.Companion companion = WhoWillWinOptions.INSTANCE;
            VoteType voteType = VoteType.WHO_WILL_WIN;
            WhoWillWinOptions fromChoice = companion.getFromChoice((String) map.get(voteType));
            vote = votesResponse.getVote();
            fdi fdiVar2 = p3lVar.m;
            Event event2 = p3lVar.j;
            y3f y3fVar = y3f.e;
            boolean shouldReverseTeams = event2.shouldReverseTeams();
            if (VotesResponseKt.getTotalVotes(vote) == 0 || fromChoice == null) {
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
            w3f w3fVar = new w3f(R.string.who_will_win, y3fVar, shouldReverseTeams, vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, (String) map.get(voteType), Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), xe6.c().b().longValue() <= event2.getStartTimestamp(), event2.getStatusType(), false, (VoteChoices) WhoWillWinOptions.HOME_TEAM_WIN, (VoteChoices) WhoWillWinOptions.DRAW, (VoteChoices) WhoWillWinOptions.AWAY_TEAM_WIN, event2.getId(), vote.getVoteX() == null, 6192);
            fdiVar2.getClass();
            fdiVar2.m(null, w3fVar);
            t = zu4Var;
            oddsCountryProvider = oddsCountryProvider2;
            if (t != null) {
                list = null;
                OddsCountryProvider oddsCountryProvider52 = oddsCountryProvider;
                if (list != null) {
                }
                return Unit.a;
            }
            this.w = null;
            this.r = oddsCountryProvider;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = 3;
            T = t.T(this);
        }
        x2g x2gVar = (x2g) w;
        if (!(x2gVar instanceof t2g)) {
            if (!(x2gVar instanceof v2g)) {
                zzl.b();
                return null;
            }
            VotesResponse votesResponse2 = (VotesResponse) ((v2g) x2gVar).a;
            fyk fykVar = p3lVar2.h;
            int id = event.getId();
            this.w = null;
            this.r = oddsCountryProvider;
            this.s = t;
            this.t = p3lVar2;
            this.u = votesResponse2;
            this.v = 2;
            e = fykVar.e(id, this);
            if (e != lu3Var) {
                oddsCountryProvider2 = oddsCountryProvider;
                zu4Var = t;
                votesResponse = votesResponse2;
                p3lVar = p3lVar2;
                Map map2 = (Map) e;
                WhoWillWinOptions.Companion companion2 = WhoWillWinOptions.INSTANCE;
                VoteType voteType2 = VoteType.WHO_WILL_WIN;
                WhoWillWinOptions fromChoice2 = companion2.getFromChoice((String) map2.get(voteType2));
                vote = votesResponse.getVote();
                fdi fdiVar22 = p3lVar.m;
                Event event22 = p3lVar.j;
                y3f y3fVar2 = y3f.e;
                boolean shouldReverseTeams2 = event22.shouldReverseTeams();
                if (VotesResponseKt.getTotalVotes(vote) == 0) {
                }
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
                Unit unit3 = Unit.a;
                w3f w3fVar2 = new w3f(R.string.who_will_win, y3fVar2, shouldReverseTeams2, vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, (String) map2.get(voteType2), Event.getHomeTeam$default(event22, null, 1, null).getNameCode(), Event.getAwayTeam$default(event22, null, 1, null).getNameCode(), xe6.c().b().longValue() <= event22.getStartTimestamp(), event22.getStatusType(), false, (VoteChoices) WhoWillWinOptions.HOME_TEAM_WIN, (VoteChoices) WhoWillWinOptions.DRAW, (VoteChoices) WhoWillWinOptions.AWAY_TEAM_WIN, event22.getId(), vote.getVoteX() == null, 6192);
                fdiVar22.getClass();
                fdiVar22.m(null, w3fVar2);
                t = zu4Var;
                oddsCountryProvider = oddsCountryProvider2;
            }
            return lu3Var;
        }
        if (t != null) {
        }
    }
}
