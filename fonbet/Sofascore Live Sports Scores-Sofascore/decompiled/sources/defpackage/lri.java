package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lri extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lri(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new lri(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lri(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            int i2 = obm.D;
            obm obmVar = this.s;
            fdi fdiVar = ((ilm) obmVar.getViewModel()).W;
            eag eagVar = new eag(obmVar, null);
            this.r = 1;
            if (fcp.c0(fdiVar, eagVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
