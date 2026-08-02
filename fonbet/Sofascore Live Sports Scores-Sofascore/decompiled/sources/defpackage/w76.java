package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w76 extends hoi implements Function2 {
    public Stage r;
    public s96 s;
    public boolean t;
    public int u;
    public int v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ s96 x;
    public final /* synthetic */ Stage y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w76(boolean z, s96 s96Var, Stage stage, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = z;
        this.x = s96Var;
        this.y = stage;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new w76(this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w76) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        s96 s96Var;
        Stage stage;
        int i;
        boolean z;
        Stage stage2;
        lu3 lu3Var = lu3.a;
        int i2 = this.v;
        rq3 rq3Var = null;
        if (i2 == 0) {
            y6a.M(obj);
            s96Var = this.x;
            boolean z2 = this.w;
            NetworkCoroutineAPI networkCoroutineAPI = z2 ? s96Var.a : s96Var.b;
            stage = this.y;
            Stage stageParent = stage.getStageParent();
            if (stageParent != null && stage.getId() == stageParent.getId()) {
                return stage;
            }
            Stage stageParent2 = stage.getStageParent();
            if (stageParent2 != null) {
                cl clVar = new cl(networkCoroutineAPI, stageParent2, rq3Var, 11);
                this.r = stage;
                this.s = s96Var;
                this.t = z2;
                i = 0;
                this.u = 0;
                this.v = 1;
                Object P = yaa.P(clVar, this);
                if (P != lu3Var) {
                    z = z2;
                    obj = P;
                }
                return lu3Var;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            stage2 = this.r;
            y6a.M(obj);
            stage2.setStageParent((Stage) obj);
            return stage2;
        }
        i = this.u;
        z = this.t;
        s96Var = this.s;
        stage = this.r;
        y6a.M(obj);
        x2g x2gVar = (x2g) obj;
        if (x2gVar instanceof v2g) {
            Stage stage3 = ((StageResponse) ((v2g) x2gVar).a).getStage();
            if (stage3.getType() == ServerType.SEASON) {
                stage.setStageParent(stage3);
                return stage;
            }
            this.r = stage;
            this.s = null;
            this.u = i;
            this.v = 2;
            obj = s96Var.a(stage3, z, this);
            if (obj != lu3Var) {
                stage2 = stage;
                stage2.setStageParent((Stage) obj);
                return stage2;
            }
            return lu3Var;
        }
        return null;
    }
}
