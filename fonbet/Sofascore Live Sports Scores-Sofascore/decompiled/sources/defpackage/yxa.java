package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yxa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ aya t;
    public final /* synthetic */ int u;
    public final /* synthetic */ rxa v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxa(aya ayaVar, int i, rxa rxaVar, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = ayaVar;
        this.u = i;
        this.v = rxaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new yxa(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new yxa(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((yxa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rxa rxaVar = this.v;
        int i2 = this.u;
        aya ayaVar = this.t;
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
                int i4 = rxaVar.a;
                this.s = 1;
                Object a = ayaVar.a(i2, i4, this);
                return a == lu3Var ? lu3Var : a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new xxa(i2, null, rxaVar, ayaVar), this);
                    return r == lu3Var2 ? lu3Var2 : r;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
