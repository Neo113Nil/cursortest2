package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vtl extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ qzf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtl(qzf qzfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = qzfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vtl(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vtl(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vtl vtlVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ssm ssmVar = ssm.a;
            this.r = 1;
            obj = ssmVar.f(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                vtlVar = this;
                String str = (String) ((Pair) obj).a;
                if (str == null) {
                    return null;
                }
                ssm ssmVar2 = ssm.a;
                qzf qzfVar = vtlVar.s;
                qzfVar.getClass();
                pzf b = qzfVar.b();
                b.c("Authorization", "Bearer ".concat(str));
                return new qzf(b);
            }
            y6a.M(obj);
        }
        ssm ssmVar3 = ssm.a;
        this.r = 2;
        vtlVar = this;
        obj = ssm.refreshTokenAndLock$default(ssmVar3, (String) obj, false, vtlVar, 2, null);
    }
}
