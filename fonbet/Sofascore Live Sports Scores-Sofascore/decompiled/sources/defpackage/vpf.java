package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vpf extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ ghe t;
    public final /* synthetic */ ct8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpf(ct8 ct8Var, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.u = ct8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        ct8 ct8Var = this.u;
        ghe gheVar = (ghe) obj;
        switch (i) {
            case 0:
                vpf vpfVar = new vpf(ct8Var, (rq3) obj3, 0);
                vpfVar.t = gheVar;
                return vpfVar.invokeSuspend(Unit.a);
            case 1:
                vpf vpfVar2 = new vpf(ct8Var, (rq3) obj3, 1);
                vpfVar2.t = gheVar;
                return vpfVar2.invokeSuspend(Unit.a);
            default:
                vpf vpfVar3 = new vpf(ct8Var, (rq3) obj3, 2);
                vpfVar3.t = gheVar;
                return vpfVar3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r14 == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r15 != r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        if (r14 == r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c4, code lost:
    
        if (r15 != r6) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, rq3, vpf] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, vpf] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, vpf] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [ct8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ghe] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ghe] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ?? r2 = this.u;
        ?? r3 = "call to 'resume' before 'invoke' with coroutine";
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                try {
                } catch (Throwable th) {
                    xj9 c = ((xh9) r3.a).c();
                    this.t = null;
                    this.s = 2;
                    obj = r2.invoke(c, th, this);
                    break;
                }
                if (i2 == 0) {
                    y6a.M(obj);
                    ghe gheVar = this.t;
                    this.t = gheVar;
                    this.s = 1;
                    Object c2 = gheVar.c(this);
                    r3 = gheVar;
                    this = c2;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Throwable th2 = (Throwable) obj;
                        if (th2 != null) {
                            throw th2;
                        }
                        return Unit.a;
                    }
                    ghe gheVar2 = this.t;
                    y6a.M(obj);
                    r3 = gheVar2;
                    this = this;
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                try {
                } catch (Throwable th3) {
                    yj9 yj9Var = (yj9) r3.a;
                    bjb bjbVar = sh9.a;
                    rh9 rh9Var = new rh9(yj9Var);
                    this.t = null;
                    this.s = 2;
                    obj = r2.invoke(rh9Var, th3, this);
                    break;
                }
                if (i3 == 0) {
                    y6a.M(obj);
                    ghe gheVar3 = this.t;
                    this.t = gheVar3;
                    this.s = 1;
                    Object c3 = gheVar3.c(this);
                    r3 = gheVar3;
                    this = c3;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Throwable th4 = (Throwable) obj;
                        if (th4 != null) {
                            throw th4;
                        }
                        return Unit.a;
                    }
                    ghe gheVar4 = this.t;
                    y6a.M(obj);
                    r3 = gheVar4;
                    this = this;
                }
                return Unit.a;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ghe gheVar5 = this.t;
                    Object obj2 = gheVar5.a;
                    i43 i43Var = new i43(1, gheVar5, ghe.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 5);
                    this.s = 1;
                    if (r2.invoke(obj2, i43Var, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
