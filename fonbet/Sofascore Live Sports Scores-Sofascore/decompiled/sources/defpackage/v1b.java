package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v1b extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1b(int i, int i2, rq3 rq3Var, w3b w3bVar) {
        super(2, rq3Var);
        this.r = i2;
        this.t = w3bVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new v1b(this.u, 0, rq3Var, this.t);
            default:
                return new v1b(this.u, 1, rq3Var, this.t);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((v1b) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        w3b w3bVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i2, 7, null, w3bVar);
                    this.s = 1;
                    obj = yaa.P(d0bVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    d0b d0bVar2 = new d0b(i2, 8, null, w3bVar);
                    this.s = 1;
                    obj = yaa.P(d0bVar2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar2 = (x2g) obj;
                x2gVar2.getClass();
                return Boolean.valueOf(x2gVar2 instanceof v2g);
        }
    }
}
