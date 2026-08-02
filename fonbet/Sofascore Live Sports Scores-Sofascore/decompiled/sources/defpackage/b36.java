package defpackage;

import com.sofascore.model.network.response.TeamStreaksResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b36 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ c36 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b36(c36 c36Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = c36Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        c36 c36Var = this.t;
        switch (i) {
            case 0:
                return new b36(c36Var, i2, rq3Var, 0);
            case 1:
                return new b36(c36Var, i2, rq3Var, 1);
            default:
                return new b36(c36Var, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((b36) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        c36 c36Var = this.t;
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
                j0j j0jVar = c36Var.g;
                this.s = 1;
                j0jVar.getClass();
                Object P = yaa.P(new lh7(j0jVar, this.u, "last", 0, (rq3) null, 7), this);
                return P == lu3Var ? lu3Var : P;
            case 1:
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
                j0j j0jVar2 = c36Var.g;
                this.s = 1;
                j0jVar2.getClass();
                Object P2 = yaa.P(new lh7(j0jVar2, this.u, "next", 0, (rq3) null, 7), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    j0j j0jVar3 = c36Var.g;
                    this.s = 1;
                    j0jVar3.getClass();
                    obj = yaa.P(new azi(j0jVar3, this.u, null, 17), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    return (TeamStreaksResponse) ((v2g) x2gVar).a;
                }
                return null;
        }
    }
}
