package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gkj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hkj s;
    public final /* synthetic */ yy0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkj(hkj hkjVar, yy0 yy0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = hkjVar;
        this.t = yy0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yy0 yy0Var = this.t;
        hkj hkjVar = this.s;
        switch (i) {
            case 0:
                return new gkj(hkjVar, yy0Var, rq3Var, 0);
            default:
                return new gkj(hkjVar, yy0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((gkj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        yy0 yy0Var = this.t;
        hkj hkjVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return inb.w(hkjVar.a, pco.R(((my0) yy0Var).a));
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return inb.w(hkjVar.a, pco.R(((my0) yy0Var).b));
        }
    }
}
