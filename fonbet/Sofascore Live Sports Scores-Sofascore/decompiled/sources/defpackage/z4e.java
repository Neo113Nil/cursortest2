package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z4e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ a5e s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4e(a5e a5eVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = a5eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        a5e a5eVar = this.s;
        switch (i) {
            case 0:
                return new z4e(a5eVar, rq3Var, 0);
            default:
                return new z4e(a5eVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((z4e) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        a5e a5eVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                a5eVar.g.d(new Integer(0));
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                a5eVar.f.d(new Integer(0));
                break;
        }
        return Unit.a;
    }
}
