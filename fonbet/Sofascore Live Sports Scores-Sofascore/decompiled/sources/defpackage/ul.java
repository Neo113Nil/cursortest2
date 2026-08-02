package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ul extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ ghe t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ct8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(ct8 ct8Var, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = ct8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        ct8 ct8Var = this.v;
        ghe gheVar = (ghe) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                ul ulVar = new ul(ct8Var, rq3Var, 0);
                ulVar.t = gheVar;
                ulVar.u = obj2;
                return ulVar.invokeSuspend(Unit.a);
            default:
                ul ulVar2 = new ul(ct8Var, rq3Var, 1);
                ulVar2.t = gheVar;
                ulVar2.u = obj2;
                return ulVar2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r1.d(r8, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r1.d(r8, r9) == r0) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ghe gheVar;
        ghe gheVar2;
        int i = this.r;
        ct8 ct8Var = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ghe gheVar3 = this.t;
                    Object obj2 = this.u;
                    if (!(obj2 instanceof swd)) {
                        break;
                    } else {
                        Object obj3 = gheVar3.a;
                        this.t = gheVar3;
                        this.s = 1;
                        Object invoke = ct8Var.invoke(obj3, obj2, this);
                        if (invoke != lu3Var) {
                            gheVar = gheVar3;
                            obj = invoke;
                        }
                        break;
                    }
                } else if (i2 == 1) {
                    gheVar = this.t;
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                swd swdVar = (swd) obj;
                if (swdVar != null) {
                    this.t = null;
                    this.s = 2;
                    break;
                } else {
                    break;
                }
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ghe gheVar4 = this.t;
                    Object obj4 = this.u;
                    Object obj5 = gheVar4.a;
                    this.t = gheVar4;
                    this.s = 1;
                    Object invoke2 = ct8Var.invoke(obj5, obj4, this);
                    if (invoke2 != lu3Var2) {
                        gheVar2 = gheVar4;
                        obj = invoke2;
                    }
                    break;
                } else if (i3 == 1) {
                    gheVar2 = this.t;
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                swd swdVar2 = (swd) obj;
                if (swdVar2 != null) {
                    this.t = null;
                    this.s = 2;
                    break;
                }
        }
        return Unit.a;
    }
}
