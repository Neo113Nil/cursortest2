package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nti extends m2g implements Function2 {
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ku3 u;
    public final /* synthetic */ j6f v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ ct8 y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nti(ku3 ku3Var, j6f j6fVar, Function1 function1, Function1 function12, ct8 ct8Var, Function1 function13, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = ku3Var;
        this.v = j6fVar;
        this.w = function1;
        this.x = function12;
        this.y = ct8Var;
        this.z = function13;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        nti ntiVar = new nti(this.u, this.v, this.w, this.x, this.y, this.z, rq3Var);
        ntiVar.t = obj;
        return ntiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nti) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            noi noiVar = (noi) this.t;
            this.s = 1;
            if (rti.g(noiVar, this.u, this.v, this.w, this.x, this.y, this.z, this) == lu3Var) {
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
