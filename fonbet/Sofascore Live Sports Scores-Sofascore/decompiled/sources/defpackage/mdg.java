package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mdg extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Context t;
    public /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mdg(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        Function1 function1 = (Function1) obj2;
        rq3 rq3Var = (rq3) obj3;
        switch (this.r) {
            case 0:
                mdg mdgVar = new mdg(3, rq3Var, 0);
                mdgVar.t = context;
                mdgVar.u = function1;
                return mdgVar.invokeSuspend(Unit.a);
            default:
                mdg mdgVar2 = new mdg(3, rq3Var, 1);
                mdgVar2.t = context;
                mdgVar2.u = function1;
                return mdgVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = 1;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Context context = this.t;
                Function1 function1 = this.u;
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                ldg ldgVar = new ldg(context, function1, rq3Var, 0);
                this.t = null;
                this.s = 1;
                Object R = xw3.R(r69Var, ldgVar, this);
                return R == lu3Var ? lu3Var : R;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Context context2 = this.t;
                Function1 function12 = this.u;
                hs4 hs4Var2 = z45.a;
                r69 r69Var2 = rob.a;
                ldg ldgVar2 = new ldg(context2, function12, rq3Var, i);
                this.t = null;
                this.s = 1;
                Object R2 = xw3.R(r69Var2, ldgVar2, this);
                return R2 == lu3Var2 ? lu3Var2 : R2;
        }
    }
}
