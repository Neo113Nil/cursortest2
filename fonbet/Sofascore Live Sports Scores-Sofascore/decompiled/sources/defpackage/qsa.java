package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qsa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ CoroutineContext t;
    public final /* synthetic */ osa u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsa(CoroutineContext coroutineContext, osa osaVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = coroutineContext;
        this.u = osaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new qsa(this.t, this.u, rq3Var, 0);
            default:
                return new qsa(this.t, this.u, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qsa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.a(r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (defpackage.xw3.R(r3, r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r8 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (defpackage.xw3.R(r3, r9, r8) == r0) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        CoroutineContext coroutineContext = this.t;
        osa osaVar = this.u;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!Intrinsics.c(coroutineContext, g.a)) {
                        psa psaVar = new psa(osaVar, rq3Var, 0);
                        this.s = 2;
                        break;
                    } else {
                        this.s = 1;
                        Object c0 = fcp.c0(osaVar.a, new yp7(osaVar, rq3Var, 21), this);
                        if (c0 != obj2) {
                            c0 = Unit.a;
                            break;
                        }
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!Intrinsics.c(coroutineContext, g.a)) {
                        psa psaVar2 = new psa(osaVar, rq3Var, i2);
                        this.s = 2;
                        break;
                    } else {
                        this.s = 1;
                        break;
                    }
                } else if (i4 != 1 && i4 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
