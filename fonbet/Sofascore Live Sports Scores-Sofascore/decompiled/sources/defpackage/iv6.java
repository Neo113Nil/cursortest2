package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iv6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ c51 s;
    public final /* synthetic */ qug t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv6(c51 c51Var, qug qugVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = c51Var;
        this.t = qugVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qug qugVar = this.t;
        c51 c51Var = this.s;
        switch (i) {
            case 0:
                return new iv6(c51Var, qugVar, rq3Var, 0);
            case 1:
                return new iv6(c51Var, qugVar, rq3Var, 1);
            case 2:
                return new iv6(c51Var, qugVar, rq3Var, 2);
            case 3:
                return new iv6(c51Var, qugVar, rq3Var, 3);
            case 4:
                return new iv6(c51Var, qugVar, rq3Var, 4);
            case 5:
                return new iv6(c51Var, qugVar, rq3Var, 5);
            default:
                return new iv6(c51Var, qugVar, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((iv6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qug qugVar = this.t;
        c51 c51Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
            default:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                c51Var.invoke(Boolean.valueOf(qugVar.a.h() > 0));
                break;
        }
        return Unit.a;
    }
}
