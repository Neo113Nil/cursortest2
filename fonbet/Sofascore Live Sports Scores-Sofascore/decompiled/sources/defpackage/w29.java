package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w29 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ g39 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w29(g39 g39Var, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = g39Var;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new w29(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new w29(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new w29(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new w29(this.t, this.u, this.v, rq3Var, 3);
            case 4:
                return new w29(this.t, this.u, this.v, rq3Var, 4);
            case 5:
                return new w29(this.t, this.u, this.v, rq3Var, 5);
            case 6:
                return new w29(this.t, this.u, this.v, rq3Var, 6);
            case 7:
                return new w29(this.t, this.u, this.v, rq3Var, 7);
            default:
                return new w29(this.t, this.u, this.v, rq3Var, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((w29) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        g39 g39Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI = g39Var.a;
                this.s = 1;
                Object basketballTeamEventShotmap = networkCoroutineAPI.getBasketballTeamEventShotmap(i3, i2, this);
                return basketballTeamEventShotmap == lu3Var ? lu3Var : basketballTeamEventShotmap;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = g39Var.a;
                this.s = 1;
                Object eventTeamHeatMap = networkCoroutineAPI2.getEventTeamHeatMap(i3, i2, this);
                return eventTeamHeatMap == lu3Var2 ? lu3Var2 : eventTeamHeatMap;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = g39Var.a;
                this.s = 1;
                Object footballGoalkeeperEventShotmap = networkCoroutineAPI3.getFootballGoalkeeperEventShotmap(i3, i2, this);
                return footballGoalkeeperEventShotmap == lu3Var3 ? lu3Var3 : footballGoalkeeperEventShotmap;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = g39Var.a;
                this.s = 1;
                Object footballPlayerEventRatingBreakdown = networkCoroutineAPI4.getFootballPlayerEventRatingBreakdown(i3, i2, this);
                return footballPlayerEventRatingBreakdown == lu3Var4 ? lu3Var4 : footballPlayerEventRatingBreakdown;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = g39Var.a;
                this.s = 1;
                Object footballPlayerEventShotmap = networkCoroutineAPI5.getFootballPlayerEventShotmap(i3, i2, this);
                return footballPlayerEventShotmap == lu3Var5 ? lu3Var5 : footballPlayerEventShotmap;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = g39Var.a;
                this.s = 1;
                Object heatMap = networkCoroutineAPI6.heatMap(i3, i2, this);
                return heatMap == lu3Var6 ? lu3Var6 : heatMap;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = g39Var.a;
                this.s = 1;
                Object playerEventHeatmap = networkCoroutineAPI7.playerEventHeatmap(i3, i2, this);
                return playerEventHeatmap == lu3Var7 ? lu3Var7 : playerEventHeatmap;
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
                NetworkCoroutineAPI networkCoroutineAPI8 = g39Var.a;
                this.s = 1;
                Object eventPlayerShotMap = networkCoroutineAPI8.eventPlayerShotMap(i3, i2, this);
                return eventPlayerShotMap == lu3Var8 ? lu3Var8 : eventPlayerShotMap;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = g39Var.a;
                this.s = 1;
                Object seasonShotActionAreas = networkCoroutineAPI9.getSeasonShotActionAreas(i3, i2, "team", this);
                return seasonShotActionAreas == lu3Var9 ? lu3Var9 : seasonShotActionAreas;
        }
    }
}
