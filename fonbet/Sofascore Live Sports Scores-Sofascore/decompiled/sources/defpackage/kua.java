package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kua extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nua t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kua(nua nuaVar, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = nuaVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new kua(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new kua(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new kua(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new kua(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((kua) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        nua nuaVar = this.t;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new lua(nuaVar, i3, i2, null), this);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                    if (r == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var = lu3.a;
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
                w3b w3bVar = nuaVar.l;
                this.s = 1;
                Object g0 = w3bVar.g0(i3, i2, this);
                return g0 == lu3Var ? lu3Var : g0;
            case 2:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = nuaVar.l;
                this.s = 1;
                Object r0 = w3bVar2.r0(i3, i2, this);
                return r0 == lu3Var2 ? lu3Var2 : r0;
            default:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = nuaVar.l;
                this.s = 1;
                Object s0 = w3bVar3.s0(i3, i2, this);
                return s0 == lu3Var3 ? lu3Var3 : s0;
        }
    }
}
