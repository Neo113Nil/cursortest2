package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ef4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qf4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef4(qf4 qf4Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qf4Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qf4 qf4Var = this.t;
        switch (i) {
            case 0:
                return new ef4(qf4Var, rq3Var, 0);
            case 1:
                return new ef4(qf4Var, rq3Var, 1);
            default:
                return new ef4(qf4Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((ef4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r10 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r5.f(r9) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r10.collect(r1, r9) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r0) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qf4 qf4Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (qf4Var.e(this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ujg ujgVar = qf4Var.i;
                    this.s = 1;
                    Object w = ((qa3) ujgVar.c).w(this);
                    if (w != lu3Var2) {
                        w = Unit.a;
                        break;
                    }
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
                z88 W = k53.W(qf4Var.c().c(), -1);
                f10 f10Var = new f10(qf4Var, 6);
                this.s = 2;
                break;
            default:
                sz8 sz8Var = qf4Var.h;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                try {
                    if (i4 == 0) {
                        y6a.M(obj);
                        if (!(sz8Var.t() instanceof e38)) {
                            this.s = 1;
                            break;
                        } else {
                            return sz8Var.t();
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                y6a.M(obj);
                                return (adi) obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    this.s = 2;
                    obj = qf4Var.g(false, this);
                    break;
                } catch (Throwable th) {
                    return new wnf(-1, th);
                }
        }
    }
}
