package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tci extends hoi implements ct8 {
    public int r;
    public /* synthetic */ b98 s;
    public /* synthetic */ int t;
    public final /* synthetic */ uci u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tci(uci uciVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.u = uciVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        tci tciVar = new tci(this.u, (rq3) obj3);
        tciVar.s = (b98) obj;
        tciVar.t = intValue;
        return tciVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r3.emit(r15, r14) != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (defpackage.n4o.y(r1, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (defpackage.n4o.y(r12, r14) == r5) goto L34;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uci uciVar = this.u;
        long j = uciVar.b;
        b98 b98Var = this.s;
        int i = this.t;
        lu3 lu3Var = lu3.a;
        int i2 = this.r;
        if (i2 == 0) {
            y6a.M(obj);
            if (i > 0) {
                veh vehVar = veh.a;
                this.s = null;
                this.t = i;
                this.r = 1;
            } else {
                long j2 = uciVar.a;
                this.s = b98Var;
                this.t = i;
                this.r = 2;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y6a.M(obj);
                if (j > 0) {
                    veh vehVar2 = veh.b;
                    this.s = b98Var;
                    this.t = i;
                    this.r = 3;
                }
                veh vehVar3 = veh.c;
                this.s = null;
                this.t = i;
                this.r = 5;
            } else if (i2 == 3) {
                y6a.M(obj);
                this.s = b98Var;
                this.t = i;
                this.r = 4;
            } else if (i2 == 4) {
                y6a.M(obj);
                veh vehVar32 = veh.c;
                this.s = null;
                this.t = i;
                this.r = 5;
            } else if (i2 != 5) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        y6a.M(obj);
        return Unit.a;
    }
}
