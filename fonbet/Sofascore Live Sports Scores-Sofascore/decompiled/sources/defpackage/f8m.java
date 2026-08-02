package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f8m extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ s1m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8m(s1m s1mVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = s1mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        f8m f8mVar = new f8m(this.t, rq3Var);
        f8mVar.s = obj;
        return f8mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f8m f8mVar = new f8m(this.t, (rq3) obj2);
        f8mVar.s = (ku3) obj;
        return f8mVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        Object invoke;
        ku3 ku3Var2;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        s1m s1mVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            ku3Var = (ku3) this.s;
            Function2 function2 = s1mVar.b;
            Long l = new Long(s1mVar.c);
            this.s = ku3Var;
            this.r = 1;
            invoke = function2.invoke(l, this);
            if (invoke == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ku3Var2 = (ku3) this.s;
                y6a.M(obj);
                String str = s1mVar.a;
                ku3Var2.getClass();
                return Unit.a;
            }
            ku3 ku3Var3 = (ku3) this.s;
            y6a.M(obj);
            invoke = obj;
            ku3Var = ku3Var3;
        }
        this.s = ku3Var;
        this.r = 2;
        if (((yda) invoke).Z(this) != lu3Var) {
            ku3Var2 = ku3Var;
            String str2 = s1mVar.a;
            ku3Var2.getClass();
            return Unit.a;
        }
        return lu3Var;
    }
}
