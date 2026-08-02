package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oc2 extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc2(long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        oc2 oc2Var = new oc2(this.t, rq3Var);
        oc2Var.s = obj;
        return oc2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oc2 oc2Var = new oc2(this.t, (rq3) obj2);
        oc2Var.s = (ku3) obj;
        return oc2Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (defpackage.n4o.y(r4.t, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (defpackage.ljd.b(r5, r4) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.s;
            ljd ljdVar = ljd.a;
            this.r = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        this.r = 2;
    }
}
