package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGameStatisticsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentGroupsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentVenuesResponse;
import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.UserSubscriptionsResponse;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.model.profile.VoteStatisticsWrapper;
import com.sofascore.model.weeklyChallenge.ActiveWeeklyLeague;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mz5 extends hoi implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public int w;
    public /* synthetic */ Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz5(af0 af0Var, kqf kqfVar, esf esfVar, fdi fdiVar, Context context, eyf eyfVar, zij zijVar, uij uijVar, ku3 ku3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.s = af0Var;
        this.t = kqfVar;
        this.u = esfVar;
        this.v = fdiVar;
        this.y = context;
        this.z = eyfVar;
        this.A = zijVar;
        this.B = uijVar;
        this.C = ku3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                mz5 mz5Var = new mz5((nz5) this.B, (EsportsGame) obj2, rq3Var, 0);
                mz5Var.x = obj;
                return mz5Var;
            case 1:
                mz5 mz5Var2 = new mz5((zwa) this.B, (Season) obj2, rq3Var, 1);
                mz5Var2.x = obj;
                return mz5Var2;
            case 2:
                mz5 mz5Var3 = new mz5((ybf) obj2, rq3Var);
                mz5Var3.x = obj;
                return mz5Var3;
            default:
                mz5 mz5Var4 = new mz5((af0) this.s, (kqf) this.t, (esf) this.u, (fdi) this.v, (Context) this.y, (eyf) this.z, (zij) this.A, (uij) this.B, (ku3) obj2, rq3Var);
                mz5Var4.x = obj;
                return mz5Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((mz5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((mz5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((mz5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((mz5) create((iqf) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x016e, code lost:
    
        if (r6 == r12) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0157, code lost:
    
        if (r6 == r12) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0583, code lost:
    
        if (r1.j(r23) != r3) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (kotlin.Unit.a == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r4 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0199, code lost:
    
        if (r14 == r12) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0279  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r4v10, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v13, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v34, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v15, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 t2;
        Object w;
        yzc yzcVar;
        av4 av4Var;
        Object T;
        zu4 zu4Var;
        EsportsGameStatisticsResponse esportsGameStatisticsResponse;
        Object T2;
        yzc yzcVar2;
        ESportsGameLineupsResponse eSportsGameLineupsResponse;
        zu4 zu4Var2;
        Object T3;
        yzc yzcVar3;
        EsportsGameStatisticsResponse esportsGameStatisticsResponse2;
        ESportsGameRoundsResponse eSportsGameRoundsResponse;
        av4 t3;
        zu4 p;
        Object w2;
        av4 av4Var2;
        Object T4;
        yzc yzcVar4;
        UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse;
        zu4 zu4Var3;
        Object T5;
        UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse2;
        UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse;
        zu4 zu4Var4;
        UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse;
        Object T6;
        UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse2;
        UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse2;
        ProfileData profileData;
        Object w3;
        Object c;
        b7 O;
        Object w4;
        VoteStatistics voteStatistics;
        Object P;
        b7 b7Var;
        av4 av4Var3;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse;
        ProfileData profileData2;
        VoteStatistics voteStatistics2;
        UserSubscriptionsResponse userSubscriptionsResponse;
        xbb a;
        p4b p4bVar;
        Object T7;
        p4b p4bVar2;
        Object obj2;
        ActiveWeeklyLeague league;
        Object b;
        int i = this.r;
        Object obj3 = this.C;
        int i2 = 1;
        int i3 = 2;
        UniqueTournamentVenuesResponse uniqueTournamentVenuesResponse = null;
        ?? r10 = 0;
        ?? r102 = 0;
        ?? r103 = 0;
        ?? r104 = 0;
        ?? r105 = 0;
        ?? r106 = 0;
        ?? r107 = 0;
        ?? r108 = 0;
        ?? r109 = 0;
        ?? r1010 = 0;
        switch (i) {
            case 0:
                EsportsGame esportsGame = (EsportsGame) obj3;
                nz5 nz5Var = (nz5) this.B;
                ku3 ku3Var = (ku3) this.x;
                lu3 lu3Var = lu3.a;
                int i4 = this.w;
                if (i4 == 0) {
                    y6a.M(obj);
                    av4 t4 = xw3.t(ku3Var, null, new lz5(nz5Var, esportsGame, r104 == true ? 1 : 0, 3), 3);
                    t = xw3.t(ku3Var, null, new lz5(nz5Var, esportsGame, r103 == true ? 1 : 0, i2), 3);
                    t2 = xw3.t(ku3Var, null, new lz5(nz5Var, esportsGame, r102 == true ? 1 : 0, i3), 3);
                    av4 t5 = xw3.t(ku3Var, null, new lz5(nz5Var, esportsGame, r10 == true ? 1 : 0, 0), 3);
                    yzc yzcVar5 = nz5Var.i;
                    this.x = null;
                    this.s = t;
                    this.t = t2;
                    this.u = t5;
                    this.v = yzcVar5;
                    this.w = 1;
                    w = t4.w(this);
                    if (w != lu3Var) {
                        yzcVar = yzcVar5;
                        av4Var = t5;
                    }
                    return lu3Var;
                }
                if (i4 == 1) {
                    yzc yzcVar6 = (yzc) this.v;
                    ?? r4 = (zu4) this.u;
                    ?? r6 = (zu4) this.t;
                    t = (av4) this.s;
                    y6a.M(obj);
                    yzcVar = yzcVar6;
                    av4Var = r4;
                    t2 = r6;
                    w = obj;
                } else {
                    if (i4 == 2) {
                        esportsGameStatisticsResponse = (EsportsGameStatisticsResponse) this.y;
                        yzcVar = (yzc) this.v;
                        zu4Var = (zu4) this.u;
                        ?? r7 = (zu4) this.t;
                        y6a.M(obj);
                        t2 = r7;
                        T = obj;
                        ESportsGameLineupsResponse eSportsGameLineupsResponse2 = (ESportsGameLineupsResponse) T;
                        this.x = null;
                        this.s = null;
                        this.t = null;
                        this.u = zu4Var;
                        this.v = yzcVar;
                        this.y = esportsGameStatisticsResponse;
                        this.z = eSportsGameLineupsResponse2;
                        this.w = 3;
                        T2 = t2.T(this);
                        if (T2 != lu3Var) {
                            zu4 zu4Var5 = zu4Var;
                            yzcVar2 = yzcVar;
                            eSportsGameLineupsResponse = eSportsGameLineupsResponse2;
                            zu4Var2 = zu4Var5;
                            ESportsGameRoundsResponse eSportsGameRoundsResponse2 = (ESportsGameRoundsResponse) T2;
                            this.x = null;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = yzcVar2;
                            this.y = esportsGameStatisticsResponse;
                            this.z = eSportsGameLineupsResponse;
                            this.A = eSportsGameRoundsResponse2;
                            this.w = 4;
                            T3 = zu4Var2.T(this);
                            if (T3 != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i4 == 3) {
                        ESportsGameLineupsResponse eSportsGameLineupsResponse3 = (ESportsGameLineupsResponse) this.z;
                        EsportsGameStatisticsResponse esportsGameStatisticsResponse3 = (EsportsGameStatisticsResponse) this.y;
                        yzcVar2 = (yzc) this.v;
                        zu4Var2 = (zu4) this.u;
                        y6a.M(obj);
                        eSportsGameLineupsResponse = eSportsGameLineupsResponse3;
                        esportsGameStatisticsResponse = esportsGameStatisticsResponse3;
                        T2 = obj;
                        ESportsGameRoundsResponse eSportsGameRoundsResponse22 = (ESportsGameRoundsResponse) T2;
                        this.x = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = yzcVar2;
                        this.y = esportsGameStatisticsResponse;
                        this.z = eSportsGameLineupsResponse;
                        this.A = eSportsGameRoundsResponse22;
                        this.w = 4;
                        T3 = zu4Var2.T(this);
                        if (T3 != lu3Var) {
                            yzcVar3 = yzcVar2;
                            esportsGameStatisticsResponse2 = esportsGameStatisticsResponse;
                            eSportsGameRoundsResponse = eSportsGameRoundsResponse22;
                            yzcVar3.k(new kz5(esportsGameStatisticsResponse2, eSportsGameLineupsResponse, eSportsGameRoundsResponse, (ESportsBansResponse) T3));
                            this.x = null;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.w = 5;
                        }
                        return lu3Var;
                    }
                    if (i4 != 4) {
                        if (i4 == 5) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eSportsGameRoundsResponse = (ESportsGameRoundsResponse) this.A;
                    eSportsGameLineupsResponse = (ESportsGameLineupsResponse) this.z;
                    EsportsGameStatisticsResponse esportsGameStatisticsResponse4 = (EsportsGameStatisticsResponse) this.y;
                    yzc yzcVar7 = (yzc) this.v;
                    y6a.M(obj);
                    yzcVar3 = yzcVar7;
                    esportsGameStatisticsResponse2 = esportsGameStatisticsResponse4;
                    T3 = obj;
                    yzcVar3.k(new kz5(esportsGameStatisticsResponse2, eSportsGameLineupsResponse, eSportsGameRoundsResponse, (ESportsBansResponse) T3));
                    this.x = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.w = 5;
                    break;
                }
                EsportsGameStatisticsResponse esportsGameStatisticsResponse5 = (EsportsGameStatisticsResponse) w;
                this.x = null;
                this.s = null;
                this.t = t2;
                this.u = av4Var;
                this.v = yzcVar;
                this.y = esportsGameStatisticsResponse5;
                this.w = 2;
                T = t.T(this);
                if (T != lu3Var) {
                    zu4Var = av4Var;
                    esportsGameStatisticsResponse = esportsGameStatisticsResponse5;
                    ESportsGameLineupsResponse eSportsGameLineupsResponse22 = (ESportsGameLineupsResponse) T;
                    this.x = null;
                    this.s = null;
                    this.t = null;
                    this.u = zu4Var;
                    this.v = yzcVar;
                    this.y = esportsGameStatisticsResponse;
                    this.z = eSportsGameLineupsResponse22;
                    this.w = 3;
                    T2 = t2.T(this);
                    if (T2 != lu3Var) {
                    }
                }
                return lu3Var;
            case 1:
                Season season = (Season) obj3;
                zwa zwaVar = (zwa) this.B;
                ku3 ku3Var2 = (ku3) this.x;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.w;
                if (i5 == 0) {
                    y6a.M(obj);
                    int i6 = 3;
                    av4 t6 = xw3.t(ku3Var2, null, new wwa(zwaVar, season, r108 == true ? 1 : 0, i2), 3);
                    av4 t7 = xw3.t(ku3Var2, null, new wwa(zwaVar, season, r107 == true ? 1 : 0, 0), 3);
                    t3 = xw3.t(ku3Var2, null, new wwa(zwaVar, season, r106 == true ? 1 : 0, i3), 3);
                    Tournament tournament = zwaVar.j;
                    if (tournament == null) {
                        Intrinsics.i("tournament");
                        throw null;
                    }
                    UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                    p = yaa.p(ku3Var2, Intrinsics.c(uniqueTournament != null ? uniqueTournament.getSportSlug() : null, Sports.TENNIS), new wwa(zwaVar, season, r105 == true ? 1 : 0, i6));
                    this.x = null;
                    this.s = t7;
                    this.t = t3;
                    this.u = p;
                    this.w = 1;
                    w2 = t6.w(this);
                    if (w2 != lu3Var2) {
                        av4Var2 = t7;
                    }
                    return lu3Var2;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        uniqueTournamentRoundsResponse = (UniqueTournamentRoundsResponse) this.y;
                        yzcVar4 = (yzc) this.v;
                        zu4Var3 = (zu4) this.u;
                        ?? r62 = (zu4) this.t;
                        y6a.M(obj);
                        t3 = r62;
                        T4 = obj;
                        UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse3 = (UniqueTournamentGroupsResponse) T4;
                        this.x = null;
                        this.s = null;
                        this.t = null;
                        this.u = zu4Var3;
                        this.v = yzcVar4;
                        this.y = uniqueTournamentRoundsResponse;
                        this.z = uniqueTournamentGroupsResponse3;
                        this.w = 3;
                        T5 = t3.T(this);
                        if (T5 != lu3Var2) {
                            zu4 zu4Var6 = zu4Var3;
                            uniqueTournamentRoundsResponse2 = uniqueTournamentRoundsResponse;
                            uniqueTournamentGroupsResponse = uniqueTournamentGroupsResponse3;
                            zu4Var4 = zu4Var6;
                            uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) T5;
                            if (zu4Var4 != null) {
                            }
                            yzcVar4.j(new vwa(uniqueTournamentRoundsResponse2, uniqueTournamentGroupsResponse, uniqueTournamentTeamsResponse, uniqueTournamentVenuesResponse));
                            return Unit.a;
                        }
                        return lu3Var2;
                    }
                    if (i5 != 3) {
                        if (i5 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uniqueTournamentTeamsResponse2 = (UniqueTournamentTeamsResponse) this.A;
                        UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse4 = (UniqueTournamentGroupsResponse) this.z;
                        UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse3 = (UniqueTournamentRoundsResponse) this.y;
                        yzc yzcVar8 = (yzc) this.v;
                        y6a.M(obj);
                        uniqueTournamentRoundsResponse2 = uniqueTournamentRoundsResponse3;
                        uniqueTournamentGroupsResponse2 = uniqueTournamentGroupsResponse4;
                        yzcVar4 = yzcVar8;
                        T6 = obj;
                        uniqueTournamentVenuesResponse = (UniqueTournamentVenuesResponse) T6;
                        uniqueTournamentTeamsResponse = uniqueTournamentTeamsResponse2;
                        uniqueTournamentGroupsResponse = uniqueTournamentGroupsResponse2;
                        yzcVar4.j(new vwa(uniqueTournamentRoundsResponse2, uniqueTournamentGroupsResponse, uniqueTournamentTeamsResponse, uniqueTournamentVenuesResponse));
                        return Unit.a;
                    }
                    uniqueTournamentGroupsResponse = (UniqueTournamentGroupsResponse) this.z;
                    UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse4 = (UniqueTournamentRoundsResponse) this.y;
                    yzc yzcVar9 = (yzc) this.v;
                    zu4Var4 = (zu4) this.u;
                    y6a.M(obj);
                    uniqueTournamentRoundsResponse2 = uniqueTournamentRoundsResponse4;
                    yzcVar4 = yzcVar9;
                    T5 = obj;
                    uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) T5;
                    if (zu4Var4 != null) {
                        this.x = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = yzcVar4;
                        this.y = uniqueTournamentRoundsResponse2;
                        this.z = uniqueTournamentGroupsResponse;
                        this.A = uniqueTournamentTeamsResponse;
                        this.w = 4;
                        T6 = zu4Var4.T(this);
                        if (T6 != lu3Var2) {
                            uniqueTournamentGroupsResponse2 = uniqueTournamentGroupsResponse;
                            uniqueTournamentTeamsResponse2 = uniqueTournamentTeamsResponse;
                            uniqueTournamentVenuesResponse = (UniqueTournamentVenuesResponse) T6;
                            uniqueTournamentTeamsResponse = uniqueTournamentTeamsResponse2;
                            uniqueTournamentGroupsResponse = uniqueTournamentGroupsResponse2;
                        }
                        return lu3Var2;
                    }
                    yzcVar4.j(new vwa(uniqueTournamentRoundsResponse2, uniqueTournamentGroupsResponse, uniqueTournamentTeamsResponse, uniqueTournamentVenuesResponse));
                    return Unit.a;
                }
                p = (zu4) this.u;
                ?? r42 = (zu4) this.t;
                av4Var2 = (av4) this.s;
                y6a.M(obj);
                t3 = r42;
                w2 = obj;
                ?? r43 = (UniqueTournamentRoundsResponse) w2;
                if (r43 != null) {
                    List<Round> rounds = r43.getRounds();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : rounds) {
                        Integer round = ((Round) obj4).getRound();
                        if ((round != null ? round.intValue() : 0) >= 0) {
                            arrayList.add(obj4);
                        }
                    }
                    r43.setRounds(arrayList);
                }
                yzc yzcVar10 = zwaVar.h;
                this.x = null;
                this.s = null;
                this.t = t3;
                this.u = p;
                this.v = yzcVar10;
                this.y = r43;
                this.w = 2;
                T4 = av4Var2.T(this);
                if (T4 != lu3Var2) {
                    zu4 zu4Var7 = p;
                    yzcVar4 = yzcVar10;
                    uniqueTournamentRoundsResponse = r43;
                    zu4Var3 = zu4Var7;
                    UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse32 = (UniqueTournamentGroupsResponse) T4;
                    this.x = null;
                    this.s = null;
                    this.t = null;
                    this.u = zu4Var3;
                    this.v = yzcVar4;
                    this.y = uniqueTournamentRoundsResponse;
                    this.z = uniqueTournamentGroupsResponse32;
                    this.w = 3;
                    T5 = t3.T(this);
                    if (T5 != lu3Var2) {
                    }
                }
                return lu3Var2;
            case 2:
                ybf ybfVar = (ybf) obj3;
                yzc yzcVar11 = ybfVar.j;
                ku3 ku3Var3 = (ku3) this.x;
                lu3 lu3Var3 = lu3.a;
                int i7 = this.w;
                if (i7 == 0) {
                    y6a.M(obj);
                    av4 t8 = xw3.t(ku3Var3, null, new ppa(ybfVar, r109 == true ? 1 : 0, 27), 3);
                    if (ybfVar.l && !ybfVar.m) {
                        ybfVar.l = false;
                        profileData = (ProfileData) ybfVar.i.d();
                        if (profileData == null) {
                            this.x = ku3Var3;
                            this.w = 1;
                            w3 = t8.w(this);
                            break;
                        }
                        if (profileData == null) {
                            ybfVar.m = true;
                            a3l a3lVar = ybfVar.e;
                            this.x = ku3Var3;
                            this.t = profileData;
                            this.w = 2;
                            c = a3lVar.c(this);
                            break;
                        } else {
                            yzcVar11.j(null);
                            ybfVar.l = true;
                        }
                    }
                    return Unit.a;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    w3 = obj;
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            O = (b7) this.u;
                            profileData = (ProfileData) this.t;
                            y6a.M(obj);
                            w4 = obj;
                            WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse2 = (WeeklyChallengeLeaderboardResponse) w4;
                            av4 t9 = xw3.t(ku3Var3, null, new xbf(profileData, ybfVar, (rq3) null), 3);
                            VoteStatisticsWrapper voteStatistics3 = profileData.getVoteStatistics();
                            if (voteStatistics3 == null || (voteStatistics = voteStatistics3.getAllTime()) == null || Intrinsics.c(voteStatistics.getCorrect(), "0") || Intrinsics.c(voteStatistics.getPercentage(), "0")) {
                                voteStatistics = null;
                            }
                            dhk dhkVar = ybfVar.f;
                            String str = ybfVar.n;
                            this.x = null;
                            this.t = profileData;
                            this.u = O;
                            this.y = weeklyChallengeLeaderboardResponse2;
                            this.s = t9;
                            this.z = voteStatistics;
                            this.w = 4;
                            dhkVar.getClass();
                            P = yaa.P(new hgk(dhkVar, str, r1010 == true ? 1 : 0, 7), this);
                            if (P != lu3Var3) {
                                ProfileData profileData3 = profileData;
                                b7Var = O;
                                av4Var3 = t9;
                                weeklyChallengeLeaderboardResponse = weeklyChallengeLeaderboardResponse2;
                                profileData2 = profileData3;
                                voteStatistics2 = voteStatistics;
                                xbb b2 = a.b();
                                userSubscriptionsResponse = (UserSubscriptionsResponse) yaa.x((x2g) P);
                                if (userSubscriptionsResponse != null) {
                                }
                                a = a.a(b2);
                                if (b7Var == null) {
                                }
                                this.x = null;
                                this.t = profileData2;
                                this.u = null;
                                this.y = null;
                                this.s = null;
                                this.z = voteStatistics2;
                                this.A = a;
                                this.v = yzcVar11;
                                this.B = p4bVar;
                                this.w = 5;
                                T7 = av4Var3.T(this);
                                if (T7 != lu3Var3) {
                                }
                            }
                            return lu3Var3;
                        }
                        if (i7 != 4) {
                            if (i7 != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p4b p4bVar3 = (p4b) this.B;
                            yzc yzcVar12 = (yzc) this.v;
                            a = (xbb) this.A;
                            voteStatistics2 = (VoteStatistics) this.z;
                            ProfileData profileData4 = (ProfileData) this.t;
                            y6a.M(obj);
                            profileData2 = profileData4;
                            p4bVar2 = p4bVar3;
                            yzcVar11 = yzcVar12;
                            T7 = obj;
                            yzcVar11.j(new wbf(p4bVar2, (EditorsEventsCountResponse) T7, profileData2.isActiveCrowdsourcer(), voteStatistics2, a, new k3l(profileData2.getWeeklyChallengeCurrentWeeklyStreak(), profileData2.getWeeklyChallengeMaxWeeklyStreak())));
                            ybfVar.l = true;
                            return Unit.a;
                        }
                        voteStatistics2 = (VoteStatistics) this.z;
                        av4Var3 = (av4) this.s;
                        weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) this.y;
                        b7Var = (b7) this.u;
                        profileData2 = (ProfileData) this.t;
                        y6a.M(obj);
                        P = obj;
                        xbb b22 = a.b();
                        userSubscriptionsResponse = (UserSubscriptionsResponse) yaa.x((x2g) P);
                        if (userSubscriptionsResponse != null) {
                            b22.addAll(CollectionsKt.L0(CollectionsKt.H0(userSubscriptionsResponse.getSubscriptions().getLeagues(), new laf(1)), 2));
                            b22.addAll(CollectionsKt.L0(CollectionsKt.H0(userSubscriptionsResponse.getSubscriptions().getTeams(), new laf(2)), 2));
                            b22.addAll(CollectionsKt.L0(CollectionsKt.H0(userSubscriptionsResponse.getSubscriptions().getPlayers(), new laf(3)), 2));
                        }
                        a = a.a(b22);
                        if (b7Var == null) {
                            ListIterator<Object> listIterator = b7Var.listIterator(0);
                            while (true) {
                                if (listIterator.hasNext()) {
                                    obj2 = listIterator.next();
                                    p4b p4bVar4 = (p4b) obj2;
                                    if (weeklyChallengeLeaderboardResponse == null || (league = weeklyChallengeLeaderboardResponse.getLeague()) == null || p4bVar4.g != league.getLevel()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            p4bVar = (p4b) obj2;
                        } else {
                            p4bVar = null;
                        }
                        this.x = null;
                        this.t = profileData2;
                        this.u = null;
                        this.y = null;
                        this.s = null;
                        this.z = voteStatistics2;
                        this.A = a;
                        this.v = yzcVar11;
                        this.B = p4bVar;
                        this.w = 5;
                        T7 = av4Var3.T(this);
                        if (T7 != lu3Var3) {
                            p4bVar2 = p4bVar;
                            yzcVar11.j(new wbf(p4bVar2, (EditorsEventsCountResponse) T7, profileData2.isActiveCrowdsourcer(), voteStatistics2, a, new k3l(profileData2.getWeeklyChallengeCurrentWeeklyStreak(), profileData2.getWeeklyChallengeMaxWeeklyStreak())));
                            ybfVar.l = true;
                            return Unit.a;
                        }
                        return lu3Var3;
                    }
                    ProfileData profileData5 = (ProfileData) this.t;
                    y6a.M(obj);
                    profileData = profileData5;
                    c = obj;
                    WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) c;
                    List<WeeklyChallengeLeagueAsset> meta = weeklyChallengeAssetsResponse != null ? weeklyChallengeAssetsResponse.getMeta() : null;
                    O = meta != null ? waa.O(meta) : null;
                    av4 t10 = xw3.t(ku3Var3, null, new xbf(ybfVar, profileData, (rq3) null), 3);
                    this.x = ku3Var3;
                    this.t = profileData;
                    this.u = O;
                    this.w = 3;
                    w4 = t10.w(this);
                    break;
                }
                profileData = (ProfileData) w3;
                if (profileData == null) {
                }
                break;
            default:
                esf esfVar = (esf) this.u;
                kqf kqfVar = (kqf) this.t;
                fdi fdiVar = (fdi) this.v;
                lu3 lu3Var4 = lu3.a;
                int i8 = this.w;
                if (i8 == 0) {
                    y6a.M(obj);
                    int ordinal = ((iqf) this.x).ordinal();
                    if (ordinal == 0) {
                        s9a.o((ku3) obj3, null);
                    } else if (ordinal == 4) {
                        if (kqfVar.a > esfVar.a || !((Boolean) fdiVar.getValue()).booleanValue()) {
                            af0 af0Var = (af0) this.s;
                            Context context = (Context) this.y;
                            yk5 yk5Var = (yk5) ((eyf) this.z).copy();
                            this.w = 1;
                            b = af0Var.b(context, yk5Var, this);
                            break;
                        }
                        esfVar.a = kqfVar.a;
                    }
                    return Unit.a;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    ((zij) this.A).b(((uij) this.B).a);
                    esfVar.a = kqfVar.a;
                    return Unit.a;
                }
                y6a.M(obj);
                b = obj;
                boolean booleanValue = ((Boolean) b).booleanValue();
                if (!((Boolean) fdiVar.getValue()).booleanValue() && booleanValue) {
                    Boolean bool = Boolean.TRUE;
                    this.w = 2;
                    fdiVar.m(null, bool);
                    break;
                }
                esfVar.a = kqfVar.a;
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz5(q8 q8Var, Serializable serializable, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.B = q8Var;
        this.C = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz5(ybf ybfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.C = ybfVar;
    }
}
