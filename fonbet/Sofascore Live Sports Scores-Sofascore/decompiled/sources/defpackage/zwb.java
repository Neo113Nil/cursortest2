package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.VoteChoices;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.results.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zwb extends hoi implements Function2 {
    public av4 r;
    public Event s;
    public VotesResponse t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ axb x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwb(axb axbVar, String str, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = axbVar;
        this.y = str;
        this.z = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        zwb zwbVar = new zwb(this.x, this.y, this.z, rq3Var);
        zwbVar.w = obj;
        return zwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zwb) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b5, code lost:
    
        if (r3 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0065, code lost:
    
        if (r5 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f6  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        Event event;
        int i;
        Object T;
        Object value;
        Object e;
        VotesResponse votesResponse;
        Event event2;
        Object value2;
        String str;
        WhoWillWinOptions fromChoice;
        Vote vote;
        int vote1;
        int vote2;
        Integer voteX;
        Integer num;
        axb axbVar = this.x;
        fdi fdiVar = axbVar.e;
        ku3 ku3Var = (ku3) this.w;
        lu3 lu3Var = lu3.a;
        int i2 = this.v;
        if (i2 == 0) {
            y6a.M(obj);
            int i3 = this.z;
            av4 t2 = xw3.t(ku3Var, null, new ywb(axbVar, i3, null, 0), 3);
            t = xw3.t(ku3Var, null, new ywb(axbVar, i3, null, 1), 3);
            this.w = ku3Var;
            this.r = t;
            this.v = 1;
            w = t2.w(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = this.u;
                    votesResponse = this.t;
                    event2 = this.s;
                    y6a.M(obj);
                    i = i4;
                    e = obj;
                    str = (String) ((Map) e).get(VoteType.WHO_WILL_WIN);
                    if (str == null) {
                        str = this.y;
                    }
                    fromChoice = WhoWillWinOptions.INSTANCE.getFromChoice(str);
                    vote = votesResponse.getVote();
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
                    if (VotesResponseKt.getTotalVotes(vote) == 0 && fromChoice != null) {
                        VotesResponseKt.addVote(vote, fromChoice);
                    }
                    return new Pair(event2, new w3f(R.string.who_will_win, y3f.e, event2.shouldReverseTeams(), vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, str, Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), i == 0, event2.getStatusType(), false, (VoteChoices) WhoWillWinOptions.HOME_TEAM_WIN, (VoteChoices) WhoWillWinOptions.DRAW, (VoteChoices) WhoWillWinOptions.AWAY_TEAM_WIN, event2.getId(), vote.getVoteX() == null, 6192));
                }
                int i5 = this.u;
                event = this.s;
                y6a.M(obj);
                i = i5;
                T = obj;
                VotesResponse votesResponse2 = (VotesResponse) T;
                if (votesResponse2 == null) {
                    do {
                        value2 = fdiVar.getValue();
                    } while (!fdiVar.k(value2, new snb()));
                    return null;
                }
                fyk fykVar = axbVar.m;
                int id = event.getId();
                this.w = null;
                this.r = null;
                this.s = event;
                this.t = votesResponse2;
                this.u = i;
                this.v = 3;
                e = fykVar.e(id, this);
                if (e != lu3Var) {
                    votesResponse = votesResponse2;
                    event2 = event;
                    str = (String) ((Map) e).get(VoteType.WHO_WILL_WIN);
                    if (str == null) {
                    }
                    fromChoice = WhoWillWinOptions.INSTANCE.getFromChoice(str);
                    vote = votesResponse.getVote();
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
                    if (VotesResponseKt.getTotalVotes(vote) == 0) {
                        VotesResponseKt.addVote(vote, fromChoice);
                    }
                    return new Pair(event2, new w3f(R.string.who_will_win, y3f.e, event2.shouldReverseTeams(), vote, (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, str, Event.getHomeTeam$default(event2, null, 1, null).getNameCode(), Event.getAwayTeam$default(event2, null, 1, null).getNameCode(), i == 0, event2.getStatusType(), false, (VoteChoices) WhoWillWinOptions.HOME_TEAM_WIN, (VoteChoices) WhoWillWinOptions.DRAW, (VoteChoices) WhoWillWinOptions.AWAY_TEAM_WIN, event2.getId(), vote.getVoteX() == null, 6192));
                }
                return lu3Var;
            }
            av4 av4Var = this.r;
            y6a.M(obj);
            t = av4Var;
            w = obj;
        }
        event = (Event) w;
        if (event == null) {
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, new snb()));
            return null;
        }
        i = xe6.c().b().longValue() > event.getStartTimestamp() ? 1 : 0;
        if (i != 0 || !Intrinsics.c(event.getStatusType(), StatusKt.STATUS_NOT_STARTED)) {
            axbVar.k(twb.a);
            return null;
        }
        this.w = ku3Var;
        this.r = null;
        this.s = event;
        this.u = i;
        this.v = 2;
        T = t.T(this);
    }
}
