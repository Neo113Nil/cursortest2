package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n05 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ q05 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n05(q05 q05Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = q05Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        q05 q05Var = this.s;
        switch (i) {
            case 0:
                return new n05(q05Var, rq3Var, 0);
            case 1:
                return new n05(q05Var, rq3Var, 1);
            default:
                return new n05(q05Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((n05) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        q05 q05Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                q05Var.l();
                xw3.L(un0.z(q05Var), null, null, new o05(q05Var, null, 1), 3);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                q05Var.i.clearAllTables();
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                q05Var.i().getCacheDir().delete();
                break;
        }
        return Unit.a;
    }
}
