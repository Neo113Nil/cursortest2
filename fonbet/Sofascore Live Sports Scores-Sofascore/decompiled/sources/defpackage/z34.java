package defpackage;

import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z34 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ CrowdsourcingIncidentDetailsFullScreenDialog s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z34(CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = crowdsourcingIncidentDetailsFullScreenDialog;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new z34(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z34) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = this.s;
        if (i == 0) {
            y6a.M(obj);
            hof hofVar = ((tr3) crowdsourcingIncidentDetailsFullScreenDialog.A.getValue()).w;
            this.r = 1;
            obj = rd0.y(hofVar, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        k24 k24Var = (k24) obj;
        q54 v = crowdsourcingIncidentDetailsFullScreenDialog.v();
        k24Var.getClass();
        xw3.L(un0.z(v), null, null, new i54(v, k24Var, null), 3);
        su suVar = crowdsourcingIncidentDetailsFullScreenDialog.r;
        suVar.a = new Integer(k24Var.a.a);
        suVar.b = k24Var.b.b != null ? "edit" : "add";
        return Unit.a;
    }
}
