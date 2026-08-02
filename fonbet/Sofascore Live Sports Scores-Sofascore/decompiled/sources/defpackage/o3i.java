package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o3i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q3i t;
    public final /* synthetic */ int u;
    public final /* synthetic */ j5i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3i(q3i q3iVar, int i, j5i j5iVar, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = q3iVar;
        this.u = i;
        this.v = j5iVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new o3i(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new o3i(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o3i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        j5i j5iVar = this.v;
        q3i q3iVar = this.t;
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
                s96 s96Var = q3iVar.e;
                String str = j5iVar.a;
                this.s = 1;
                Object A = s96Var.A(this.u, str, this);
                return A == lu3Var ? lu3Var : A;
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
                s96 s96Var2 = q3iVar.e;
                String str2 = j5iVar.a;
                this.s = 1;
                s96Var2.getClass();
                Object P = yaa.P(new m86(s96Var2, this.u, str2, (rq3) null, 2), this);
                return P == lu3Var2 ? lu3Var2 : P;
        }
    }
}
