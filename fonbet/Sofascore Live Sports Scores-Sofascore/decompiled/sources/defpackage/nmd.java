package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nmd extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ Stage u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nmd(umd umdVar, Stage stage, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.u = stage;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new nmd(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new nmd(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((nmd) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        Stage stage = this.u;
        umd umdVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = umdVar.a;
                int id = stage.getId();
                this.s = 1;
                Object stageAllOdds = networkCoroutineAPI.stageAllOdds(id, i2, this);
                return stageAllOdds == lu3Var ? lu3Var : stageAllOdds;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI2 = umdVar.a;
                int id2 = stage.getId();
                this.s = 1;
                Object stageFeaturedOdds = networkCoroutineAPI2.stageFeaturedOdds(id2, i2, this);
                return stageFeaturedOdds == lu3Var2 ? lu3Var2 : stageFeaturedOdds;
        }
    }
}
