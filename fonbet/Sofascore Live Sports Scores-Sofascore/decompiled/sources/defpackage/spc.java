package defpackage;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class spc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vpc t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spc(vpc vpcVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = vpcVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        vpc vpcVar = this.t;
        switch (i) {
            case 0:
                return new spc(vpcVar, i2, rq3Var, 0);
            case 1:
                return new spc(vpcVar, i2, rq3Var, 1);
            default:
                return new spc(vpcVar, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((spc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        vpc vpcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                wqc wqcVar = vpcVar.e;
                String lowerCase = "LIVE".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                this.s = 1;
                Object b = wqcVar.b(i2, 0, this, lowerCase);
                return b == lu3Var ? lu3Var : b;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wqc wqcVar2 = vpcVar.e;
                String t6eVar = t6e.b.toString();
                this.s = 1;
                Object b2 = wqcVar2.b(i2, 0, this, t6eVar);
                return b2 == lu3Var2 ? lu3Var2 : b2;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wqc wqcVar3 = vpcVar.e;
                String I = z8e.I(Calendar.getInstance());
                this.s = 1;
                Object c = wqcVar3.c(i2, I, this);
                return c == lu3Var3 ? lu3Var3 : c;
        }
    }
}
