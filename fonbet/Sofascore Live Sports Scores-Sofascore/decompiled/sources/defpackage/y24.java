package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y24 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y24(Function1 function1, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = function1;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        e1d e1dVar = this.t;
        Function1 function1 = this.s;
        switch (i) {
            case 0:
                return new y24(function1, e1dVar, rq3Var, 0);
            default:
                return new y24(function1, e1dVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((y24) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        os5 os5Var;
        int i = this.r;
        e1d e1dVar = this.t;
        Function1 function1 = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                function1.invoke(e1dVar.getValue());
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                vnb vnbVar = (vnb) e1dVar.getValue();
                unb unbVar = vnbVar instanceof unb ? (unb) vnbVar : null;
                if (unbVar != null && (os5Var = (os5) unbVar.a) != null) {
                    if (!(os5Var instanceof ms5)) {
                        if (!os5Var.equals(ls5.a) && !(os5Var instanceof ns5)) {
                            zzl.b();
                            break;
                        } else {
                            function1.invoke(Boolean.FALSE);
                        }
                    } else {
                        function1.invoke(Boolean.TRUE);
                    }
                    break;
                } else {
                    break;
                }
        }
        return Unit.a;
    }
}
