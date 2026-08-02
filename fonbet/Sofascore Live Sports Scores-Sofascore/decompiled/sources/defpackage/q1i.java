package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StageSportSeasonsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q1i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public yzc s;
    public int t;
    public final /* synthetic */ r1i u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1i(r1i r1iVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = r1iVar;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.v;
        r1i r1iVar = this.u;
        switch (i) {
            case 0:
                return new q1i(r1iVar, i2, rq3Var, 0);
            default:
                return new q1i(r1iVar, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((q1i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        yzc yzcVar;
        List<Stage> list;
        Stage stage;
        Stage stage2;
        yzc yzcVar2;
        int i = this.r;
        int i2 = this.v;
        r1i r1iVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    yzc yzcVar3 = r1iVar.n;
                    s96 s96Var = r1iVar.e;
                    this.s = yzcVar3;
                    this.t = 1;
                    Object z = s96Var.z(i2, this);
                    if (z == lu3Var) {
                        break;
                    } else {
                        obj = z;
                        yzcVar = yzcVar3;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzcVar = this.s;
                    y6a.M(obj);
                }
                StageResponse stageResponse = (StageResponse) obj;
                if (stageResponse == null || (stage = stageResponse.getStage()) == null || (list = r1i.k(stage)) == null) {
                    list = null;
                } else {
                    for (Stage stage3 : list) {
                        List<Stage> substages = stage3.getSubstages();
                        if (substages != null) {
                            joa joaVar = l5i.a;
                            stage2 = l5i.e(substages);
                        } else {
                            stage2 = null;
                        }
                        stage3.setCurrentSubstage(stage2);
                    }
                }
                yzcVar.j(list);
                r1iVar.q = null;
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    yzc yzcVar4 = r1iVar.l;
                    s96 s96Var2 = r1iVar.e;
                    this.s = yzcVar4;
                    this.t = 1;
                    Object Q = s96Var2.Q(i2, this);
                    if (Q == lu3Var2) {
                        break;
                    } else {
                        obj = Q;
                        yzcVar2 = yzcVar4;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzcVar2 = this.s;
                    y6a.M(obj);
                }
                StageSportSeasonsResponse stageSportSeasonsResponse = (StageSportSeasonsResponse) obj;
                List<StageSeason> seasons = stageSportSeasonsResponse != null ? stageSportSeasonsResponse.getSeasons() : null;
                if (seasons == null) {
                    seasons = km5.a;
                }
                yzcVar2.j(seasons);
                r1iVar.p = null;
                break;
        }
        return Unit.a;
    }
}
