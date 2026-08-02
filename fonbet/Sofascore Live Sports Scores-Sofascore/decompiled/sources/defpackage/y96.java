package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y96 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Throwable s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y96(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        rq3 rq3Var = (rq3) obj3;
        switch (this.r) {
            case 0:
                y96 y96Var = new y96(3, rq3Var, 0);
                y96Var.s = th;
                return y96Var.invokeSuspend(Unit.a);
            default:
                y96 y96Var2 = new y96(3, rq3Var, 1);
                y96Var2.s = th;
                return y96Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Throwable th = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                s38.a().c(new Exception("DB inconsistency for Event", th));
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                s38.a().c(new Exception("DB inconsistency for Stage", th));
                break;
        }
        return Unit.a;
    }
}
