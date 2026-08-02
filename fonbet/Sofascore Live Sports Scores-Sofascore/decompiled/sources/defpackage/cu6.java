package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cu6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu6(boolean z, boolean z2, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.t = z;
        this.u = z2;
        this.v = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new cu6(this.t, this.u, (e1d) obj2, rq3Var);
            case 1:
                return new cu6((njb) obj2, this.t, this.u, rq3Var, 1);
            default:
                return new cu6((bfk) obj2, this.t, this.u, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((cu6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (((defpackage.bfk) r14).d(r16) == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (defpackage.bfk.e((defpackage.bfk) r14, r1, null, null, null, null, null, null, null, null, r16, 8190) == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r0.d(r16) == r15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (defpackage.bfk.e(r0, r1, null, null, null, null, null, null, null, null, r16, 8190) == r15) goto L33;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        boolean z = this.u;
        boolean z2 = this.t;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                e1d e1dVar = (e1d) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    e1dVar.setValue(Boolean.valueOf(z2));
                    if (!z) {
                        wd5 wd5Var = xd5.b;
                        long R = wkn.R(3, be5.SECONDS);
                        this.s = 1;
                        if (n4o.z(R, this) == lu3Var) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                e1dVar.setValue(Boolean.FALSE);
            case 1:
                njb njbVar = (njb) obj2;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    bfk bfkVar = njbVar.f;
                    Boolean valueOf = Boolean.valueOf(z2);
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                if (z) {
                    bfk bfkVar2 = njbVar.f;
                    this.s = 2;
                    break;
                }
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    this.s = 1;
                    break;
                } else if (i4 == 1) {
                    y6a.M(obj);
                } else if (i4 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                if (z) {
                    this.s = 2;
                    break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu6(Object obj, boolean z, boolean z2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.t = z;
        this.u = z2;
    }
}
