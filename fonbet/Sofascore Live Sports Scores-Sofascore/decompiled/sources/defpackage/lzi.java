package defpackage;

import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamYearlyStatisticsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lzi extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ j0j t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzi(j0j j0jVar, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = j0jVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new lzi(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new lzi(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new lzi(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new lzi(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((lzi) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r10 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r10 == r0) goto L34;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        int i2 = this.u;
        j0j j0jVar = this.t;
        rq3 rq3Var = null;
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
                NetworkCoroutineAPI networkCoroutineAPI = j0jVar.b;
                this.s = 1;
                Object teamEventsByMonth = networkCoroutineAPI.getTeamEventsByMonth(i2, str, this);
                return teamEventsByMonth == lu3Var ? lu3Var : teamEventsByMonth;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                int i5 = 2;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = j0jVar.b;
                    this.s = 1;
                    obj = networkCoroutineAPI2.getTennisTeamYearlyStatistics(i2, str, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return (Map) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<TennisTeamSeasonStatistics> statistics = ((TennisTeamYearlyStatisticsResponse) obj).getStatistics();
                hs4 hs4Var = z45.a;
                k36 k36Var = new k36(i5, statistics, rq3Var);
                this.s = 2;
                obj = xw3.R(hs4Var, k36Var, this);
                break;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = j0jVar.b;
                this.s = 1;
                Object hasTeamEventList = networkCoroutineAPI3.hasTeamEventList(i2, str, 0, this);
                return hasTeamEventList == lu3Var3 ? lu3Var3 : hasTeamEventList;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI4 = j0jVar.b;
                this.s = 1;
                Object hasTeamEventsByMonth = networkCoroutineAPI4.hasTeamEventsByMonth(i2, str, this);
                return hasTeamEventsByMonth == lu3Var4 ? lu3Var4 : hasTeamEventsByMonth;
        }
    }
}
