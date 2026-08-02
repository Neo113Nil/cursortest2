package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gzi extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ j0j t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gzi(j0j j0jVar, int i, int i2, int i3, String str, rq3 rq3Var, int i4) {
        super(1, rq3Var);
        this.r = i4;
        this.t = j0jVar;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new gzi(this.t, this.u, this.v, this.w, this.x, rq3Var, 0);
            case 1:
                return new gzi(this.t, this.u, this.v, this.w, this.x, rq3Var, 1);
            case 2:
                return new gzi(this.t, this.u, this.v, this.w, this.x, rq3Var, 2);
            case 3:
                return new gzi(this.t, this.u, this.v, this.w, this.x, rq3Var, 3);
            default:
                return new gzi(this.t, this.u, this.v, this.w, this.x, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((gzi) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        j0j j0jVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = j0jVar.b;
                this.s = 1;
                Object rankedTeamSeasonStatistics = networkCoroutineAPI.rankedTeamSeasonStatistics(this.u, this.v, this.w, this.x, this);
                return rankedTeamSeasonStatistics == lu3Var ? lu3Var : rankedTeamSeasonStatistics;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = j0jVar.b;
                this.s = 1;
                Object teamPlayerStatistics = networkCoroutineAPI2.teamPlayerStatistics(this.u, this.v, this.w, this.x, this);
                return teamPlayerStatistics == lu3Var2 ? lu3Var2 : teamPlayerStatistics;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = j0jVar.b;
                this.s = 1;
                Object teamStatistics = networkCoroutineAPI3.teamStatistics(this.u, this.v, this.w, this.x, this);
                return teamStatistics == lu3Var3 ? lu3Var3 : teamStatistics;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = j0jVar.b;
                this.s = 1;
                Object teamTopPlayers = networkCoroutineAPI4.teamTopPlayers(this.u, this.v, this.w, this.x, this);
                return teamTopPlayers == lu3Var4 ? lu3Var4 : teamTopPlayers;
            default:
                lu3 lu3Var5 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = j0jVar.b;
                this.s = 1;
                Object hasTeamTopPlayers = networkCoroutineAPI5.hasTeamTopPlayers(this.u, this.v, this.w, this.x, this);
                return hasTeamTopPlayers == lu3Var5 ? lu3Var5 : hasTeamTopPlayers;
        }
    }
}
