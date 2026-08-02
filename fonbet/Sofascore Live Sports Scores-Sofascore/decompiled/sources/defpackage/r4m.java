package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r4m extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ c1m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4m(c1m c1mVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = c1mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        r4m r4mVar = new r4m(this.t, rq3Var);
        r4mVar.s = obj;
        return r4mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r4m r4mVar = new r4m(this.t, (rq3) obj2);
        r4mVar.s = (b98) obj;
        return r4mVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (defpackage.fcp.g0(r1, (defpackage.z88) r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b98 b98Var;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            b98Var = (b98) this.s;
            pc2 pc2Var = this.t.I;
            this.s = b98Var;
            this.r = 1;
            obj = pc2Var.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b98Var = (b98) this.s;
            y6a.M(obj);
        }
        this.s = null;
        this.r = 2;
    }
}
