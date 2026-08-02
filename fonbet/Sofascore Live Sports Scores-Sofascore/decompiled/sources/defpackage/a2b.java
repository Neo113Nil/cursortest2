package defpackage;

import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a2b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ w3b u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2b(w3b w3bVar, int i, int i2, String str, String str2, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = 2;
        this.u = w3bVar;
        this.v = i;
        this.w = i2;
        this.t = str;
        this.x = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new a2b(this.t, this.u, this.v, this.w, this.x, rq3Var, 0);
            case 1:
                return new a2b(this.t, this.u, this.v, this.w, this.x, rq3Var, 1);
            default:
                return new a2b(this.u, this.v, this.w, this.t, this.x, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((a2b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r0 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r0 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
    
        if (r0 == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r0 == r10) goto L46;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object leagueTopPlayers;
        Object leagueTopPlayersByPosition;
        Object leagueTopStats;
        Object leagueTopStatsByPosition;
        int i = this.r;
        String str = this.x;
        int i2 = this.w;
        int i3 = this.v;
        w3b w3bVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        leagueTopPlayersByPosition = obj;
                        return (TopPerformanceResponse) leagueTopPlayersByPosition;
                    }
                    if (i4 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    leagueTopPlayers = obj;
                    return (TopPerformanceResponse) leagueTopPlayers;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                String str2 = this.t;
                if (str2 == null) {
                    this.s = 2;
                    leagueTopPlayers = networkCoroutineAPI.leagueTopPlayers(i3, i2, str, this);
                    break;
                } else {
                    this.s = 1;
                    leagueTopPlayersByPosition = networkCoroutineAPI.leagueTopPlayersByPosition(this.v, this.w, this.x, str2, this);
                    break;
                }
                return lu3Var;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        leagueTopStatsByPosition = obj;
                        return (TopPerformanceResponse) leagueTopStatsByPosition;
                    }
                    if (i5 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    leagueTopStats = obj;
                    return (TopPerformanceResponse) leagueTopStats;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                String str3 = this.t;
                if (str3 == null) {
                    this.s = 2;
                    leagueTopStats = networkCoroutineAPI2.leagueTopStats(i3, i2, str, this);
                    break;
                } else {
                    this.s = 1;
                    leagueTopStatsByPosition = networkCoroutineAPI2.leagueTopStatsByPosition(this.v, this.w, str3, this.x, this);
                    break;
                }
                return lu3Var2;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
                this.s = 1;
                Object leagueTopTeamsByDivision = networkCoroutineAPI3.leagueTopTeamsByDivision(this.v, this.w, this.t, this.x, this);
                return leagueTopTeamsByDivision == lu3Var3 ? lu3Var3 : leagueTopTeamsByDivision;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2b(String str, w3b w3bVar, int i, int i2, String str2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = str;
        this.u = w3bVar;
        this.v = i;
        this.w = i2;
        this.x = str2;
    }
}
