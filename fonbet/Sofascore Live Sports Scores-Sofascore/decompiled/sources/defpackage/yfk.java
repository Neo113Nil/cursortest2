package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yfk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ agk t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfk(agk agkVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = agkVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        agk agkVar = this.t;
        switch (i) {
            case 0:
                return new yfk(agkVar, rq3Var, 0);
            case 1:
                return new yfk(agkVar, rq3Var, 1);
            case 2:
                return new yfk(agkVar, rq3Var, 2);
            default:
                return new yfk(agkVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((yfk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return ((yfk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        if (defpackage.fcp.c0(r8, r2, r7) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (r8 == r0) goto L47;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        agk agkVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    jof jofVar = agkVar.h.g;
                    iz2 z = un0.z(agkVar);
                    this.s = 1;
                    obj = un0.L(jofVar, z, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
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
                vki vkiVar = new vki(agkVar, rq3Var, 27);
                xdhVar.getClass();
                this.s = 2;
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object k = agkVar.k(this);
                    return k == lu3Var2 ? lu3Var2 : k;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar = agkVar.g;
                String str = (String) agkVar.i.a("OPEN_PROFILE_ID");
                if (str == null) {
                    str = agkVar.e.b().getId();
                }
                this.s = 1;
                Object e = dhkVar.e(str, this);
                return e == lu3Var3 ? lu3Var3 : e;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    bli bliVar = agkVar.h;
                    this.s = 1;
                    if (bliVar.j(this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
