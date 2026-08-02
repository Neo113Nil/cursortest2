package defpackage;

import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.TvChannelVotesResponse;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lh7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh7(Serializable serializable, Object obj, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.v = serializable;
        this.w = obj;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.w;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new lh7((wi7) obj2, this.t, this.u, (String) obj, rq3Var, 0);
            case 1:
                return new lh7((g39) obj2, this.t, this.u, (BaseballSeasonPitchesPerspective) obj, rq3Var, 1);
            case 2:
                return new lh7((Round) obj2, (w3b) obj, this.t, this.u, rq3Var, 2);
            case 3:
                return new lh7((zsb) obj2, this.t, (String) obj, this.u, rq3Var, 3);
            case 4:
                return new lh7((Integer) obj2, (wve) obj, this.t, this.u, rq3Var, 4);
            case 5:
                return new lh7((ctf) obj2, this.t, (String) obj, this.u, rq3Var, 5);
            case 6:
                return new lh7((pai) obj2, this.t, this.u, (String) obj, rq3Var, 6);
            case 7:
                return new lh7((j0j) obj2, this.t, (String) obj, this.u, rq3Var, 7);
            default:
                return new lh7((z3k) obj2, this.t, (TvType) obj, this.u, rq3Var, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((lh7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x016a, code lost:
    
        if (r0 == r10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018d, code lost:
    
        if (r0 == r10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        if (r1 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
    
        if (r1 == r0) goto L59;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object uniqueTournamentRoundAllEvents;
        Object uniqueTournamentRoundAllEvents2;
        Object playerEventsList;
        Object playerTournamentEventsList;
        Object tvChannelVotes;
        int i = this.r;
        int i2 = this.u;
        Object obj2 = this.w;
        int i3 = this.t;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object leagueTeams = ((wi7) obj3).a.getLeagueTeams(i3, i2, (String) obj2, this);
                    return leagueTeams == lu3Var ? lu3Var : leagueTeams;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = ((g39) obj3).a;
                String argument = ((BaseballSeasonPitchesPerspective) obj2).getArgument();
                this.s = 1;
                Object playerEventBaseballPitches = networkCoroutineAPI.playerEventBaseballPitches(i3, i2, argument, this);
                return playerEventBaseballPitches == lu3Var2 ? lu3Var2 : playerEventBaseballPitches;
            case 2:
                w3b w3bVar = (w3b) obj2;
                Round round = (Round) obj3;
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        uniqueTournamentRoundAllEvents2 = obj;
                        return (EventListResponse) uniqueTournamentRoundAllEvents2;
                    }
                    if (i6 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    uniqueTournamentRoundAllEvents = obj;
                    return (EventListResponse) uniqueTournamentRoundAllEvents;
                }
                y6a.M(obj);
                if ((round != null ? round.getSlug() : null) != null && round.getRound() != null) {
                    NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                    Integer round2 = round.getRound();
                    int intValue = round2 != null ? round2.intValue() : 0;
                    String slug = round.getSlug();
                    if (slug == null) {
                        slug = "";
                    }
                    this.s = 1;
                    uniqueTournamentRoundAllEvents2 = networkCoroutineAPI2.uniqueTournamentRoundAllEvents(this.t, this.u, intValue, slug, this);
                    break;
                } else {
                    if ((round != null ? round.getRound() : null) == null) {
                        return null;
                    }
                    NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
                    Integer round3 = round.getRound();
                    int intValue2 = round3 != null ? round3.intValue() : 0;
                    this.s = 2;
                    uniqueTournamentRoundAllEvents = networkCoroutineAPI3.uniqueTournamentRoundAllEvents(i3, i2, intValue2, this);
                    break;
                }
                return lu3Var3;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object managerEvents = ((zsb) obj3).a.managerEvents(i3, (String) obj2, i2, this);
                    return managerEvents == lu3Var4 ? lu3Var4 : managerEvents;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        playerTournamentEventsList = obj;
                        return (PlayerEventsListResponse) playerTournamentEventsList;
                    }
                    if (i8 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    playerEventsList = obj;
                    return (PlayerEventsListResponse) playerEventsList;
                }
                y6a.M(obj);
                Integer num = (Integer) obj3;
                NetworkCoroutineAPI networkCoroutineAPI4 = ((wve) obj2).b;
                if (num == null) {
                    this.s = 2;
                    playerEventsList = networkCoroutineAPI4.playerEventsList(i3, i2, this);
                    break;
                } else {
                    int intValue3 = num.intValue();
                    this.s = 1;
                    playerTournamentEventsList = networkCoroutineAPI4.playerTournamentEventsList(i3, intValue3, i2, this);
                    break;
                }
                return lu3Var5;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object refereeEvents = ((ctf) obj3).a.refereeEvents(i3, (String) obj2, i2, this);
                    return refereeEvents == lu3Var6 ? lu3Var6 : refereeEvents;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object hasStandings = ((pai) obj3).a.hasStandings(i3, i2, (String) obj2, this);
                    return hasStandings == lu3Var7 ? lu3Var7 : hasStandings;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object teamEventList = ((j0j) obj3).b.getTeamEventList(i3, (String) obj2, i2, this);
                    return teamEventList == lu3Var8 ? lu3Var8 : teamEventList;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    tvChannelVotes = ((z3k) obj3).b.getTvChannelVotes(i3, (TvType) obj2, i2, this);
                    if (tvChannelVotes == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    tvChannelVotes = obj;
                }
                return ((TvChannelVotesResponse) tvChannelVotes).getChannel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh7(Object obj, int i, int i2, Object obj2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.u = i2;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh7(Object obj, int i, Object obj2, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.w = obj2;
        this.u = i2;
    }
}
