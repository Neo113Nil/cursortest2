package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p97 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ cdi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p97(Function1 function1, cdi cdiVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = function1;
        this.t = cdiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        cdi cdiVar = this.t;
        Function1 function1 = this.s;
        switch (i) {
            case 0:
                return new p97(function1, cdiVar, rq3Var, 0);
            case 1:
                return new p97(function1, cdiVar, rq3Var, 1);
            case 2:
                return new p97(function1, cdiVar, rq3Var, 2);
            case 3:
                return new p97(function1, cdiVar, rq3Var, 3);
            default:
                return new p97(function1, cdiVar, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((p97) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        cdi cdiVar = this.t;
        Function1 function1 = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                Boolean bool = (Boolean) cdiVar.getValue();
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Boolean bool2 = (Boolean) cdiVar.getValue();
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                Boolean bool3 = (Boolean) cdiVar.getValue();
                bool3.booleanValue();
                function1.invoke(bool3);
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                Boolean bool4 = (Boolean) cdiVar.getValue();
                bool4.booleanValue();
                function1.invoke(bool4);
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                Boolean bool5 = (Boolean) cdiVar.getValue();
                bool5.booleanValue();
                function1.invoke(bool5);
                break;
        }
        return Unit.a;
    }
}
