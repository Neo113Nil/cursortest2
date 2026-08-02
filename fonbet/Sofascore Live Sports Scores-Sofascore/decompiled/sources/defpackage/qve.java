package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qve extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wve t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qve(wve wveVar, int i, int i2, int i3, rq3 rq3Var, int i4) {
        super(1, rq3Var);
        this.r = i4;
        this.t = wveVar;
        this.u = i;
        this.v = i2;
        this.w = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new qve(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new qve(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((qve) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.w;
        int i3 = this.v;
        int i4 = this.u;
        wve wveVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI = wveVar.b;
                this.s = 1;
                Object playerPenaltyHistory = networkCoroutineAPI.playerPenaltyHistory(i4, i3, i2, this);
                return playerPenaltyHistory == lu3Var ? lu3Var : playerPenaltyHistory;
            default:
                lu3 lu3Var2 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = wveVar.b;
                this.s = 1;
                Object playerSeasonHeatMap = networkCoroutineAPI2.playerSeasonHeatMap(i4, i3, i2, this);
                return playerSeasonHeatMap == lu3Var2 ? lu3Var2 : playerSeasonHeatMap;
        }
    }
}
