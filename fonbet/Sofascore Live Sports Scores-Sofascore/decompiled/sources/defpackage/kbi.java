package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kbi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public av4 s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rbi v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbi(rbi rbiVar, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.v = rbiVar;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                kbi kbiVar = new kbi(this.v, this.w, this.x, rq3Var, 0);
                kbiVar.u = obj;
                return kbiVar;
            default:
                kbi kbiVar2 = new kbi(this.v, this.w, this.x, rq3Var, 1);
                kbiVar2.u = obj;
                return kbiVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((kbi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r0 == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r3 == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r0 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r3 == r8) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        Object T;
        av4 t2;
        Object w2;
        Object T2;
        boolean z = false;
        switch (this.r) {
            case 0:
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var = lu3.a;
                int i = this.t;
                rq3 rq3Var = null;
                if (i == 0) {
                    y6a.M(obj);
                    rbi rbiVar = this.v;
                    int i2 = this.w;
                    int i3 = this.x;
                    av4 t3 = xw3.t(ku3Var, null, new jbi(rbiVar, i2, i3, rq3Var, 1), 3);
                    t = xw3.t(ku3Var, null, new jbi(rbiVar, i2, i3, rq3Var, 0), 3);
                    this.u = null;
                    this.s = t;
                    this.t = 1;
                    w = t3.w(this);
                    break;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        T = obj;
                        if (((Boolean) T).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    t = this.s;
                    y6a.M(obj);
                    w = obj;
                }
                if (((Boolean) w).booleanValue()) {
                    this.u = null;
                    this.s = null;
                    this.t = 2;
                    T = t.T(this);
                    break;
                }
                return Boolean.valueOf(z);
            default:
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                rq3 rq3Var2 = null;
                if (i4 == 0) {
                    y6a.M(obj);
                    rbi rbiVar2 = this.v;
                    int i5 = this.w;
                    int i6 = this.x;
                    av4 t4 = xw3.t(ku3Var2, null, new jbi(rbiVar2, i5, i6, rq3Var2, 3), 3);
                    t2 = xw3.t(ku3Var2, null, new jbi(rbiVar2, i5, i6, rq3Var2, 2), 3);
                    this.u = null;
                    this.s = t2;
                    this.t = 1;
                    w2 = t4.w(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        T2 = obj;
                        if (((Boolean) T2).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    t2 = this.s;
                    y6a.M(obj);
                    w2 = obj;
                }
                if (((Boolean) w2).booleanValue()) {
                    this.u = null;
                    this.s = null;
                    this.t = 2;
                    T2 = t2.T(this);
                    break;
                }
                return Boolean.valueOf(z);
        }
    }
}
