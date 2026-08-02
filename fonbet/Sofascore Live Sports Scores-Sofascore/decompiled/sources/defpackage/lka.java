package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lka extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;

    public lka(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        lka lkaVar = new lka(rq3Var);
        lkaVar.s = obj;
        return lkaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lka lkaVar = new lka((rq3) obj2);
        lkaVar.s = (ku3) obj;
        return lkaVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r1.Z(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7.Z(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r7.a(r6) == r0) goto L20;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        yda L;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ku3Var = (ku3) this.s;
            bwm bwmVar = bwm.a;
            this.s = ku3Var;
            this.r = 1;
        } else if (i == 1) {
            ku3Var = (ku3) this.s;
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            L = (yda) this.s;
            y6a.M(obj);
            this.s = null;
            this.r = 3;
        }
        g9i L2 = xw3.L(ku3Var, null, null, new dia(null), 3);
        L = xw3.L(ku3Var, null, null, new cda(null), 3);
        this.s = L;
        this.r = 2;
    }
}
