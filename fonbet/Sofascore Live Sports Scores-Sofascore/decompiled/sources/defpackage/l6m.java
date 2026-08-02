package defpackage;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l6m extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ sqm v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6m(String str, String str2, String str3, sqm sqmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = sqmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new l6m(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l6m) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            vym vymVar = vym.a;
            this.r = 1;
            obj = vymVar.c(this.s, this.t, this.u, this);
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
        a9m a9mVar = (a9m) obj;
        if (a9mVar instanceof qbm) {
            sqm sqmVar = this.v;
            sqmVar.getClass();
            n4m D = sqmVar.D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.b) {
                ysm.c(sqmVar, EventActionName.INTERACTION_ANSWER, ysm.createMomentPlayerInteractionProps$default(sqmVar, (gim.b) gimVar, null, 2, null));
            }
        }
        return Unit.a;
    }
}
