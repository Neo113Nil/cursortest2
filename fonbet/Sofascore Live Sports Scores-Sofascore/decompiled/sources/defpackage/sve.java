package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sve extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sve(w3b w3bVar, int i, int i2, String str, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = 3;
        this.t = w3bVar;
        this.u = i;
        this.v = i2;
        this.x = str;
        this.w = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.t;
        switch (i) {
            case 0:
                return new sve((wve) obj, this.u, this.v, this.w, this.x, rq3Var, 0);
            case 1:
                return new sve((wve) obj, this.u, this.v, this.w, this.x, rq3Var, 1);
            case 2:
                return new sve((wve) obj, this.u, this.v, this.w, this.x, rq3Var, 2);
            default:
                return new sve((w3b) obj, this.u, this.v, this.x, rq3Var, this.w);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((sve) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = ((wve) obj2).b;
                this.s = 1;
                Object playerSeasonRatings = networkCoroutineAPI.playerSeasonRatings(this.u, this.v, this.w, this.x, this);
                return playerSeasonRatings == lu3Var ? lu3Var : playerSeasonRatings;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = ((wve) obj2).b;
                this.s = 1;
                Object playerSeasonStatistics = networkCoroutineAPI2.playerSeasonStatistics(this.u, this.v, this.w, this.x, this);
                return playerSeasonStatistics == lu3Var2 ? lu3Var2 : playerSeasonStatistics;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = ((wve) obj2).b;
                this.s = 1;
                Object playerSubSeasonShotActions = networkCoroutineAPI3.playerSubSeasonShotActions(this.u, this.v, this.w, this.x, this);
                return playerSubSeasonShotActions == lu3Var3 ? lu3Var3 : playerSubSeasonShotActions;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI4 = ((w3b) obj2).b;
                this.s = 1;
                Object obj3 = networkCoroutineAPI4.tournamentSeasonEvents(this.u, this.v, this.x, this.w, this);
                return obj3 == lu3Var4 ? lu3Var4 : obj3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sve(wve wveVar, int i, int i2, int i3, String str, rq3 rq3Var, int i4) {
        super(1, rq3Var);
        this.r = i4;
        this.t = wveVar;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = str;
    }
}
