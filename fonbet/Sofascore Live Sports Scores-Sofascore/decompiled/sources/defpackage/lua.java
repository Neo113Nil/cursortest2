package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.TeamOfThePeriodRound;
import com.sofascore.model.newNetwork.TeamOfThePeriodRoundsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAwardsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamAwardType;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lua extends hoi implements Function2 {
    public Object A;
    public Serializable B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int r = 1;
    public av4 s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lua(MediaPost mediaPost, ct8 ct8Var, Event event, u8c u8cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = mediaPost;
        this.A = ct8Var;
        this.B = event;
        this.C = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                lua luaVar = new lua((nua) obj2, this.u, this.v, rq3Var);
                luaVar.w = obj;
                return luaVar;
            default:
                lua luaVar2 = new lua((MediaPost) this.z, (ct8) this.A, (Event) this.B, (u8c) obj2, rq3Var);
                luaVar2.w = obj;
                return luaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lua) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c9, code lost:
    
        if (r8 == r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b3, code lost:
    
        if (r2 == r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x019f, code lost:
    
        if (r7 == r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r4 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r3 == r9) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031c  */
    /* JADX WARN: Type inference failed for: r13v20, types: [r9k] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28, types: [gv9] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [rui] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r16v1, types: [oxh] */
    /* JADX WARN: Type inference failed for: r2v16, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Serializable, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, nua, q8, ynb] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 av4Var;
        av4 t;
        av4 t2;
        Object w;
        UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse;
        Object T;
        UniqueTournamentAwardsResponse uniqueTournamentAwardsResponse;
        Object T2;
        ?? r13;
        gv9 gv9Var;
        ?? r132;
        Object t3;
        UniqueTournamentAwardsResponse uniqueTournamentAwardsResponse2;
        Integer num;
        gv9 gv9Var2;
        oxh oxhVar;
        Object value;
        List<TeamOfThePeriodRound> periods;
        ?? r133;
        Integer num2;
        ?? ruiVar;
        Object value2;
        int intValue;
        int intValue2;
        av4 t4;
        ct8 ct8Var;
        Event event;
        Object w2;
        Object T3;
        Team team;
        int i = this.r;
        Object obj2 = this.C;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                int i2 = this.v;
                int i3 = this.u;
                ?? r9 = (nua) obj2;
                fdi fdiVar = r9.e;
                jof jofVar = r9.f;
                ku3 ku3Var = (ku3) this.w;
                lu3 lu3Var = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    r9.m = i3;
                    r9.n = i2;
                    av4Var = null;
                    av4 t5 = xw3.t(ku3Var, null, new kua(r9, i3, i2, av4Var, 3), 3);
                    t = xw3.t(ku3Var, null, new kua(r9, i3, i2, av4Var, 2), 3);
                    t2 = xw3.t(ku3Var, null, new kua(r9, i3, i2, av4Var, 1), 3);
                    this.w = null;
                    this.s = t;
                    this.x = t2;
                    this.t = 1;
                    w = t5.w(this);
                    break;
                } else if (i4 == 1) {
                    ?? r2 = (zu4) this.x;
                    av4 av4Var2 = this.s;
                    y6a.M(obj);
                    t2 = r2;
                    t = av4Var2;
                    av4Var = null;
                    w = obj;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            num = (Integer) this.B;
                            gv9Var2 = (gv9) this.A;
                            uniqueTournamentAwardsResponse2 = (UniqueTournamentAwardsResponse) this.z;
                            UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse2 = (UniqueTournamentChampionsResponse) this.y;
                            y6a.M(obj);
                            uniqueTournamentChampionsResponse = uniqueTournamentChampionsResponse2;
                            av4Var = null;
                            t3 = obj;
                            gv9 gv9Var3 = (gv9) t3;
                            gv9Var = gv9Var2;
                            num2 = num;
                            uniqueTournamentAwardsResponse = uniqueTournamentAwardsResponse2;
                            r132 = gv9Var3;
                            ruiVar = (gv9Var != null || r132 == 0) ? av4Var : new rui(gv9Var, num2, r132);
                            do {
                                value2 = fdiVar.getValue();
                            } while (!fdiVar.k(value2, new unb(new iua(r9.u(uniqueTournamentChampionsResponse), r9.v(uniqueTournamentChampionsResponse != null ? uniqueTournamentChampionsResponse.getConferenceChampions() : av4Var), nua.w(uniqueTournamentAwardsResponse != null ? uniqueTournamentAwardsResponse.getIndividualAwards() : av4Var), ruiVar))));
                            return Unit.a;
                        }
                        uniqueTournamentAwardsResponse = (UniqueTournamentAwardsResponse) this.z;
                        uniqueTournamentChampionsResponse = (UniqueTournamentChampionsResponse) this.y;
                        y6a.M(obj);
                        T2 = obj;
                        av4Var = null;
                        TeamOfThePeriodRoundsResponse teamOfThePeriodRoundsResponse = (TeamOfThePeriodRoundsResponse) T2;
                        if (teamOfThePeriodRoundsResponse == null || (periods = teamOfThePeriodRoundsResponse.getPeriods()) == null) {
                            r13 = av4Var;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (TeamOfThePeriodRound teamOfThePeriodRound : periods) {
                                UniqueTournamentTeamAwardType awardType = teamOfThePeriodRound.getAwardType();
                                switch (awardType == null ? -1 : jua.a[awardType.ordinal()]) {
                                    case 1:
                                        r133 = new m9k(yid.p(1));
                                        break;
                                    case 2:
                                        r133 = new m9k(yid.p(2));
                                        break;
                                    case 3:
                                        r133 = new m9k(yid.p(3));
                                        break;
                                    case 4:
                                        r133 = new q9k(R.string.nba_all_defensive_1st_team);
                                        break;
                                    case 5:
                                        r133 = new q9k(R.string.nba_all_defensive_2nd_team);
                                        break;
                                    case 6:
                                        r133 = new q9k(R.string.nba_all_rookie_1st_team);
                                        break;
                                    case 7:
                                        r133 = new q9k(R.string.nba_all_rookie_2nd_team);
                                        break;
                                    default:
                                        String awardName = teamOfThePeriodRound.getAwardName();
                                        if (awardName != null) {
                                            r133 = new m9k(awardName);
                                            break;
                                        } else {
                                            r133 = av4Var;
                                            break;
                                        }
                                }
                                av4 oxhVar2 = r133 == 0 ? av4Var : new oxh(new Integer(teamOfThePeriodRound.getId()), r133.b(r9.i()), null, null, null, false, 252);
                                if (oxhVar2 != null) {
                                    arrayList.add(oxhVar2);
                                }
                            }
                            r13 = l6g.W(arrayList);
                        }
                        if (jofVar.a.getValue() instanceof unb) {
                            r9.n(av4Var, new dr6(20, (Object) r9, uniqueTournamentChampionsResponse, uniqueTournamentAwardsResponse));
                        } else if (uniqueTournamentChampionsResponse != null || uniqueTournamentAwardsResponse != null || r13 != 0) {
                            ?? r3 = (r13 == 0 || (oxhVar = (oxh) CollectionsKt.firstOrNull(r13)) == null) ? av4Var : (Integer) oxhVar.a;
                            if (r3 != 0) {
                                int intValue3 = r3.intValue();
                                this.w = av4Var;
                                this.s = av4Var;
                                this.x = av4Var;
                                this.y = uniqueTournamentChampionsResponse;
                                this.z = uniqueTournamentAwardsResponse;
                                this.A = r13;
                                this.B = r3;
                                this.t = 4;
                                t3 = r9.t(intValue3, this);
                                if (t3 != lu3Var) {
                                    uniqueTournamentAwardsResponse2 = uniqueTournamentAwardsResponse;
                                    num = r3;
                                    gv9Var2 = r13;
                                    gv9 gv9Var32 = (gv9) t3;
                                    gv9Var = gv9Var2;
                                    num2 = num;
                                    uniqueTournamentAwardsResponse = uniqueTournamentAwardsResponse2;
                                    r132 = gv9Var32;
                                    if (gv9Var != null) {
                                    }
                                    do {
                                        value2 = fdiVar.getValue();
                                    } while (!fdiVar.k(value2, new unb(new iua(r9.u(uniqueTournamentChampionsResponse), r9.v(uniqueTournamentChampionsResponse != null ? uniqueTournamentChampionsResponse.getConferenceChampions() : av4Var), nua.w(uniqueTournamentAwardsResponse != null ? uniqueTournamentAwardsResponse.getIndividualAwards() : av4Var), ruiVar))));
                                }
                                return lu3Var;
                            }
                            gv9Var = r13;
                            r132 = av4Var;
                            num2 = r3;
                            if (gv9Var != null) {
                            }
                            do {
                                value2 = fdiVar.getValue();
                            } while (!fdiVar.k(value2, new unb(new iua(r9.u(uniqueTournamentChampionsResponse), r9.v(uniqueTournamentChampionsResponse != null ? uniqueTournamentChampionsResponse.getConferenceChampions() : av4Var), nua.w(uniqueTournamentAwardsResponse != null ? uniqueTournamentAwardsResponse.getIndividualAwards() : av4Var), ruiVar))));
                        } else if (jofVar.a.getValue() instanceof tnb) {
                            do {
                                value = fdiVar.getValue();
                            } while (!fdiVar.k(value, new snb()));
                        }
                        return Unit.a;
                    }
                    UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse3 = (UniqueTournamentChampionsResponse) this.y;
                    ?? r7 = (zu4) this.x;
                    y6a.M(obj);
                    t2 = r7;
                    av4Var = null;
                    uniqueTournamentChampionsResponse = uniqueTournamentChampionsResponse3;
                    T = obj;
                    uniqueTournamentAwardsResponse = (UniqueTournamentAwardsResponse) T;
                    this.w = av4Var;
                    this.s = av4Var;
                    this.x = av4Var;
                    this.y = uniqueTournamentChampionsResponse;
                    this.z = uniqueTournamentAwardsResponse;
                    this.t = 3;
                    T2 = t2.T(this);
                    break;
                }
                uniqueTournamentChampionsResponse = (UniqueTournamentChampionsResponse) w;
                this.w = av4Var;
                this.s = av4Var;
                this.x = t2;
                this.y = uniqueTournamentChampionsResponse;
                this.t = 2;
                T = t.T(this);
                break;
            default:
                u8c u8cVar = (u8c) obj2;
                MediaPost mediaPost = (MediaPost) this.z;
                ku3 ku3Var2 = (ku3) this.w;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.v;
                if (i5 == 0) {
                    y6a.M(obj);
                    Integer teamId = mediaPost.getTeamId();
                    if (teamId == null) {
                        return null;
                    }
                    intValue = teamId.intValue();
                    Integer eventId = mediaPost.getEventId();
                    if (eventId == null) {
                        return null;
                    }
                    intValue2 = eventId.intValue();
                    av4 t6 = xw3.t(ku3Var2, null, new w7c(u8cVar, intValue2, rq3Var, 10), 3);
                    t4 = xw3.t(ku3Var2, null, new w7c(u8cVar, intValue, rq3Var, 11), 3);
                    ct8Var = (ct8) this.A;
                    Event event2 = (Event) this.B;
                    if (event2 == null) {
                        this.w = null;
                        this.s = t4;
                        this.x = ct8Var;
                        this.t = intValue;
                        this.u = intValue2;
                        this.v = 1;
                        w2 = t6.w(this);
                        break;
                    } else {
                        event = event2;
                        this.w = null;
                        this.s = null;
                        this.x = ct8Var;
                        this.y = event;
                        this.t = intValue;
                        this.u = intValue2;
                        this.v = 2;
                        T3 = t4.T(this);
                        break;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        intValue2 = this.u;
                        intValue = this.t;
                        event = (Event) this.y;
                        ct8 ct8Var2 = (ct8) this.x;
                        y6a.M(obj);
                        ct8Var = ct8Var2;
                        T3 = obj;
                        TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) T3);
                        if (teamDetailsResponse == null || (team = teamDetailsResponse.getTeam()) == null) {
                            return null;
                        }
                        this.w = null;
                        this.s = null;
                        this.x = null;
                        this.y = null;
                        this.t = intValue;
                        this.u = intValue2;
                        this.v = 3;
                        Object invoke = ct8Var.invoke(event, team, this);
                        if (invoke != lu3Var2) {
                            return invoke;
                        }
                        return lu3Var2;
                    }
                    intValue2 = this.u;
                    intValue = this.t;
                    ct8 ct8Var3 = (ct8) this.x;
                    t4 = this.s;
                    y6a.M(obj);
                    ct8Var = ct8Var3;
                    w2 = obj;
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) w2);
                event = eventResponse != null ? eventResponse.getEvent() : null;
                if (event == null) {
                    return null;
                }
                this.w = null;
                this.s = null;
                this.x = ct8Var;
                this.y = event;
                this.t = intValue;
                this.u = intValue2;
                this.v = 2;
                T3 = t4.T(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lua(nua nuaVar, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = nuaVar;
        this.u = i;
        this.v = i2;
    }
}
