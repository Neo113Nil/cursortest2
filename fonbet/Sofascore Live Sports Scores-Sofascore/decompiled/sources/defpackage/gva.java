package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.FeaturedEventsResponse;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.TeamOfTheWeekItem;
import com.sofascore.model.newNetwork.TeamOfTheWeekRound;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekTimespan;
import com.sofascore.model.newNetwork.UniqueTournamentRecapTopPerformancesResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gva extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kva t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gva(int i, int i2, rq3 rq3Var, kva kvaVar) {
        super(2, rq3Var);
        this.r = 0;
        this.u = i;
        this.t = kvaVar;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                kva kvaVar = this.t;
                return new gva(this.u, this.v, rq3Var, kvaVar);
            case 1:
                return new gva(this.u, this.v, 1, rq3Var, this.t);
            case 2:
                return new gva(this.u, this.v, 2, rq3Var, this.t);
            case 3:
                return new gva(this.u, this.v, 3, rq3Var, this.t);
            case 4:
                return new gva(this.u, this.v, 4, rq3Var, this.t);
            case 5:
                return new gva(this.u, this.v, 5, rq3Var, this.t);
            case 6:
                return new gva(this.u, this.v, 6, rq3Var, this.t);
            case 7:
                return new gva(this.u, this.v, 7, rq3Var, this.t);
            default:
                return new gva(this.u, this.v, 8, rq3Var, this.t);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((gva) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02aa, code lost:
    
        if (r0 == r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x027f, code lost:
    
        if (r6 == r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0353, code lost:
    
        if (r0 == r1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x036e, code lost:
    
        if (r0 == r1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006f, code lost:
    
        if (r0 == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0049, code lost:
    
        if (r5 == r4) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object x0;
        Object w0;
        List<Event> featuredEvents;
        List<Event> featuredEvents2;
        Object P;
        Object c0;
        PowerRankingRound powerRankingRound;
        Object b0;
        Object h0;
        Object P2;
        exa exaVar;
        gv9 gv9Var;
        exa exaVar2;
        gv9<jrj> gv9Var2;
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        kva kvaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = kvaVar.e;
                    if (i3 > 0) {
                        this.s = 1;
                        w0 = w3bVar.w0(i2, i3, this);
                        break;
                    } else {
                        this.s = 2;
                        x0 = w3bVar.x0(i2, this);
                        break;
                    }
                    return lu3Var;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    w0 = obj;
                    FeaturedEventsResponse featuredEventsResponse = (FeaturedEventsResponse) w0;
                    if (featuredEventsResponse == null || (featuredEvents = featuredEventsResponse.getFeaturedEvents()) == null) {
                        return null;
                    }
                    return (Event) CollectionsKt.firstOrNull(featuredEvents);
                }
                if (i4 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                x0 = obj;
                FeaturedEventsResponse featuredEventsResponse2 = (FeaturedEventsResponse) x0;
                if (featuredEventsResponse2 == null || (featuredEvents2 = featuredEventsResponse2.getFeaturedEvents()) == null) {
                    return null;
                }
                return (Event) CollectionsKt.firstOrNull(featuredEvents2);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    oi5 oi5Var = kvaVar.f;
                    this.s = 1;
                    oi5Var.getClass();
                    P = yaa.P(new ni5(oi5Var, this.u, this.v, null, 0), this);
                    if (P == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                return yaa.x((x2g) P);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = kvaVar.e;
                this.s = 1;
                Object Z = w3bVar2.Z(i3, i2, this);
                return Z == lu3Var3 ? lu3Var3 : Z;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = kvaVar.e;
                this.s = 1;
                Object a0 = w3bVar3.a0(i3, i2, this);
                return a0 == lu3Var4 ? lu3Var4 : a0;
            case 4:
                w3b w3bVar4 = kvaVar.e;
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    c0 = w3bVar4.c0(i3, i2, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        b0 = obj;
                        return (PowerRankingResponse) b0;
                    }
                    y6a.M(obj);
                    c0 = obj;
                }
                PowerRankingRoundsResponse powerRankingRoundsResponse = (PowerRankingRoundsResponse) c0;
                List<PowerRankingRound> powerRankingRounds = powerRankingRoundsResponse != null ? powerRankingRoundsResponse.getPowerRankingRounds() : null;
                if (powerRankingRounds == null || (powerRankingRound = (PowerRankingRound) CollectionsKt.firstOrNull(powerRankingRounds)) == null) {
                    return null;
                }
                if (powerRankingRound.getId() <= 0) {
                    powerRankingRound = null;
                }
                if (powerRankingRound == null) {
                    return null;
                }
                int id = powerRankingRound.getId();
                this.s = 2;
                b0 = w3bVar4.b0(i3, i2, id, this);
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar5 = kvaVar.e;
                this.s = 1;
                Object E0 = w3bVar5.E0(i3, i2, this);
                return E0 == lu3Var6 ? lu3Var6 : E0;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new gva(this.u, this.v, 7, null, this.t), this);
                    return r == lu3Var7 ? lu3Var7 : r;
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
                    w3b w3bVar6 = kvaVar.e;
                    this.s = 1;
                    h0 = w3bVar6.h0(i3, i2, this);
                    if (h0 == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    h0 = obj;
                }
                TeamOfTheWeekRoundsResponse teamOfTheWeekRoundsResponse = (TeamOfTheWeekRoundsResponse) h0;
                List<TeamOfTheWeekItem> periods = teamOfTheWeekRoundsResponse != null ? teamOfTheWeekRoundsResponse.getPeriods() : null;
                if (periods == null) {
                    periods = km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(periods, 10));
                for (TeamOfTheWeekItem teamOfTheWeekItem : periods) {
                    int id2 = teamOfTheWeekItem.getId();
                    String name = teamOfTheWeekItem instanceof TeamOfTheWeekRound ? ((TeamOfTheWeekRound) teamOfTheWeekItem).getRound().getName() : teamOfTheWeekItem instanceof TeamOfTheWeekTimespan ? ((TeamOfTheWeekTimespan) teamOfTheWeekItem).getItemName() : null;
                    if (name == null) {
                        name = String.valueOf(id2);
                    }
                    String str = name;
                    long createdAtTimestamp = teamOfTheWeekItem.getCreatedAtTimestamp();
                    Long startDateTimestamp = teamOfTheWeekItem.getStartDateTimestamp();
                    long longValue = startDateTimestamp != null ? startDateTimestamp.longValue() : 0L;
                    boolean z = teamOfTheWeekItem instanceof TeamOfTheWeekTimespan;
                    arrayList.add(new TournamentRoundWrapper(id2, teamOfTheWeekItem.getType(), teamOfTheWeekItem.getPeriodName(), teamOfTheWeekItem.getTournamentId(), str, String.valueOf(teamOfTheWeekItem.getId()), true, z ? new Long(((TeamOfTheWeekTimespan) teamOfTheWeekItem).getDateFrom()) : null, z ? new Long(((TeamOfTheWeekTimespan) teamOfTheWeekItem).getDateTo()) : null, createdAtTimestamp, longValue));
                }
                return CollectionsKt.H0(arrayList, new se7(23));
            default:
                yzc yzcVar = kvaVar.l;
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                int i13 = this.u;
                int i14 = this.v;
                Object obj2 = null;
                if (i12 == 0) {
                    y6a.M(obj);
                    w3b w3bVar7 = kvaVar.e;
                    this.s = 1;
                    w3bVar7.getClass();
                    P2 = yaa.P(new zza(w3bVar7, i13, i14, null, 12), this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        eva evaVar = (eva) yzcVar.d();
                        if (evaVar != null) {
                            eva evaVar2 = (eva) yzcVar.d();
                            if (evaVar2 != null && (exaVar = evaVar2.p) != null) {
                                eva evaVar3 = (eva) yzcVar.d();
                                if (evaVar3 != null && (exaVar2 = evaVar3.p) != null && (gv9Var2 = exaVar2.b) != null) {
                                    ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, 10));
                                    for (jrj jrjVar : gv9Var2) {
                                        int i15 = jrjVar.a;
                                        boolean z2 = i15 == i14;
                                        String str2 = jrjVar.b;
                                        float f = jrjVar.d;
                                        int i16 = jrjVar.e;
                                        str2.getClass();
                                        arrayList2.add(new jrj(i15, str2, z2, f, i16));
                                    }
                                    gv9Var = l6g.W(arrayList2);
                                    break;
                                }
                                gv9Var = rlh.b;
                                int i17 = exaVar.a;
                                gv9Var.getClass();
                                obj2 = new exa(i17, gv9Var);
                            }
                            exa exaVar3 = obj2;
                            UniqueTournamentDetails uniqueTournamentDetails = evaVar.a;
                            v2f v2fVar = evaVar.b;
                            PlayerOfTheSeasonResponse playerOfTheSeasonResponse = evaVar.c;
                            TopPerformanceResponse topPerformanceResponse = evaVar.d;
                            List list = evaVar.e;
                            List list2 = evaVar.f;
                            String str3 = evaVar.g;
                            List list3 = evaVar.h;
                            List list4 = evaVar.i;
                            SeasonInfo seasonInfo = evaVar.j;
                            bu7 bu7Var = evaVar.k;
                            List list5 = evaVar.l;
                            List list6 = evaVar.m;
                            UniqueTournamentRecapTopPerformancesResponse uniqueTournamentRecapTopPerformancesResponse = evaVar.n;
                            gv9 gv9Var3 = evaVar.o;
                            gv9Var3.getClass();
                            obj2 = new eva(uniqueTournamentDetails, v2fVar, playerOfTheSeasonResponse, topPerformanceResponse, list, list2, str3, list3, list4, seasonInfo, bu7Var, list5, list6, uniqueTournamentRecapTopPerformancesResponse, gv9Var3, exaVar3);
                        }
                        yzcVar.k(obj2);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                x2g x2gVar = (x2g) P2;
                x2gVar.getClass();
                if (x2gVar instanceof v2g) {
                    cg4 cg4Var = kvaVar.i;
                    String j = ljg.j(i13, "goat_vote_");
                    this.s = 2;
                    Object x = o6a.x(cg4Var.a, new ce4(i14, j, (rq3) null), this);
                    if (x != lu3Var9) {
                        x = Unit.a;
                        break;
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gva(int i, int i2, int i3, rq3 rq3Var, kva kvaVar) {
        super(2, rq3Var);
        this.r = i3;
        this.t = kvaVar;
        this.u = i;
        this.v = i2;
    }
}
