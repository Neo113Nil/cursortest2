package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import com.sofascore.model.newNetwork.newRankings.RankingsSummaryResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ovi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ pvi t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovi(pvi pviVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = pviVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        pvi pviVar = this.t;
        switch (i) {
            case 0:
                return new ovi(pviVar, i2, rq3Var, 0);
            case 1:
                return new ovi(pviVar, i2, rq3Var, 1);
            case 2:
                return new ovi(pviVar, i2, rq3Var, 2);
            case 3:
                return new ovi(pviVar, i2, rq3Var, 3);
            case 4:
                return new ovi(pviVar, i2, rq3Var, 4);
            case 5:
                return new ovi(pviVar, i2, rq3Var, 5);
            case 6:
                return new ovi(pviVar, i2, rq3Var, 6);
            case 7:
                return new ovi(pviVar, i2, rq3Var, 7);
            default:
                return new ovi(pviVar, i2, rq3Var, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ovi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        pvi pviVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = pviVar.f;
                    this.s = 1;
                    obj = j0jVar.j(i2, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                TeamAchievementsResponse teamAchievementsResponse = (TeamAchievementsResponse) obj;
                if (teamAchievementsResponse == null) {
                    return null;
                }
                List<UniqueTournamentAchievements> achievements = teamAchievementsResponse.getAchievements();
                return TeamAchievementsResponse.copy$default(teamAchievementsResponse, null, achievements != null ? CollectionsKt.H0(achievements, new o5i(new q6i(7), 3)) : null, null, 5, null);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar2 = pviVar.f;
                this.s = 1;
                Serializable m = j0jVar2.m(i2, this);
                return m == lu3Var2 ? lu3Var2 : m;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    j0j j0jVar3 = pviVar.f;
                    this.s = 1;
                    obj = j0jVar3.o(i2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                RankingsSummaryResponse rankingsSummaryResponse = (RankingsSummaryResponse) obj;
                if (rankingsSummaryResponse != null) {
                    return rankingsSummaryResponse.getRankings();
                }
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                j0j j0jVar4 = pviVar.f;
                this.s = 1;
                j0jVar4.getClass();
                Object P = yaa.P(new azi(j0jVar4, i2, null, 4), this);
                return P == lu3Var4 ? lu3Var4 : P;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                j0j j0jVar5 = pviVar.f;
                this.s = 1;
                j0jVar5.getClass();
                Object P2 = yaa.P(new azi(j0jVar5, i2, null, 19), this);
                return P2 == lu3Var5 ? lu3Var5 : P2;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar6 = pviVar.f;
                this.s = 1;
                j0jVar6.getClass();
                Object P3 = yaa.P(new azi(j0jVar6, i2, null, 20), this);
                return P3 == lu3Var6 ? lu3Var6 : P3;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                j0j j0jVar7 = pviVar.f;
                Context i10 = pviVar.i();
                this.s = 1;
                Object H = j0jVar7.H(i10, i2, this);
                return H == lu3Var7 ? lu3Var7 : H;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar8 = pviVar.f;
                this.s = 1;
                j0jVar8.getClass();
                Object P4 = yaa.P(new azi(j0jVar8, i2, null, 11), this);
                return P4 == lu3Var8 ? lu3Var8 : P4;
            default:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar9 = pviVar.f;
                this.s = 1;
                Object u = j0jVar9.u(i2, this);
                return u == lu3Var9 ? lu3Var9 : u;
        }
    }
}
