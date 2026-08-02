package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nnk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ onk t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnk(onk onkVar, int i, String str, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = onkVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new nnk(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new nnk(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nnk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        onk onkVar = this.t;
        switch (i) {
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
                unk unkVar = onkVar.e;
                String t6eVar = t6e.a.toString();
                this.s = 1;
                Object b = unkVar.b(this.u, 0, this, this.v, t6eVar);
                return b == lu3Var ? lu3Var : b;
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
                unk unkVar2 = onkVar.e;
                String t6eVar2 = t6e.b.toString();
                this.s = 1;
                Object b2 = unkVar2.b(this.u, 0, this, this.v, t6eVar2);
                return b2 == lu3Var2 ? lu3Var2 : b2;
        }
    }
}
