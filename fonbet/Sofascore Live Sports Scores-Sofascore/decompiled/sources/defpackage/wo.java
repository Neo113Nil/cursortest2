package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wo extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ksa t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(ksa ksaVar, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = ksaVar;
        this.s = i;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        ksa ksaVar = this.t;
        switch (i) {
            case 0:
                return new wo(ksaVar, i2, rq3Var, 0);
            case 1:
                return new wo(ksaVar, i2, rq3Var, 1);
            default:
                return new wo(ksaVar, this.s, i2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((wo) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((wo) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((wo) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (defpackage.v8a.i(r5, r9, defpackage.s02.e0(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7), r8) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0068, code lost:
    
        if (defpackage.ksa.l(r4, r8, r5) == r0) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.r;
        int i2 = this.u;
        ksa ksaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
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
                csa j = ksaVar.j();
                Iterator it = j.k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((dsa) obj2).a == i2) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                dsa dsaVar = (dsa) obj2;
                if (dsaVar != null) {
                    float f = ((dsaVar.p / 2) + dsaVar.o) - (j.m / 2);
                    this.s = 2;
                    break;
                }
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!ksaVar.j.b() && ksaVar.h() != i2) {
                        this.s = 1;
                        if (ksa.l(i2, this, ksaVar) == lu3Var2) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ksaVar.m(this.s, i2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo(ksa ksaVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = ksaVar;
        this.u = i;
    }
}
