package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class auf extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ buf t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ auf(buf bufVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = bufVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        buf bufVar = this.t;
        switch (i) {
            case 0:
                return new auf(bufVar, rq3Var, 0);
            case 1:
                return new auf(bufVar, rq3Var, 1);
            case 2:
                return new auf(bufVar, rq3Var, 2);
            case 3:
                return new auf(bufVar, rq3Var, 3);
            default:
                return new auf(bufVar, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((auf) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r10.g("referred_user", false, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (defpackage.yaa.P(new defpackage.egk(r10, r6, r7), r9) == r0) goto L16;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 0;
        buf bufVar = this.t;
        rq3 rq3Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    yf4 f = bufVar.m.f(new e5f("referral_show_tooltip"), Boolean.TRUE);
                    ztf ztfVar = new ztf(bufVar, i2);
                    this.s = 1;
                    if (f.collect(ztfVar, this) == lu3Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    yf4 f2 = bufVar.m.f(new e5f("referred_user"), Boolean.FALSE);
                    ztf ztfVar2 = new ztf(bufVar, i3);
                    this.s = 1;
                    if (f2.collect(ztfVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    dhk dhkVar = bufVar.l;
                    String str = bufVar.n;
                    this.s = 1;
                    obj = dhkVar.c(str, this);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                bufVar.k(new rtf((String) obj));
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = bufVar.m;
                    this.s = 1;
                    if (cg4Var.g("referral_show_tooltip", false, this) == lu3Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    dhk dhkVar2 = bufVar.l;
                    this.s = 1;
                    dhkVar2.getClass();
                    break;
                } else if (i8 == 1) {
                    y6a.M(obj);
                } else if (i8 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    bufVar.k(qtf.a);
                    break;
                }
                cg4 cg4Var2 = bufVar.m;
                this.s = 2;
                break;
        }
        return Unit.a;
    }
}
