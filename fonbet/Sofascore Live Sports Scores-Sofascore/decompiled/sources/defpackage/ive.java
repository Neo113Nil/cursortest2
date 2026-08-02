package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ive extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wve t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ive(wve wveVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wveVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        wve wveVar = this.t;
        switch (i) {
            case 0:
                return new ive(wveVar, i2, rq3Var, 0);
            case 1:
                return new ive(wveVar, i2, rq3Var, 1);
            case 2:
                return new ive(wveVar, i2, rq3Var, 2);
            case 3:
                return new ive(wveVar, i2, rq3Var, 3);
            case 4:
                return new ive(wveVar, i2, rq3Var, 4);
            case 5:
                return new ive(wveVar, i2, rq3Var, 5);
            case 6:
                return new ive(wveVar, i2, rq3Var, 6);
            case 7:
                return new ive(wveVar, i2, rq3Var, 7);
            case 8:
                return new ive(wveVar, i2, rq3Var, 8);
            default:
                return new ive(wveVar, i2, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ive) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        wve wveVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = wveVar.b;
                this.s = 1;
                Object goalkeeperPenaltyHistory = networkCoroutineAPI.goalkeeperPenaltyHistory(i2, this);
                return goalkeeperPenaltyHistory == lu3Var ? lu3Var : goalkeeperPenaltyHistory;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = wveVar.b;
                this.s = 1;
                Object playerAttributeOverview = networkCoroutineAPI2.playerAttributeOverview(i2, this);
                return playerAttributeOverview == lu3Var2 ? lu3Var2 : playerAttributeOverview;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = wveVar.b;
                this.s = 1;
                Object playerCharacteristics = networkCoroutineAPI3.playerCharacteristics(i2, this);
                return playerCharacteristics == lu3Var3 ? lu3Var3 : playerCharacteristics;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = wveVar.b;
                this.s = 1;
                Object playerDetails = networkCoroutineAPI4.playerDetails(i2, this);
                return playerDetails == lu3Var4 ? lu3Var4 : playerDetails;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = wveVar.b;
                this.s = 1;
                Object playerNationalTeamStatistics = networkCoroutineAPI5.playerNationalTeamStatistics(i2, this);
                return playerNationalTeamStatistics == lu3Var5 ? lu3Var5 : playerNationalTeamStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = wveVar.b;
                this.s = 1;
                Object playerPenaltyHistory = networkCoroutineAPI6.playerPenaltyHistory(i2, this);
                return playerPenaltyHistory == lu3Var6 ? lu3Var6 : playerPenaltyHistory;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = wveVar.b;
                this.s = 1;
                Object playerStatisticsSeasons = networkCoroutineAPI7.playerStatisticsSeasons(i2, this);
                return playerStatisticsSeasons == lu3Var7 ? lu3Var7 : playerStatisticsSeasons;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI8 = wveVar.b;
                this.s = 1;
                Object playerTournaments = networkCoroutineAPI8.playerTournaments(i2, this);
                return playerTournaments == lu3Var8 ? lu3Var8 : playerTournaments;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = wveVar.b;
                this.s = 1;
                Object playerYearSummary = networkCoroutineAPI9.playerYearSummary(i2, this);
                return playerYearSummary == lu3Var9 ? lu3Var9 : playerYearSummary;
            default:
                lu3 lu3Var10 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI10 = wveVar.b;
                this.s = 1;
                Object playerTransferHistory = networkCoroutineAPI10.playerTransferHistory(i2, this);
                return playerTransferHistory == lu3Var10 ? lu3Var10 : playerTransferHistory;
        }
    }
}
