package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ow extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow(Function0 function0, Function2 function2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = function0;
        this.v = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                ow owVar = new ow(this.u, this.v, rq3Var, 0);
                owVar.t = obj;
                return owVar;
            default:
                ow owVar2 = new ow(this.u, this.v, rq3Var, 1);
                owVar2.t = obj;
                return owVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ow) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function2 function2 = this.v;
        Function0 function0 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.t;
                    fsf fsfVar = new fsf();
                    pog y = sea.y(function0);
                    nw nwVar = new nw(fsfVar, ku3Var, function2, 0);
                    this.s = 1;
                    if (y.collect(nwVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.t;
                    fsf fsfVar2 = new fsf();
                    pog y2 = sea.y(function0);
                    nw nwVar2 = new nw(fsfVar2, ku3Var2, function2, 1);
                    this.s = 1;
                    if (y2.collect(nwVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
