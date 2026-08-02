package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class thf extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ whf t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ thf(whf whfVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = whfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        whf whfVar = this.t;
        switch (i) {
            case 0:
                return new thf(whfVar, rq3Var, 0);
            case 1:
                return new thf(whfVar, rq3Var, 1);
            default:
                return new thf(whfVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((thf) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.n1(r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1.o1(r7) == r0) goto L18;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        whf whfVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    xhf xhfVar = whfVar.t;
                    float f = whfVar.q ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.s = 1;
                    Object f2 = xhfVar.a.f(this, new Float(f));
                    if (f2 != lu3Var) {
                        f2 = Unit.a;
                    }
                    if (f2 == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!whfVar.t.a.e()) {
                        xhf xhfVar2 = whfVar.t;
                        float h = whfVar.w.h() / whfVar.q1();
                        this.s = 1;
                        Object f3 = xhfVar2.a.f(this, new Float(h));
                        if (f3 != lu3Var2) {
                            f3 = Unit.a;
                        }
                        if (f3 == lu3Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!whfVar.q) {
                        this.s = 1;
                        break;
                    } else {
                        this.s = 2;
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
