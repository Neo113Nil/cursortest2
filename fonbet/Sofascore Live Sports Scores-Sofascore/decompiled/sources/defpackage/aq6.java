package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aq6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ cq6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq6(cq6 cq6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = cq6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        cq6 cq6Var = this.t;
        switch (i) {
            case 0:
                return new aq6(cq6Var, rq3Var, 0);
            case 1:
                return new aq6(cq6Var, rq3Var, 1);
            default:
                return new aq6(cq6Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((aq6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r3.j(r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r10 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r10 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r10 == r0) goto L35;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 2;
        cq6 cq6Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var = cq6Var.f;
                int i4 = cq6Var.h.c.c;
                this.s = 1;
                Object X = wi7Var.X(i4, this);
                return X == lu3Var ? lu3Var : X;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = cq6Var.f;
                    int i6 = cq6Var.h.c.c;
                    this.s = 1;
                    obj = wi7Var2.i(i6, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.H0((Iterable) obj, new v66(i2));
            default:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    if (cq6Var.m.getValue() == null) {
                        this.s = 1;
                        Object r = s9a.r(new jk(cq6Var, rq3Var, 9), this);
                        if (r != lu3Var3) {
                            r = Unit.a;
                            break;
                        }
                    }
                } else if (i7 == 1) {
                    y6a.M(obj);
                } else if (i7 == 2) {
                    y6a.M(obj);
                    this.s = 3;
                    obj = s9a.r(new rh4(cq6Var, (List) obj, rq3Var, 22), this);
                    break;
                } else if (i7 == 3) {
                    y6a.M(obj);
                    cq6Var.i.k((List) obj);
                    fdi fdiVar = cq6Var.q;
                    Boolean bool = Boolean.FALSE;
                    fdiVar.getClass();
                    fdiVar.m(null, bool);
                    this.s = 4;
                    break;
                } else {
                    if (i7 == 4) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.s = 2;
                fo1 fo1Var = (fo1) cq6Var.o.getValue();
                obj = cq6Var.k(fo1Var != null ? Integer.valueOf(fo1Var.a) : null, this);
                break;
        }
    }
}
