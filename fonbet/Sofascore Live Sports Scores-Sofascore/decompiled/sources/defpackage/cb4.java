package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cb4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb4(rq3 rq3Var, Function1 function1, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Function1 function1 = this.t;
        switch (i) {
            case 0:
                cb4 cb4Var = new cb4(rq3Var, function1, 0);
                cb4Var.s = obj;
                return cb4Var;
            case 1:
                cb4 cb4Var2 = new cb4(rq3Var, function1, 1);
                cb4Var2.s = obj;
                return cb4Var2;
            case 2:
                cb4 cb4Var3 = new cb4(function1, rq3Var, 2);
                cb4Var3.s = obj;
                return cb4Var3;
            default:
                cb4 cb4Var4 = new cb4(function1, rq3Var, 3);
                cb4Var4.s = obj;
                return cb4Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((cb4) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function1 function1 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                mae maeVar = (mae) this.s;
                maeVar.getClass();
                return function1.invoke(maeVar.d());
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                mae maeVar2 = (mae) this.s;
                maeVar2.getClass();
                return function1.invoke(maeVar2.d());
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                function1.invoke((p0d) this.s);
                return Unit.a;
            default:
                p0d p0dVar = (p0d) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return function1.invoke(p0dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb4(Function1 function1, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = function1;
    }
}
