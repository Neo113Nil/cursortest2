package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ove extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wve t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ove(wve wveVar, int i, int i2, String str, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = wveVar;
        this.u = i;
        this.v = i2;
        this.w = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ove(this.t, this.u, this.v, this.w, rq3Var, 0);
            case 1:
                return new ove(this.t, this.u, this.v, this.w, rq3Var, 1);
            default:
                return new ove(this.t, this.u, this.v, this.w, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ove) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.w;
        int i2 = this.v;
        int i3 = this.u;
        wve wveVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = wveVar.b;
                this.s = 1;
                Object playerTournamentStatistics = networkCoroutineAPI.playerTournamentStatistics(i3, i2, str, this);
                return playerTournamentStatistics == lu3Var ? lu3Var : playerTournamentStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = wveVar.b;
                this.s = 1;
                Object baseballPlayerRankedSeasonStatistics = networkCoroutineAPI2.baseballPlayerRankedSeasonStatistics(i3, i2, str, this);
                return baseballPlayerRankedSeasonStatistics == lu3Var2 ? lu3Var2 : baseballPlayerRankedSeasonStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = wveVar.b;
                this.s = 1;
                Object subSeasonShotActionAreas = networkCoroutineAPI3.subSeasonShotActionAreas(this.u, this.v, SearchResponseKt.PLAYER_ENTITY, this.w, this);
                return subSeasonShotActionAreas == lu3Var3 ? lu3Var3 : subSeasonShotActionAreas;
        }
    }
}
