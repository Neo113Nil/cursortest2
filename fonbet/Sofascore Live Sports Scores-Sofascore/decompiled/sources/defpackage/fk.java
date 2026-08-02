package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kk t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk(kk kkVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kkVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        kk kkVar = this.t;
        switch (i) {
            case 0:
                return new fk(kkVar, rq3Var, 0);
            default:
                return new fk(kkVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r7 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (defpackage.s9a.r(new defpackage.g2(r1, r3, r4), r7) == r0) goto L29;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        kk kkVar = this.t;
        rq3 rq3Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.s = 2;
                Object r = s9a.r(new jk(kkVar, rq3Var, 0), this);
                if (r != obj2) {
                    r = Unit.a;
                    break;
                }
                break;
            default:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    umd umdVar = kkVar.m;
                    String c = dv3.c();
                    this.s = 1;
                    umdVar.getClass();
                    obj = yaa.P(new cmd(i2, rq3Var, umdVar, c), this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
        }
    }
}
