package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class udk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ xdk t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udk(xdk xdkVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = xdkVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        xdk xdkVar = this.t;
        switch (i) {
            case 0:
                return new udk(xdkVar, rq3Var, 0);
            default:
                return new udk(xdkVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((udk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            default:
                ((udk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (defpackage.fcp.c0(r8, r1, r7) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r8 == r0) goto L16;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        xdk xdkVar = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    bli bliVar = xdkVar.g;
                    this.s = 1;
                    if (bliVar.j(this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    jof jofVar = xdkVar.g.g;
                    iz2 z = un0.z(xdkVar);
                    this.s = 1;
                    obj = un0.L(jofVar, z, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        a70.r("SharedFlow never completes, this call should never return.");
                        return null;
                    }
                    y6a.M(obj);
                }
                xdh xdhVar = (xdh) obj;
                vdk vdkVar = new vdk(xdkVar, rq3Var, i2);
                xdhVar.getClass();
                this.s = 2;
                break;
        }
    }
}
